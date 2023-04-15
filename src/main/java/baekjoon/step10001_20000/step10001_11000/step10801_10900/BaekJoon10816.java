package baekjoon.step10001_20000.step10001_11000.step10801_10900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BaekJoon10816 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		HashMap<Integer, Integer> map = new HashMap<>();
		int num;
		
		in.readLine();
		String N[] = in.readLine().split(" ");
		for (int i = 0; i < N.length; i++) {
			num = Integer.parseInt(N[i]);
			if (map.get(num) == null) {
				map.put(num, 1);
			} else {
				map.put(num, map.get(num)+1);
			}
		}
		
		in.readLine();
		String M[] = in.readLine().split(" ");
		for (int i = 0; i < M.length; i++) {
			num = Integer.parseInt(M[i]);
			sb.append(map.get(num) == null ? 0+" " : map.get(num)+" ");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
