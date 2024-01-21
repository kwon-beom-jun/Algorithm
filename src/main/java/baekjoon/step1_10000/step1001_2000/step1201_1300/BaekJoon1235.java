package baekjoon.step1_10000.step1001_2000.step1201_1300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class BaekJoon1235 {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		Map<Integer, StringBuilder> map = new HashMap<Integer, StringBuilder>();
		String[] arr = new String[N];

		for (int i = 0; i < N; ++i) {
			arr[i] = in.readLine();
			map.put(i, new StringBuilder());
		}

		HashSet<String> set = new HashSet<String>();
		
		for (int i = arr[0].length()-1, cnt = 1; i >= 0; i--, cnt++) {
			for (int j = 0; j < N; j++) {
				map.put(j, map.get(j).append(arr[j].charAt(i)));
				set.add(map.get(j).toString());
			}
			if (set.size() == N) {
				System.out.println(cnt);
				break;
			}
			set.clear();
		}

		in.close();
	}
}
