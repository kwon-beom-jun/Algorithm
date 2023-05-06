package baekjoon.step10001_20000.step18001_19000.step18801_18900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

/**
 * 문제 이해
 * 		1. 주의 사항 String으로 sort 정렬 시
 *			1-1. ["1000", "999"] 첫 번째 문자인 '1'과 '9'를 비교, '1'이 '9'보다 사전식으로 앞에 위치 "1000"이 "999"보다 작은 값
 *			1-2. ["-10", "0", "3"] → "-10"이 "-3"보다 앞에, "-3"은 "0"보다 앞에, "0"은 "3"보다 앞에 정렬
 *
 */
public class BaekJoon18870_Success {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		in.readLine();
		String arr[] = in.readLine().split(" ");
		int origin[] = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			origin[i] = Integer.parseInt(arr[i]);
		}
		
		int copy[] = Arrays.copyOf(origin, origin.length);
		HashMap<Integer, Integer> map = new HashMap<>();
		
		Arrays.sort(copy);
		
		int check = 0;
		for (int i = 0; i < copy.length; i++) {
			if (!(map.containsKey(copy[i]))) {
				map.put(copy[i], check);
				check++;
			}
		}
		
		for (int i = 0; i < origin.length; i++) {
			sb.append(map.get(origin[i]) + " ");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
