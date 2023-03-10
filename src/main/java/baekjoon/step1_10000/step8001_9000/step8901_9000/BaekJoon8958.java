package baekjoon.step1_10000.step8001_9000.step8901_9000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon8958 {
	public static void main(String[] args) {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		try {

			int count = Integer.parseInt(bf.readLine());
			String arr[] = new String[count];
			int num = 0;
			int sum = 0;

			// OX 입력
			for (int i = 0; i < count; i++) {
				arr[i] = bf.readLine();
			}
				
			char O = 'O';
			// O 찾기
			for (int i = 0; i < count; i++) {
				// 하나의 인덱스 i에 O가 몇번들어가는지 찾기
				for (int j = 0; j < arr[i].length(); j++) {
					if (arr[i].charAt(j) == O) {
						num++;
						sum += num;
					} else {
						num = 0;
					}
				}
				arr[i] = String.valueOf(sum);
				sum = 0;
				num = 0;
			}

			
			for (int i = 0; i < count; i++) {
				System.out.println(arr[i]);
			}
		
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
	}
}
