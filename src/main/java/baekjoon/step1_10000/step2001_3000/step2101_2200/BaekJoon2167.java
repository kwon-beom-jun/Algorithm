package baekjoon.step1_10000.step2001_3000.step2101_2200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2167 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String arr[] = in.readLine().split(" ");
		int N = Integer.parseInt(arr[0]);
		int M = Integer.parseInt(arr[1]);
		int NM[][] = new int[N][M];
		
		for (int i = 0; i < N; i++) {
			arr = in.readLine().split(" ");
			for (int j = 0; j < arr.length; j++) {
				NM[i][j] = Integer.parseInt(arr[j]);
			}
		}
		
		int num = Integer.parseInt(in.readLine());
		int i, j, x, y, sum;
		
		for (int z = 0; z < num; z++) {
			
			sum = 0;
			arr = in.readLine().split(" ");
			i = Integer.parseInt(arr[0])-1;
			j = Integer.parseInt(arr[1])-1;
			x = Integer.parseInt(arr[2])-1;
			y = Integer.parseInt(arr[3])-1;
			
			for (int k = i; k  < x+1; k++) {
				for (int n = j; n < y+1; n++) {
					sum += NM[k][n];
				}
			}
			
			sb.append(sum + "\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}