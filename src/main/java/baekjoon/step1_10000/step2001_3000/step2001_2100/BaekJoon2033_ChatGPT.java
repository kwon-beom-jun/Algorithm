package baekjoon.step1_10000.step2001_3000.step2001_2100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 풀이
 *		1. 결과는 항상 제일 앞자리만 확인하면 됨
 *			ex)	146 -> (2)00 , 8457 -> (9)000
 *
 */
public class BaekJoon2033_ChatGPT {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        int result = Integer.parseInt(str);

        int i = 1;
        while (result >= 10) {
            int digit = (int) (result % 10);
            result /= 10;

            if (digit >= 5) {
                result++;
            }

            i *= 10;
        }

        System.out.println(result * i);
        in.close();
	}
}
