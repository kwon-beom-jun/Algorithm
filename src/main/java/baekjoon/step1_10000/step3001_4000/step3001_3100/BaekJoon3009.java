package baekjoon.step1_10000.step3001_4000.step3001_3100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon3009 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr1[] = in.readLine().split(" ");
		String arr2[] = in.readLine().split(" ");
		String arr3[] = in.readLine().split(" ");
		
		System.out.print(arr1[0].equals(arr2[0]) ? arr3[0] : arr1[0].equals(arr3[0]) ? arr2[0] : arr1[0]);
		System.out.print(" ");
		System.out.print(arr1[1].equals(arr2[1]) ? arr3[1] : arr1[1].equals(arr3[1]) ? arr2[1] : arr1[1]);
		in.close();
	}
}
