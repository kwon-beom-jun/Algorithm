package baekjoon.step20001_30000.step25001_26000.step25201_25300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class BaekJoon25206 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String[]> list = new ArrayList<>(); 
		HashMap<String, Double> map = new HashMap<>();
		map.put("A+", 4.5);
		map.put("A0", 4.0);
		map.put("B+", 3.5);
		map.put("B0", 3.0);
		map.put("C+", 2.5);
		map.put("C0", 2.0);
		map.put("D+", 1.5);
		map.put("D0", 1.0);
		
		
		for (int i = 0; i < 20; i++) {
			list.add(in.readLine().split(" "));
		}
		
		double score = 0;
		double total = 0;
		for (String[] arr : list) {
			if (!arr[2].equals("P") && !arr[2].equals("F")) {
				score += Double.parseDouble(arr[1]) * map.get(arr[2]);
			}
			if (!arr[2].equals("P")) {
				total += Double.parseDouble(arr[1]);
			}
		}
		
		System.out.println(score/total);
		in.close();
	}
}
