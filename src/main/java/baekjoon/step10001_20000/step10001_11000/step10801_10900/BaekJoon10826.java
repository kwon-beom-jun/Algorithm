package baekjoon.step10001_20000.step10001_11000.step10801_10900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class BaekJoon10826 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		
		BigInteger beforeNum1 = new BigInteger("0");
		BigInteger beforeNum2 = new BigInteger("1");
		BigInteger result = beforeNum1.add(beforeNum2);
        
		for (int i = 3; i <= n; i++) {
			beforeNum1 = beforeNum2;
			beforeNum2 = result;
			result = beforeNum1.add(beforeNum2);
		}
		
		System.out.println(n == 0 ? 0 : result);
		in.close();
	}
}
