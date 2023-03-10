package baekjoon.step10001_20000.step11001_12000.step11001_11100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon11021 {
	public static void main(String[] args) {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		try {
		
			int A = Integer.parseInt(bf.readLine());
			
			for (int i = 1; i <= A; i++) {
				String arr[] = bf.readLine().split(" ");
				int B = Integer.parseInt(arr[0]);
				int C = Integer.parseInt(arr[1]);
				System.out.println("Case #" + i + ": " + (B+C));
			}
		
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
