package baekjoon.step20001_30000.step24001_25000.step24701_24800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon24723 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println((int)Math.pow(2, Integer.parseInt(in.readLine())));
		in.close();
	}
}
