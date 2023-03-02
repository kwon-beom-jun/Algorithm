package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1065 {
	
	public static void main(String[] args) {
		
		String arr[] = new String[3];
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		try {
		
			int i = Integer.parseInt(bf.readLine());
			
			if (i < 100) {
				
				System.out.println(i);
			
			} else {
			
				int cnt = 99;
				
				for (int j = 100; j <= i ; j++) {
		
					int A = j/100;
					int B = ((j-((j/100)*100)) - (j-(j/10)*10))/10;
					int C = j-(j/10)*10;
					
					if (A-B == B-C) {
						cnt++;
					}
				}
				System.out.println(cnt);
			}
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}

		
		
	}
	
}
