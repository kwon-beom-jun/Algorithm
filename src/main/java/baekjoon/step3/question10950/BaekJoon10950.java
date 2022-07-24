package baekjoon.step3.question10950;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon10950 {
	public static void main(String[] args) {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		try {

			int Num = Integer.parseInt(bf.readLine());
			
			for (int i = 0; i < Num; i++) {

				String arr[] = bf.readLine().split(" ");
				int A = Integer.parseInt(arr[0]);
				int B = Integer.parseInt(arr[1]);
				
				System.out.println(A+B);
				
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
