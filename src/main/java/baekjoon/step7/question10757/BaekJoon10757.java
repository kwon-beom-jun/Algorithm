package baekjoon.step7.question10757;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class BaekJoon10757 {
	public static void main(String[] args) throws IOException {
		
		String value[] = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
		
		BigDecimal A = new BigDecimal(value[0]);
		BigDecimal B = new BigDecimal(value[1]);

		System.out.println(A.add(B));
		
		
	}
}
