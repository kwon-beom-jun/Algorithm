package baekjoon.step1_10000.step9001_10000.step9801_9900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon9076 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(in.readLine());
		int temp[];
		
		for (int i = 0; i < T; i++) {
			temp = Arrays.stream(in.readLine().split(" "))
						 .mapToInt(Integer::parseInt)
						 .toArray();
			Arrays.sort(temp);
			sb.append(temp[3]-temp[1] >= 4 ? "KIN" : temp[1]+temp[2]+temp[3]);
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
