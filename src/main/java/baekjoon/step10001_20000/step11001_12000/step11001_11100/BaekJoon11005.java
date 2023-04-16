package baekjoon.step10001_20000.step11001_12000.step11001_11100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class BaekJoon11005 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer, String> map = new HashMap<>();
		ArrayList<Integer> result = new ArrayList<>();
		String arr[] = in.readLine().split(" ");
		int total = Integer.parseInt(arr[0]), num = Integer.parseInt(arr[1]);
		
		for (int i = 65; i <= 90; i++) {
			map.put(i-55, String.valueOf((char)i));
		}
		
		while (total != 0) {
			result.add(total % num);
			total = total / num;
		}
		
		for (int i = result.size()-1; i >= 0; i--) {
			System.out.print(result.get(i) < 10 ? result.get(i) : map.get(result.get(i)));
		}
		
		in.close();
	}
}
