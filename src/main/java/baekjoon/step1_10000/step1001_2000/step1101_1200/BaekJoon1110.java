package baekjoon.step1_10000.step1001_2000.step1101_1200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1110 {
	public static void main(String[] args) {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		
		try {
			
			str = bf.readLine();
			String result = "";
			int A = 0;
			int B = 0;
			int C = 0;
			int num = 0;
			
			if (str.length() != 1) {
				
				String arr[] = str.split("");
				
				A = Integer.parseInt(arr[0]);
				B = Integer.parseInt(arr[1]);
				
				while(true) {
					
					num++;
					
					C = A + B;
					B = B * 10;
					
					if (C < 10) {
						result = (B+C)+"";
					} else {
						arr = (String.valueOf(C)).split("");
						//D = Integer.parseInt(arr[0]);
						int E = Integer.parseInt(arr[1]);
						result = (B+E)+"";
					}
					
					if (result.length() != 1) {
						arr = result.split("");
						A = Integer.parseInt(arr[0]);
						B = Integer.parseInt(arr[1]);
					} else {
						arr = result.split("");
						A = 0;
						B = Integer.parseInt(arr[0]);
					}

					if (str.equals(result)) {
						break;
					}
					
					
				}
				System.out.println(num);
			} else {
				
				String arr[] = {};
				
				B = Integer.parseInt(str);
				
				while(true) {
				
					num++;
					
					C = A + B;
					B = B * 10;
					
					if (C < 10) {
						result = (B+C)+"";
					} else {
						arr = (String.valueOf(C)).split("");
						//D = Integer.parseInt(arr[0]);
						int E = Integer.parseInt(arr[1]);
						result = (B+E)+"";
					}
					
					if (result.length() != 1) {
						arr = result.split("");
						A = Integer.parseInt(arr[0]);
						B = Integer.parseInt(arr[1]);
					} else {
						arr = result.split("");
						A = 0;
						B = Integer.parseInt(arr[0]);
					}

					if (str.equals(result)) {
						break;
					}
					
					
				}
				System.out.println(num);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
