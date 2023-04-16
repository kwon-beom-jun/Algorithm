package baekjoon.step1_10000.step1001_2000.step1601_1700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BaekJoon1620_Success_Final {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String NM[] = in.readLine().split(" ");
		HashMap<String, String> N = new HashMap<>();
		String str = "";
		
		for (int i = 1; i < Integer.parseInt(NM[0])+1; i++) {
			str = in.readLine();
			N.put(str, i+"");
			N.put(i+"", str);
		}
		
		for (int i = 0; i < Integer.parseInt(NM[1]); i++) {
			sb.append(N.get(in.readLine())+"\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
