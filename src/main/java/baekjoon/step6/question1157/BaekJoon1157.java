package baekjoon.step6.question1157;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class BaekJoon1157 {
	public static void main(String[] args) throws IOException {
		

		HashMap<String, Integer> map = new HashMap<>();
		ArrayList<Integer> result = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine().toUpperCase();
		
		reader.close();
		
		for (int i = 0; i < str.length(); i++) {
			if(map.containsKey(String.valueOf(str.charAt(i)))) {
				map.put(String.valueOf(str.charAt(i)), map.get(String.valueOf(str.charAt(i)))+1);
			}else {
				map.put(String.valueOf(str.charAt(i)), 1);
			}
		}
		
		for (Entry<String, Integer> entry : map.entrySet()) {
			result.add(entry.getValue());
		}
		
		Collections.sort(result, Collections.reverseOrder());
		
		if(result.size() == 1 || result.get(0).equals(result.get(1))) {
			System.out.println(result.size() == 1 ? map.keySet().iterator().next() : "?");
		}else {
			for(String key : map.keySet()) {
				if(map.get(key).equals(result.get(0))) {
					System.out.println(key);
					break;
				}
			}
		}
	}
}
