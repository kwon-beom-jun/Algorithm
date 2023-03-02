package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2675 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer result = new StringBuffer();
		int num = Integer.parseInt(reader.readLine()); // 입력 갯수
		String[] question1 = new String[num];
		String[] question2;
		int check;
		
		for (int i = 0; i < num; i++) {
			question1[i] = reader.readLine();
		}
		
		for (int i = 0; i < question1.length; i++) {
			check = 0;
			question2 = question1[i].split(" ");
			for (int x = 0; x < question2[1].length(); x++) {
				for (int j = 0; j < Integer.parseInt(question2[0]); j++) {
					result.append(question2[1].charAt(check));
				}
				check++;
			}
			result.append("\n");
		}
			
		System.out.println(result);
		
	}
}
