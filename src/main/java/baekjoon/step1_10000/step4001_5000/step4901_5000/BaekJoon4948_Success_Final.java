package baekjoon.step1_10000.step4001_5000.step4901_5000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon4948_Success_Final {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n, result, arr[] = new int[123456*2+1];
        String num;
        
        for (int i = 4; i < arr.length; i++) {
			for (int j = 2; j*j <= i; j++) {
				if (i % j == 0) {
					arr[i] = 1;
					break;
				}
			}
		}
        
        while (!((num = in.readLine()).equals("0"))) {
        	
        	n = Integer.parseInt(num);
        	result = 0;
        	
        	if (n == 1) {
        		sb.append(1 + "\n");
				continue;
			}
        	
        	for (int i = n+1; i <= n*2; i++) {
				if (arr[i] == 0) {
					result++;
				}
			}
        	
        	sb.append(result + "\n");
		}
        
        System.out.println(sb.toString());
		in.close();
	}
}
