package baekjoon.step1_10000.step1001_2000.step1301_1400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1357_Success {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String arr[] = in.readLine().split(" ");
		String X[] = arr[0].split("");
		String Y[] = arr[1].split("");
		int total = 0;
		
		for (int i = 0; i < X.length; i++) {
			total += Integer.parseInt(X[i])*Math.pow(10, i);
		}
		for (int i = 0; i < Y.length; i++) {
			total += Integer.parseInt(Y[i])*Math.pow(10, i);
		}
		while (total != 0) {
			sb.append(total%10);
			total /= 10;
		}
		
		System.out.println(Integer.parseInt(sb.toString()));
		in.close();
	}
}
