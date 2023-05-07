package baekjoon.step1_10000.step9001_10000.step9301_9400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 풀이
 * 		1. replace, replaceAll 메모리 초과
 * 			1-1. 문자열의 불변성으로 인해 새로운 문자열을 생성하고 반환해야함
 * 			1-2. replace 메서드는 작업량이 많아지면 내부적으로 많은 문자열 복사 작업이 이루어져서 GC가 빈번하게 발생 
 *
 */
public class BaekJoon9935 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		String explosion = in.readLine();
		
		while (str.indexOf(explosion) != -1) {
			str = str.replaceAll(explosion, "");
		}
		
		System.out.println(str.length() == 0 ? "FRULA" : str);
		in.close();
	}
}
