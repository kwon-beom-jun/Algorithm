package baekjoon.step10001_20000.step15001_16000.step15601_15700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BaekJoon15651_Success {

	static int N;
	static int M;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();
	static List<String> list = new ArrayList<>();

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String NM[] = in.readLine().split(" ");
		N = Integer.parseInt(NM[0]);
		M = Integer.parseInt(NM[1]);
		arr = new int[M];

		dfs(0);

		List<String> newList = list.stream().distinct().collect(Collectors.toList());
		
		sb.setLength(0);
		for (int i = 0; i < newList.size(); i++) {
			sb.append(newList.get(i) + "\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}

	public static void dfs(int depth) {

		for (int i = 0; i < N; i++) {
			if (depth == M) {
				sb.setLength(0);
				for (int val : arr) {
					sb.append(val + " ");
				}
				list.add(sb.toString());
			} else {
				arr[depth] = i+1;
				dfs(depth+1);
			}
		}
	}
}
