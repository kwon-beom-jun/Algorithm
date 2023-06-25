package baekjoon.step10001_20000.step10001_11000.step10701_10800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon10768 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		
		if (num < 2) {
			in.readLine();
			System.out.println("Before");
		} else if (num == 2) {
			num = Integer.parseInt(in.readLine());
			System.out.println(num == 18 ? "Special" : num < 18 ? "Before" : "After");
		} else {
			in.readLine();
			System.out.println("After");
		}
		
		in.close();
	}
}
