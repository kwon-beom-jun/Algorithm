package baekjoon.step1_10000.step1001_2000.step1701_1800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1780 {
	
	static char N[][], check;
	static int minus, zero, one;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		N = new char[num][num];
		
		// Minus = 0, Zero = 1, One = 2
		String arr[];
		for (int i = 0; i < num; i++) {
			arr = in.readLine().split(" ");
			for (int j = 0; j < num; j++) {
				N[i][j] = (char)(Integer.parseInt(arr[j])+'1');
			}
		}
		
		Paper(0, 0, num);
		
		System.out.println(minus + "\n" + zero + "\n" + one);
		in.close();
	}
	
	public static void Paper(int x, int y, int size) {
		
		// 검사
		check = N[x][y];
		Loop :
		for (int i = x; i < x+size; i++) {
			for (int j = y; j < y+size; j++) {
				if (check != N[i][j]) {
					check = '9';
					break Loop;
				}
			}
		}
		
		if (check != '9') {
			if (N[x][y] == '0') {
				minus++;
			} else if (N[x][y] == '1') {
				zero++;
			} else {
				one++;
			}
			return;
		}

		size = size/3;
		// 1행
		Paper(x, y, size);
		Paper(x, y + size, size);
		Paper(x, y + size + size, size);
		// 2행
		Paper(x + size, y, size);
		Paper(x + size, y + size, size);
		Paper(x + size, y + size + size, size);
		// 3행
		Paper(x + size + size, y, size);
		Paper(x + size + size, y + size, size);
		Paper(x + size + size, y + size + size, size);
	}
}
