package baekjoon.step3.question10871;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BaekJoon10871 {
	public static void main(String[] args) {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			
			String arr[] = (bf.readLine()).split(" ");
			int A = Integer.parseInt(arr[0]);
			int B = Integer.parseInt(arr[1]);
			String arr2[] = bf.readLine().split(" ");
			
			for (int i = 0; i < A; i++) {
				if (Integer.parseInt(arr2[i]) < B) {
					bw.write(arr2[i] + " ");
				}
			}
			
			bw.flush();
			bw.close();
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
