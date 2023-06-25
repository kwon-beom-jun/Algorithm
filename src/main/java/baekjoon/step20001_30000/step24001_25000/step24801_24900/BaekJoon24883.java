package baekjoon.step20001_30000.step24001_25000.step24801_24900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon24883 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String alphabet = in.readLine();
		
		if (alphabet.equals("N") || alphabet.equals("n")) {
			System.out.println("Naver D2");
		} else {
			System.out.println("Naver Whale");
		}
		
		in.close();
	}
}
