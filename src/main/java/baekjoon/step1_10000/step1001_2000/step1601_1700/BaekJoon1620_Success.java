package baekjoon.step1_10000.step1001_2000.step1601_1700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BaekJoon1620_Success {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String NM[] = in.readLine().split(" ");
		HashMap<Integer, String> N_int = new HashMap<>();
		HashMap<String, Integer> N_str = new HashMap<>();
		String str = "";
		
		for (int i = 1; i < Integer.parseInt(NM[0])+1; i++) {
			str = in.readLine();
			N_int.put(i, str);
			N_str.put(str, i);
		}
		
		Pattern pattern = Pattern.compile("[0-9]+");
		Matcher matcher = null;
		
		for (int i = 0; i < Integer.parseInt(NM[1]); i++) {
			str = in.readLine();
			matcher = pattern.matcher(str);
			sb.append(matcher.find() ? N_int.get(Integer.parseInt(matcher.group()))+"\n" : N_str.get(str)+"\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
