package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BaekJoon2581 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt((buffer).readLine());
		int B = Integer.parseInt((buffer).readLine());
		ArrayList<Integer> list = new ArrayList<>();
		int result = 0;
		
		/**
			A~B For문 (i=A로 시작)
				A == 2
                    list 추가, result sum
				2~i For문 (1 or i 말고 나눠지는값 확인)
					i%j 0 이면 break
					마지막까지 없으면 list 추가, result sum
		 */
		for (int i = A; i <= B; i++) {
			if (i == 2) {
				list.add(i);
				result += i;
			}else {
				for (int j = 2; j < i; j++) {
					if (i%j == 0) {
						break;
					}else if(j == i-1) {
						list.add(i);
						result += i;
					}
				}
			}
		}
		
		if (list.size() != 0) {
			System.out.println(result);
			System.out.println(list.get(0));
		}else {
			System.out.println(-1);
		}
        
	}	
}
