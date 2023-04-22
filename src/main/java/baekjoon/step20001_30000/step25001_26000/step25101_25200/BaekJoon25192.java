package baekjoon.step20001_30000.step25001_26000.step25101_25200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BaekJoon25192 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Boolean> map = null;
		int result = 0, N = Integer.parseInt(in.readLine());
		String str = "";
		
		for (int i = 0; i < N; i++) {
			str = in.readLine();
			if (str.equals("ENTER")) {
				result += map != null ? map.size() : 0;
				map = new HashMap<>();
			} else if (map != null) {
				map.put(str, true);
			}
		}
		
		System.out.println(result + map.size());
		in.close();
	}
}
