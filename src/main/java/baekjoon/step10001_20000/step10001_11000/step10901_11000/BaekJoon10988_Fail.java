package baekjoon.step10001_20000.step10001_11000.step10901_11000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *	여러 단어가 중복으로 사용되는 것으로 파악 
 *	예시)
 *		'level + 단어' 로 문제파악.
 */
public class BaekJoon10988_Fail {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String word = in.readLine();
		int check = word.indexOf(word.charAt(0),1);
		
		if(check != -1) {
			int count = check;
			for (int i = 0; i < check+1; i++, count--) {
				if (i == count || i == count-1) {
					System.out.println(word.charAt(i) == word.charAt(count) ? 1 : 0);
					break;
				} else {
					if (word.charAt(i) != word.charAt(count)) {
						System.out.println(0);
						break;
					}
				}
			}
		} else {
			System.out.println(0);
		}
		
		in.close();
		
	}
}
