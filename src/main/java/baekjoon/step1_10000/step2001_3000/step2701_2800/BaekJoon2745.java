package baekjoon.step1_10000.step2001_3000.step2701_2800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.regex.Pattern;

public class BaekJoon2745 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Character, Integer> map = new HashMap<>();
		String arr[] = in.readLine().split(" ");
		String N = arr[0];
		int B = Integer.parseInt(arr[1]);
		int result = 0;
		
		for (int i = 65; i <= 90; i++) {
			map.put((char)i, i-55);
		}
		
		char digit;
		for (int i = N.length()-1; i >= 0 ; i--) {
			digit = N.charAt(i);
			// 자리수의 제곱값 * 자리수의 값
			result += Math.pow(B, N.length()-1-i) *
				     (Pattern.matches("^[0-9]*$", digit+"") ? Integer.parseInt(digit+"") : map.get(digit));
		}
		
		System.out.println(result);
		in.close();
	}
}
