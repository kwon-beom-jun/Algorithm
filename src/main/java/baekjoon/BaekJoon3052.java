package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon3052 {
	public static void main(String[] args) {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int num[] = new int[10];
		int cnt = 0;
		
		
		try {
			
			String[] s_array = {bf.readLine(),bf.readLine(),bf.readLine(),bf.readLine(),bf.readLine()
					,bf.readLine(),bf.readLine(),bf.readLine(),bf.readLine(),bf.readLine()};
			
			for (int i = 0; i < s_array.length; i++) {
				
				num[i] = (Integer.parseInt(s_array[i])) % 42;
				
				for (int j = 0; j <= i; j++) {
					if (num[j] == num[i] && i != j) {
						cnt--;
						break;
					}
				}
				cnt++;
			}
			System.out.println(cnt);
			
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
	}
}
