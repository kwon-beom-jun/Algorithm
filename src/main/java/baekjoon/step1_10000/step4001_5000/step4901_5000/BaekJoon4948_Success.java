package baekjoon.step1_10000.step4001_5000.step4901_5000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon4948_Success {
	public static void main(String[] args) throws IOException {
		
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String num;
        int n, arr[], result;
        boolean check;
        
        while (!((num = in.readLine()).equals("0"))) {
        	
        	n = Integer.parseInt(num);
        	arr = new int[n*2+1];
        	result = 0;
        	
        	if (n == 1) {
        		sb.append(1 + "\n");
				continue;
			}
        	
        	// 에라토스테네스의 체 
        	for (int i = 2; i <= n*2; i++) {
        		check = true;
        		if (arr[i] == 0) {
        			for (int j = 2; j*j <= i; j++) {
        				if (i % j == 0) {
							check = false;
							break;
						}
        			}
        			if (check) {
        				for (int j = i+i; j <= n*2; j=j+i) {
        					arr[j] = 1;
        				}
        			}
				}
			}
        	
        	// n+1 ~ n*2 사이의 소수 값
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
