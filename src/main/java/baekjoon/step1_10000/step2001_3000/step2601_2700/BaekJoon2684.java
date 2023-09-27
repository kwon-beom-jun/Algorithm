package baekjoon.step1_10000.step2001_3000.step2601_2700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BaekJoon2684 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Map<String, Integer> map = new HashMap<>();
		
		char tCase[];
		int num = Integer.parseInt(in.readLine());
		StringBuilder temp = new StringBuilder();
		
		for (int i = 0; i < num; i++) {
			
			map.put("TTT", 0);
			map.put("TTH", 0);
			map.put("THT", 0);
			map.put("THH", 0);
			map.put("HTT", 0);
			map.put("HTH", 0);
			map.put("HHT", 0);
			map.put("HHH", 0);
			tCase = in.readLine().toCharArray();
			
			for (int j = 0; j < 38; j++) {
				temp.setLength(0);
				temp.append(tCase[j]).append(tCase[j+1]).append(tCase[j+2]);
				map.put(temp.toString(), map.get(temp.toString())+1);
			}
			
			sb.append(map.get("TTT")).append(" ")
			  .append(map.get("TTH")).append(" ")
			  .append(map.get("THT")).append(" ")
			  .append(map.get("THH")).append(" ")
			  .append(map.get("HTT")).append(" ")
			  .append(map.get("HTH")).append(" ")
			  .append(map.get("HHT")).append(" ")
			  .append(map.get("HHH")).append("\n");
		}
		
		System.out.println(sb.toString());
	}
}
