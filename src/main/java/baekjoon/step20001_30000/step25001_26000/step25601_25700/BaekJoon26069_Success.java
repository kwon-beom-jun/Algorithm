package baekjoon.step20001_30000.step25001_26000.step25601_25700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BaekJoon26069_Success {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> set = new HashSet<>();
		int num = Integer.parseInt(in.readLine());
		String arr[], A, B;
		set.add("ChongChong");
		
		for (int i = 0; i < num; i++) {
			arr = in.readLine().split(" ");
			A = arr[0];
			B = arr[1];
			if (set.contains(A) || set.contains(B)) {
				set.add(A); set.add(B);
			}
		}
		
		System.out.println(set.size());
		in.close();
	}
}
