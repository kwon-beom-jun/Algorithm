package baekjoon.step1_10000.step1001_2000.step1901_2000;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class BaekJoon1929_4 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		/**
		 * 기존 M-N 소수 구하는 방식(시간초과) - 2 ~ M전까지 나머지가 0이 안돼면 소수 - M++ 변경 방식(시간초과) - 소수 리스트
		 * 0번째 = 소수 2로 시작 - M % 기존소수 리스트 != 0 ? 소수 : 소수 X - M++ 에라토스테네스의 체 - 2부터 시작, 해당
		 * 소수의 제곱부터 배수로 제거, 소수로 for문, 해당 소수 제곱시 찾을려는값보다 클 경우 break ArrayList 방식으로 변경
		 * (시간초과)- reference? 배열 사용
		 */
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] num = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
		int M = Integer.parseInt(num[0]);
		int N = Integer.parseInt(num[1]);
		int[] pNumArr = new int[N + 1];

		if (N == 1) {
			System.exit(0);
		}
		if (N == 2) {
			System.out.println(2);
			System.exit(0);
		}

		for (int i = 0; i <= N; i++) {
			pNumArr[i] = 0;
		}

		// 변경되야 하는 사항 : 소수만 for문?
		for (int i = 2; i < N; i++) {
			if (i * i > N) {
				break;
			}
			for (int j = i * i; j <= N; j += i) {
				pNumArr[j] = 1;
			}
		}

		// 0, 1 제외
		pNumArr[0] = 1;
		pNumArr[1] = 1;
		for (int i = M; i < N; i++) {
			if (pNumArr[i] == 0) {
				writer.append(i + "\n");
			}
		}

		writer.flush();
		writer.close();

	}
}