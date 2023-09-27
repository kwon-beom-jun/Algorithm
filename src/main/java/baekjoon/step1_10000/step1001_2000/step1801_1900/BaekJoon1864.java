package baekjoon.step1_10000.step1001_2000.step1801_1900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class BaekJoon1864 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Map<Character, Integer> octopus = new HashMap<>();
		
		octopus.put('-', 0);
		octopus.put('\\', 1);
		octopus.put('(', 2);
		octopus.put('@', 3);
		octopus.put('?', 4);
		octopus.put('>', 5);
		octopus.put('&', 6);
		octopus.put('%', 7);
		octopus.put('/', -1);
		
		int sum;
		char arr[];
		String temp;
		
		while (!(temp = in.readLine()).equals("#")) {
			
			arr = temp.toCharArray();
			sum = 0;
			
			for (int i = 0; i < arr.length; i++) {
				sum += Math.pow(8, arr.length-i-1) * octopus.get(arr[i]);
			}
			
			sb.append(sum).append("\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
