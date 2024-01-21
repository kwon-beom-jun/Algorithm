package baekjoon.step10001_20000.step17001_18000.step17201_17300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class BaekJoon17254 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = in.readLine().split(" ");
		int N = Integer.parseInt(arr[0]);
		int M = Integer.parseInt(arr[1]);
		
		Map<String, String> map = new HashMap<String, String>();
		int[][] ab = new int[M][2];
		
		int a, b;
		for (int i = 0; i < M; i++) {
			arr = in.readLine().split(" ");
			a = Integer.parseInt(arr[0]);
			b = Integer.parseInt(arr[1]);
			ab[i][0] = a;
			ab[i][1] = b;
			map.put(arr[0]+" "+arr[1], arr[2]);
		}
		
		Arrays.sort(ab, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] != o2[1]) {
					return o1[1] - o2[1];
				}
				return o1[0] - o2[0];
			}
		});
		
		StringBuilder sb = new StringBuilder();
		for (int[] temp : ab) {
			sb.append(map.get(temp[0] + " " + temp[1]));
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
