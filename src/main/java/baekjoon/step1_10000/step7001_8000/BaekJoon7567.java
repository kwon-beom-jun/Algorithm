package baekjoon.step1_10000.step7001_8000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class BaekJoon7567 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		char arr[] = in.readLine().toCharArray();
		int sum = 10;
		
		for (int i = 1; i < arr.length; i++) {
			if (arr[i-1] == arr[i]) {
				sum += 5;
			} else {
				sum += 10;
			}
		}
		
		System.out.println(sum);
		in.close();
	}
}
