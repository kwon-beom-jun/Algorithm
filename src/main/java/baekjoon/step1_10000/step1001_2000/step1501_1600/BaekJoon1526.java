package baekjoon.step1_10000.step1001_2000.step1501_1600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1526 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String num = in.readLine();
		int i;
		
		Loop :
		for (i = Integer.parseInt(num); i >= 4; i--) {
			char arr[] = (i+"").toCharArray();
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] != '7' && arr[j] != '4') {
					continue Loop;
				}
			}
			break;
		}
		
		System.out.println(i);
		in.close();
	}
}
