package baekjoon.step1_10000.step1001_2000.step1501_1600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1546 {
	public static void main(String[] args) {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			String M = bf.readLine();
			String arr[] = bf.readLine().split(" ");
			
			double max = 0;
			double sum = 0;
			for (int j = 0; j < Integer.parseInt(M); j++) {
				if (Double.parseDouble(arr[j]) > max) {
					max = Double.parseDouble(arr[j]);
				}
				sum = sum + Double.parseDouble(arr[j]);
			}
			System.out.println((sum/Integer.parseInt(M))/max*100);
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
