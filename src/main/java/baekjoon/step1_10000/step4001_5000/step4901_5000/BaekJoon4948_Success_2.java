package baekjoon.step1_10000.step4001_5000.step4901_5000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 풀이
 *		1. 테스트 케이스 범위가 작음
 *  
 */
public class BaekJoon4948_Success_2 {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String num;
        int n, result;
        boolean check;
        
        while (!((num = in.readLine()).equals("0"))) {
        	
        	n = Integer.parseInt(num);
        	result = 0;
        	
        	if (n == 1) {
        		sb.append(1 + "\n");
				continue;
			}
        	
        	for (int i = n+1; i <= n*2; i++) {
        		check = true;
				for (int j = 2; j*j <= i; j++) {
					if (i % j == 0) {
						check = false;
						break;
					}
				}
				if (check) {
					result++;
				}
			}
        	
        	sb.append(result + "\n");
		}
        
        System.out.println(sb.toString());
		in.close();
	}
}
