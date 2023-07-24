package baekjoon.step10001_20000.step11001_12000.step11501_11600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon11536 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		int check;
		String A, B;
		
		A = in.readLine();
		B = in.readLine();
		
		check = A.compareTo(B) > 0 ? 1 : -1;
		
		if (check > 0) {
			for (int i = 2; i < num; i++) {
				A = B;
				B = in.readLine();
				if (A.compareTo(B) < 0) {
					check = 0;
					break;
				}
			}
		} else {
			for (int i = 2; i < num; i++) {
				A = B;
				B = in.readLine();
				if (A.compareTo(B) > 0) {
					check = 0;
					break;
				}
			}
		}
		
		System.out.println(check == 0 ? "NEITHER" : check > 0 ? "DECREASING" : "INCREASING");
		in.close();
	}
}
