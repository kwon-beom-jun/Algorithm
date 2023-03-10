package baekjoon.step1_10000.step2001_3000.step2701_2800;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon2752_Backup {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(in.readLine());
		int arr[] = new int[num];
		
		for (int i = 0; i < num; i++) {
			arr[i] = Integer.parseInt(in.readLine());
		}
		
		// 수가 중복되지 않는다는 가정
		int count = num-1;
		for (int i = 1; i <= 1000000; i++) {
			for (int j = 0; j < num; j++) {
				if (arr[j] == i) {
					out.write(arr[j]+"\n");
					count--;
					if (count == 0) {
						break;
					}
				}
			}
		}

		out.flush();
		out.close();
		in.close();
	}
}
