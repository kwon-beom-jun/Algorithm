package baekjoon.step1_10000.step9001_10000.step9301_9400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BaekJoon9935_2 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		String str = in.readLine();
		String explosion = in.readLine();
		char arr[] = str.toCharArray();
		ArrayList<Character> list = new ArrayList<>();
		int check;
		
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
			if (arr[i] == explosion.charAt(0)) {
				sb.delete(0, sb.length());
				sb.append(arr[i]);
				if (explosion.length() == 1) {
					list.remove(list.size()-1);
				}
			} else if (sb.length() != 0) {
				sb.append(arr[i]);
				if (explosion.indexOf(sb.toString()) == -1) {
					sb.delete(0, sb.length());
				}
				if (sb.toString().length() == explosion.length()) {
					for (int j = 0; j < explosion.length(); j++) {
						list.remove(list.size()-1);
					}
					sb.delete(0, sb.length());
					if (list.size() != 0) {
						sb.append(list.get(list.size()-1));
						while (sb.length() < list.size()) {
							check = list.size()-2;
							if (explosion.indexOf(list.get(check)) != -1) {
								sb.insert(0, list.get(check));
								if (explosion.indexOf(sb.toString()) == -1) {
									sb.delete(0, 1);
									break;
								}
							} else {
								break;
							}
							check--;
						}
					}
				}
			}
		}
		
		sb.delete(0, sb.length());
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i));
		}
		
		System.out.println(list.size() == 0 ? "FRULA" : sb.toString());
		in.close();
	}
}
