package baekjoon.step1_10000.step5001_6000.step5501_5600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon5597 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		boolean arr[] = new boolean[30];
		
		String num = "";
		while ((num = in.readLine()) != null) {
			arr[Integer.parseInt(num)-1] = true;
		}
		
		int check = 0;
		for (int i = 0; i < arr.length; i++) {
			if (!arr[i]) {
				System.out.println(i+1);
				check++;
				if (check == 2) {
					break;
				}
			}
		}
		
		in.close();
	}
}
