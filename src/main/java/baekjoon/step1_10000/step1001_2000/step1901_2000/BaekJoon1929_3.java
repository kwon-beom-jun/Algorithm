package baekjoon.step1_10000.step1001_2000.step1901_2000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class BaekJoon1929_3 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		/**
		 * 기존 M-N 소수 구하는 방식(시간초과) - 2 ~ M전까지 나머지가 0이 안돼면 소수 - M++ 변경 방식(시간초과) - 소수 리스트
		 * 0번째 = 소수 2로 시작 - M % 기존소수 리스트 != 0 ? 소수 : 소수 X - M++ 에라토스테네스의 체 - 2부터 시작, 해당
		 * 소수의 제곱부터 검색 ArrayList 방식으로 변경 (시간초과)
		 */
		StringBuilder builder = new StringBuilder();
		String[] num = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
		int M = Integer.parseInt(num[0]);
		int N = Integer.parseInt(num[1]);
		ArrayList<Integer> list = new ArrayList<>();

		if (N == 1) {
			System.exit(0);
		}
		if (N == 2) {
			System.out.println(2);
			System.exit(0);
		}

		for (int i = M; i <= N; i++) {
			list.add(i);
		}

		// System.out.println(list.toString());
		for (Integer integer : list) {
			System.out.println(integer); // 속도가 훨씬 빠름.
		}

		/*
		 * for (int i = 2; i < N; i++) { if (i*i > N) { break; } for (int j = i*i; j <=
		 * N; j+=i) { if(list.indexOf(j) != -1) { list.remove(list.indexOf(j)); } } }
		 */

		// System.out.println(list.toString());

	}
}