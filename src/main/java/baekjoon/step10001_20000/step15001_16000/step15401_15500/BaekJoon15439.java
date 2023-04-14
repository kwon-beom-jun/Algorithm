package baekjoon.step10001_20000.step15001_16000.step15401_15500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon15439 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		
		System.out.println(num*(num-1));
		in.close();
	}
}
