package baekjoon.step10001_20000.step13001_14000.step13301_13400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 풀이
 *		1. 현재 리터당 값보다 싼 다음 지역까지의 거리를 파악하는것이 핵심
 *
 */
public class BaekJoon13305 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		long num = Long.parseLong(in.readLine());
		long min = 1000000001, total = 0;
		String interval[] = in.readLine().split(" ");
		String oil[] = in.readLine().split(" ");

		long nowOil;
		for (int i = 0; i < num-1; i++) {
			nowOil = Long.parseLong(oil[i]);
			if (nowOil < min) {
				total += Long.parseLong(interval[i]) * nowOil;
				min = nowOil;
			} else {
				total += Long.parseLong(interval[i]) * min;
			}
		}
		
		System.out.println(total);
		in.close();
	}
}