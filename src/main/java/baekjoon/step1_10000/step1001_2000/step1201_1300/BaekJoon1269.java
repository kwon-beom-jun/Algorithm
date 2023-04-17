package baekjoon.step1_10000.step1001_2000.step1201_1300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * 문제 풀이
 *		1. 차집합의 원소 개수는 교집합의 원소 개수를 제외한 값이다
 *  
 */
public class BaekJoon1269 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		in.readLine();
		String A[] = in.readLine().split(" ");
		String B[] = in.readLine().split(" ");
		HashMap<String, Boolean> map = new HashMap<>();
		
		for (int i = 0; i < B.length; i++) {
			map.put(B[i], true);
		}
		
		int cnt = 0;
		for (int i = 0; i < A.length; i++) {
			if (map.get(A[i]) != null) {
				cnt++;
			}
		}
		
		System.out.println(A.length + map.size() - (2*cnt));
		in.close();
	}
}
