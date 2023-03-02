package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon10952 {
	public static void main(String[] args) {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		try {


			while (true) {
				
				String arr[] = bf.readLine().split(" ");
				Integer A = Integer.parseInt(arr[0]);
				Integer B = Integer.parseInt(arr[1]);

				if (A + B != 0) {
					System.out.println(A+B);
				}else {
					break;
				}
				
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
