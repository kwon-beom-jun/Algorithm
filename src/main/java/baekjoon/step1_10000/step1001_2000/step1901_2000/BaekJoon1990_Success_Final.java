package baekjoon.step1_10000.step1001_2000.step1901_2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *	# a:5, b:100,000,000 적용하여 도출되는 최대 결과값 9989899
 *  
 */
public class BaekJoon1990_Success_Final {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String arr[] = in.readLine().split(" ");
		int a = Integer.parseInt(arr[0]);
		int b = Integer.parseInt(arr[1]);
		boolean prime[] = new boolean[9989899+1];
		
		// 에라토스테네스의 체
		prime[0] = true;
		prime[1] = true;
		for (int i = 2; i*i <= 9989899; i++) {
			if (!prime[i]) {
				for (int j = i*i; j <= 9989899; j+=i) {
					prime[j] = true;
				}
			}
		}
	
		// 펠린드롬
		Loop :
		for (int i = a; i <= (b = b < 9989899 ? b : 9989899); i++) {
			if (!prime[i]) {
				char temp[] = String.valueOf(i).toCharArray();
				for (int j = 0; j < temp.length/2; j++) {
					if (temp[j] != temp[temp.length-1-j]) {
						continue Loop;
					}
				}
				sb.append(i);
				sb.append("\n");
			}
		}
		
		sb.append(-1);
		System.out.println(sb.toString());
		in.close();
	}
}
