package baekjoon.step10001_20000.step10001_11000.step10901_11000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon10988_final {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String word = in.readLine();
		char lastword = word.charAt(word.length()-1);
		
		if(word.charAt(0) == lastword) {
			int count = word.length()-1;
			for (int i = 0; i < word.length(); i++, count--) {
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
