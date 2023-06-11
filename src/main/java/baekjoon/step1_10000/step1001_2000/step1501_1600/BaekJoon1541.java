package baekjoon.step1_10000.step1001_2000.step1501_1600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 풀이
 *		1. '-'기호 이후 부터는 전부 '-' 값으로 생각
 *			ex) 30+40-(50+30)-(10+20+30)
 */
public class BaekJoon1541 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr = in.readLine();
		String number[] = arr.split("\\+|-");
		String sign[] = arr.replaceAll("[0-9]","").split("");
		
		int sum = Integer.parseInt(number[0]);
		boolean check = false;
		
		for (int i = 1; i < number.length; i++) {
			
			if (check) {
				sum -= Integer.parseInt(number[i]);
				continue;
			}
			if (sign[i-1].equals("-")) {
				sum -= Integer.parseInt(number[i]);
				check = true;
			} else {
				sum += Integer.parseInt(number[i]);
			}
		}

		System.out.println(sum);
		in.close();
	}
}
