package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon5086 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String nums[] = in.readLine().split(" ");
		int N = Integer.parseInt(nums[0]), k = Integer.parseInt(nums[1]);
		String result = "";
		
		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				k--;
				if (k == 0) {
					result = String.valueOf(i);
					break;
				}
			}
		}
		out.write(result.equals("") ? "0" : result);
		out.flush();
		out.close();
		in.close();
	}
}
