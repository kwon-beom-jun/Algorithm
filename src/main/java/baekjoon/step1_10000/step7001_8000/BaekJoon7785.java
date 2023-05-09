package baekjoon.step1_10000.step7001_8000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class BaekJoon7785 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		HashMap<String, String> map = new HashMap<>();
		ArrayList<String> list = new ArrayList<>();
		String arr[] = new String[2];
		int num = Integer.parseInt(in.readLine());

		for (int i = 0; i < num; i++) {
			arr = in.readLine().split(" ");
			map.put(arr[0], arr[1]);
		}
		
		for (String name : map.keySet()) {
			if (map.get(name).equals("enter")) {
				list.add(name);
			}
		}
		
		Collections.sort(list, Collections.reverseOrder());
		
		for (String name : list) {
			sb.append(name + "\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
