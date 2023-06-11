package baekjoon.step1_10000.step2001_3000.step2601_2700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2630 {
	
	static int N[][];
	static int cnt;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		N = new int[num][num];
		String arr[] = new String[num];
		
		for (int i = 0; i < num; i++) {
			arr = in.readLine().split(" ");
			for (int j = 0; j < num; j++) {
				N[i][j] = Integer.parseInt(arr[j]);
			}
		}
		
		cnt = 0;
		ColoredPaper(0, 0, num, num, 0);
		System.out.println(cnt);
		cnt = 0;
		ColoredPaper(0, 0, num, num, 1);
		System.out.println(cnt);
		
		in.close();
	}
	
	public static void ColoredPaper(int x, int y, int z, int r, int color) {
		
		if (z - x == 1) {
			if (N[x][y] == color) {
				cnt += 1;
			}
			return;
		}
		
		boolean check = false;
		
		for (int i = x; i < z; i++) {
			for (int j = y; j < r; j++) {
				if (N[i][j] != color) {
					check = true;
					break;
				}
			}
			if (check) {
				break;
			}
		}
		
		if (check) {
			ColoredPaper(x, y, x + (z-x)/2, y + (r-y)/2, color);
			ColoredPaper(x + (z-x)/2, y, z, y + (r-y)/2, color);
			ColoredPaper(x, y + (r-y)/2, x + (z-x)/2, r, color);
			ColoredPaper(x + (z-x)/2, y + (r-y)/2, z, r, color);
		} else {
			cnt += 1;
		}
		
		return;
	}
}
