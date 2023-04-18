package baekjoon.step10001_20000.step11001_12000.step11401_11500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BaekJoon11478 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Boolean> map = new HashMap<>();
		String S = in.readLine();
		int cnt = 0;
		
		while (cnt < S.length()) {
			for (int i = 0; i < S.length()-cnt; i++) {
				map.put(S.substring(i,i+cnt+1), true);
			}
			cnt++;
		}
		
		System.out.println(map.size());
		in.close();
	}
}
