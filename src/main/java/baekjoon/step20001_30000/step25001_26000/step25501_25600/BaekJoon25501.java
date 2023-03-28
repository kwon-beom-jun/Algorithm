package baekjoon.step20001_30000.step25001_26000.step25501_25600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon25501 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		int count;
		
		for (int i = 0; i < num; i++) {
			count = 0;
			System.out.println(isPalindrome(in.readLine(), count));
		}
		
		in.close();
	}

	public static String recursion(String s, int l, int r, int count) {
		count++;
		if (l >= r)
			return "1" + " " + count;
		else if (s.charAt(l) != s.charAt(r))
			return "0" + " " + count;
		else
			return recursion(s, l + 1, r - 1, count);
	}

	public static String isPalindrome(String s, int count) {
		return recursion(s, 0, s.length() - 1, count);
	}
}
