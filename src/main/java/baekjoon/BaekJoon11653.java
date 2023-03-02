package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon11653 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int N = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		
		if (N==1) { System.exit(0); }

		/**
		 	while문
		 		2~A For문
		 			현재 값의 최소 공약수로 나누기
	 			A == 1
	 				종료
		*/
		while (true) {
			for (int j = 2; j <= N; j++) {
				if (N%j == 0) {
					N /= j;
					System.out.println(j);
					break;
				}
			}
			if (N == 1) {
				break;
			}
		}
		
	}
}

