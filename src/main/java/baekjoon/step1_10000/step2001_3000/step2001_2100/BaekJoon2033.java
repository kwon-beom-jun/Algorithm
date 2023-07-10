package baekjoon.step1_10000.step2001_3000.step2001_2100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2033 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		int result = Integer.parseInt(str), i = 0, digit;
		
		while (true) {
			
			if (result == 0 || result / Math.pow(10, i) < 10) {
				break;
			}
			
			digit = (int) (result / Math.pow(10, i) % 10);
			result = (int) (digit < 5 ? result - digit * Math.pow(10, i) : result + ((10 - digit) * Math.pow(10, i))); 
			i++;
		}
		
		System.out.println(result);
		in.close();
	}
}
