package baekjoon.step1_10000.step1001_2000.step1901_2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1992_Success_Final {
	
	static char N[][];
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(in.readLine());
		N = new char[size][size];
		String str;
		
		for (int i = 0; i < size; i++) {
			str = in.readLine();
			for (int j = 0; j < size; j++) {
				N[i][j] = str.charAt(j);
			}
		}
		
		QuadTree(0, 0, size);
		
		System.out.println(sb.toString());
		in.close();
	}
	
	public static void QuadTree(int x, int y, int size) {

		boolean check = true;

		int num = N[x][y];
		Loop :
		for (int i = x; i < x+size; i++) {
			for (int j = y; j < y+size; j++) {
				if (num != N[i][j]) {
					check = false;
					break Loop;
				}
			}
		}
		
		if (check) {
			sb.append(N[x][y]);
			return;
		}

		sb.append("(");
		if (size == 2) {
			sb.append(N[x][y]+""+N[x][y+1]+""+N[x+1][y]+""+N[x+1][y+1]);
		} else {
			size = size/2;
			QuadTree(x, y, size);
			QuadTree(x, y + size, size);
			QuadTree(x + size, y, size);
			QuadTree(x + size, y + size, size);
		}
		sb.append(")");

		return;
	}
}
