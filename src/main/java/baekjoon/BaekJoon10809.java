package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon10809 {
	public static void main(String[] args) throws IOException {
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int check = -1;
		
		StringBuffer result = new StringBuffer();
		String str = br.readLine();
		br.close();
		
		for (int i = 0; i < alphabet.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if(String.valueOf(alphabet.charAt(i)).equals(str.split("")[j])) {
					check = j;
					break;
				}
			}
			result.append(check + " ");
			check = -1;
		}
		
		bw.write(result.toString());
		bw.flush();
		bw.close();
		
	}
}
