package baekjoon.step20001_30000.step25001_26000.step25601_25700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BaekJoon26069_Success_Final {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Boolean> map = new HashMap<>();
		int num = Integer.parseInt(in.readLine());
		String arr[], A, B;
		map.put("ChongChong", true);
		
		for (int i = 0; i < num; i++) {
			arr = in.readLine().split(" ");
			A = arr[0];
			B = arr[1];
			if (map.get(A) == null && map.get(B) == null) {
				continue;
			}
			map.put(A, true);
			map.put(B, true);
		}
		
		System.out.println(map.size());
		in.close();
	}
}
