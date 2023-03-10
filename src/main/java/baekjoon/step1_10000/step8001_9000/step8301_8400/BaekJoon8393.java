package baekjoon.step1_10000.step8001_9000.step8301_8400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon8393 {
	public static void main(String[] args) {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			int A = Integer.parseInt(bf.readLine());
			int i = 0;
			int Num = 1;
			
			for (i = 1; i <= A; i++) {
				if (i != 1) {
					Num += i;
				}
			}
			
			System.out.println(Num);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}		

	}
}
