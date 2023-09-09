package baekjoon.step1_10000.step5001_6000.step5601_5700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon5635 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		
		String minName = "";
		String maxName = "";
		int minOld[] = new int[3];
		int maxOld[] = new int[3];
		String temp[];
		
		temp = in.readLine().split(" ");
		minName = maxName = temp[0];
		for (int i = 0; i < 3; i++) {
			minOld[i] = Integer.parseInt(temp[i+1]);
			maxOld[i] = Integer.parseInt(temp[i+1]);
		}
		
		for (int i = 1; i < num; i++) {
			
			temp = in.readLine().split(" ");
			
			for (int j = 2; j >= 0; j--) {
				if (minOld[j] < Integer.parseInt(temp[j+1])) {
					minOld[0] = Integer.parseInt(temp[1]);
					minOld[1] = Integer.parseInt(temp[2]);
					minOld[2] = Integer.parseInt(temp[3]);
					minName = temp[0];
					break;
				} else if (minOld[j] > Integer.parseInt(temp[j+1])) {
					break;
				}
			}
			for (int j = 2; j >= 0; j--) {
				if (maxOld[j] > Integer.parseInt(temp[j+1])) {
					maxOld[0] = Integer.parseInt(temp[1]);
					maxOld[1] = Integer.parseInt(temp[2]);
					maxOld[2] = Integer.parseInt(temp[3]);
					maxName = temp[0];
					break;
				} else if (maxOld[j] < Integer.parseInt(temp[j+1])) {
					break;
				}
			}
		}
		
		System.out.println(minName + "\n" + maxName);
		in.close();
	}
}
