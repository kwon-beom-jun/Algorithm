package baekjoon.step1_10000.step1001_2000.step1901_2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1978 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/**
			주의사항
			- 프로그램이 실행되는 중 BufferedReader는 하나만 만들어져야 한다.
		 */
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(buffer.readLine());
		String arr[] = buffer.readLine().split(" ");
		int result = 0, num;
		
		if (A != 0) {
			for (int i = 0; i < arr.length; i++) {
				num = Integer.parseInt(arr[i]);
				if (num == 2) {
					result++;
				}else {
					for (int j = 2; j < num; j++) {
						if (num%j == 0) {
							break;
						}else if(j == num-1) {
							result++;
						}
					}
				}
			}
		}
		
		System.out.println(result);
		
	}	
}
