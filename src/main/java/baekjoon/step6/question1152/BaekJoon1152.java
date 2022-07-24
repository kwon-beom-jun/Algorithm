package baekjoon.step6.question1152;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1152 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String result[] = reader.readLine().trim().split(" ");
		
		reader.close();
		
		System.out.println(result[0].equals("") ? 0 : result.length);
		
	}
}
