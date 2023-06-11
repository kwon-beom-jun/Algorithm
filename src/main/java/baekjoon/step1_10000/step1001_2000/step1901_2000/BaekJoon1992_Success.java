package baekjoon.step1_10000.step1001_2000.step1901_2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1992_Success {
	
	static int N[][];
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		String arr[][] = new String[num][num];
		N = new int[num][num];
		
		boolean zero = true;
		boolean one = true;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.readLine().split("");
			for (int j = 0; j < arr.length; j++) {
				N[i][j] = Integer.parseInt(arr[i][j]);
				if (N[i][j] == 0) {
					one = false;
				} else {
					zero = false;
				}
			}
		}
		
		if (one) {
			System.out.println(1);
		} else if (zero) {
			System.out.println(0);
		} else {
			QuadTree(0, 0, num, num);
		}
		
		System.out.println(sb.toString());
		in.close();
	}
	
	public static void QuadTree(int x, int y, int z, int r) {

		boolean zero = true;
		boolean one = true;

		for (int i = x; i < z; i++) {
			for (int j = y; j < r; j++) {
				if (N[i][j] == 0) {
					one = false;
				} else {
					zero = false;
				}
				if (!one && !zero) {
					break;
				}
			}
		}
		
		if (zero) {
			sb.append(0);
			return;
		} else if (one) {
			sb.append(1);
			return;
		}
		sb.append("(");
		if (z - x == 2) {
			sb.append(N[x][y]+""+N[x][y+1]+""+N[x+1][y]+""+N[x+1][y+1]);
		} else {
			QuadTree(x, y, x + (z-x)/2, y + (r-y)/2);
			QuadTree(x, y + (r-y)/2, x + (z-x)/2, r);
			QuadTree(x + (z-x)/2, y, z, y + (r-y)/2);
			QuadTree(x + (z-x)/2, y + (r-y)/2, z, r);
		}
		sb.append(")");
		
		return;
	}
}
