package baekjoon.step6.question5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon5622 {
	public static void main(String[] args) throws IOException {
		
		int result = 0;
		String alphabet[] = {"ABC","DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String question[] = reader.readLine().split("");
		
		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < question.length; j++) {
				if(alphabet[i].indexOf(question[j]) != -1) {
					result += (i + 3);
					continue;
				}
			}
		}
		
		System.out.println(result);
		
	}
}
