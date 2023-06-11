package baekjoon.step1_10000.step2001_3000.step2401_2500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2447_Success {
	
	static char[][] arr;
	static int num;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 3;
		num = Integer.parseInt(in.readLine());
		
		arr = new char[num][num];
		arr[0][0] = '*';
		startPattern(cnt);
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				sb.append(arr[i][j]);
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
	
	public static void startPattern(int cnt) {
		
		for (int j = 0; j < cnt/3; j++) {
			for (int k = 1; k <= 2; k++) {
				for (int i = cnt/3*k, z = 0; i < cnt/3*(k+1); i++, z++) {
					arr[j][i] = arr[j][z];
				}
			}
		}
		
		for (int j = cnt/3; j < cnt/3*2; j++) {
			for (int i = 0, z = 0; i < cnt/3; i++, z++) {
				arr[j][i] = arr[j-cnt/3][z];
			}
		}

		for (int j = cnt/3; j < cnt/3*2; j++) {
			for (int i = cnt/3, z = 0; i < cnt/3*2; i++, z++) {
				arr[j][i] = ' ';
			}
		}
		
		for (int j = cnt/3; j < cnt/3*2; j++) {
			for (int i = cnt/3*2, z = 0; i < cnt; i++, z++) {
				arr[j][i] = arr[j-cnt/3][z];
			}
		}
		
		for (int j = cnt/3*2, l = 0; j < cnt; j++, l++) {
			for (int k = 0; k <= 2; k++) {
				for (int i = cnt/3*k, z = 0; i < cnt/3*(k+1); i++, z++) {
					arr[j][i] = arr[l][z];
				}
			}
		}
		
		if (cnt == num) {
			return;
		}
		
		cnt *= 3;
		
		startPattern(cnt);
	}
}
