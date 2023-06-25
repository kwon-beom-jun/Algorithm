package baekjoon.step1_10000.step2001_3000.step2701_2800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon2752 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String arr[] = in.readLine().split(" ");
		int ABC[] = {Integer.parseInt(arr[0]), Integer.parseInt(arr[1]), Integer.parseInt(arr[2])};
		
		Arrays.sort(ABC);
		
		for (int i = 0; i < ABC.length; i++) {
			sb.append(ABC[i]);
			sb.append(" ");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
