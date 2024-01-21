package baekjoon.step10001_20000.step11001_12000.step11701_11800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon11726 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		int before = 1;
		int after = 2;
		int temp;
		
		if (n == 1 || n == 2) {
			System.out.println(n);
			return;
		}
		
		for (int i = 2; i < n; i++) {
			temp = after;
			after = temp + before;
			before = temp;
			after %= 10007;
		}
		
		System.out.println(after);
		in.close();
	}
}
