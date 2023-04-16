package baekjoon.step1_10000.step1001_2000.step1701_1800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class BaekJoon1764_Success {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String NM[] = in.readLine().split(" ");
		HashMap<String, Boolean> N = new HashMap<>();
		String M[] = new String[Integer.parseInt(NM[1])];
		
		for (int i = 0; i < Integer.parseInt(NM[0]); i++) {
			N.put(in.readLine(), true);
		}
		
		String str = "";
		for (int i = 0; i < Integer.parseInt(NM[1]); i++) {
			str = in.readLine();
			M[i] = N.get(str) != null ? str : "";  
		}
		
		Arrays.sort(M);
		
		int cnt = 0;
		for (int i = 0; i < M.length; i++) {
			if (!M[i].equals("")) {
				sb.append(M[i] + "\n");
				cnt++;
			}
		}
		sb.insert(0, cnt + "\n");
		
		System.out.println(sb.toString());
		in.close();
	}
}
