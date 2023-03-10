package baekjoon.step1_10000.step2001_3000.step2901_3000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2941 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine(); reader.close();
		String[] croatia = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		
		for (int i = 0; i < croatia.length; i++) {
			str = str.replaceAll(croatia[i], "%");
		}
		
		System.out.println(str.length());
		
		
	}
}
