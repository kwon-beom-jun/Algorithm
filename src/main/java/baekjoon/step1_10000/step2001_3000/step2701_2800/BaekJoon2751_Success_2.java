package baekjoon.step1_10000.step2001_3000.step2701_2800;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 문제 이해
 *		1. 입력값 1 <= N <= 1,000,000
 *		2. 절댓값이 1,000,000 작거나 같은 정수 / 범위 -1,000,000 ~ 0 ~ 1,000,000
 *
 */
public class BaekJoon2751_Success_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(in.readLine());
		int arr[] = new int[2000001]; 
		int check;
		
		for (int i = 0; i < num; i++) {
			check = Integer.parseInt(in.readLine());
			if (check < 0) {
				check = 999999 + (check * -1);
				arr[check] = 1;
			} else if (check > 0) {
				check -= 1;
				arr[check] = 1;
			} else {
				check = 2000000;
				arr[check] = 1;
			}
		}

		for (int i = 1999999; i >= 1000000; i--) {
			if (arr[i] == 1) {
				out.write(((i*-1)+999999)+"\n");
			}
		}
		
		if (arr[2000000] == 1) {
			out.write(0 + "\n");
		}
		
		for (int i = 0; i < 1000000; i++) {
			if (arr[i] == 1) {
				out.write((i+1)+"\n");
			}
		}
		
		out.flush();
		out.close();
		in.close();
	}
}
