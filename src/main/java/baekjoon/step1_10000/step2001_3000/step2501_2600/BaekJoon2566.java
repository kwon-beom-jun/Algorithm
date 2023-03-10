package baekjoon.step1_10000.step2001_3000.step2501_2600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon2566 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[][] = new String[9][9];
		int max = 0, row = 0, col = 0;
		
		for (int i = 0; i < 9; i++) {
			arr[i] = in.readLine().split(" ");
			for (int j = 0; j < arr[i].length; j++) {
				if (max < Integer.parseInt(arr[i][j])) {
					max = Integer.parseInt(arr[i][j]);
					row = i; col = j;
				}
			}
		}
		
		System.out.println(max+"\n"+(row+1)+" "+(col+1));
		
		in.close();
	}
}
