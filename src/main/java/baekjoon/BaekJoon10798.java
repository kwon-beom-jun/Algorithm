package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon10798 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out)); 
		
		String arr[][] = new String[5][];
		for (int i = 0; i < 5; i++) {
			arr[i] = in.readLine().split("");
		}
		
		for (int j = 0; j < 15; j++) {
			for (int i = 0; i < 5; i++) {
				if (arr[i].length > j) {
					System.out.println(arr[i][j]);
					out.write(arr[i][j]);
				}
			}
		}
		out.flush();
		out.close();
		in.close();
	}
}
