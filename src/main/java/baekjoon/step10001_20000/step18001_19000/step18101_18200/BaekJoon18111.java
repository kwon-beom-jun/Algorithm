package baekjoon.step10001_20000.step18001_19000.step18101_18200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon18111 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		float n = Integer.parseInt(in.readLine());
		float score[] = new float[(int)n];
		
		for (int i = 0; i < n; i++) {
			score[i] = Integer.parseInt(in.readLine());
		}
		
		Arrays.sort(score);
		
		int trimmed = (int)Math.round(n / 100 * 15);
		
		float sum = 0;
		for (int i = 0+trimmed; i < score.length-trimmed; i++) {
			sum += score[i];
		}
		
		System.out.println(Math.round( sum / (score.length - trimmed*2) ));
		in.close();
	}
}
