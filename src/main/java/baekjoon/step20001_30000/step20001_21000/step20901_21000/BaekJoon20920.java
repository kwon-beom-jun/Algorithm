package baekjoon.step20001_30000.step20001_21000.step20901_21000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class BaekJoon20920 {
	
	static HashMap<String, Integer> map = new HashMap<>();

	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String arr[] = in.readLine().split(" ");
		int N = Integer.parseInt(arr[0]); 
		int M = Integer.parseInt(arr[1]);
		
		String str;
		for (int i = 0; i < N; i++) {
			str = in.readLine();
			if (str.length() >= M) {
				if (map.get(str) == null) {
					map.put(str, 1);
				} else {
					map.put(str, map.get(str) + 1);
				}
			}
		}
		
		int count = 0;
		String result[] = new String[map.size()];
		for (String key : map.keySet()) {
			result[count++] = key;
		}
		
		Arrays.sort(result, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return map.get(o2) == map.get(o1) ? 
							( o1.length() == o2.length() ? o1.compareTo(o2) : o2.length() - o1.length() )
							: map.get(o2) - map.get(o1);
			}
		});
		
		for (int j = 0; j < result.length; j++) {
			 sb.append(result[j] + "\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
