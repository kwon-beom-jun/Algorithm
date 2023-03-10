package baekjoon.step10001_20000.step10001_11000.step10801_10900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon10818 {
	public static void main(String[] args) {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			int num = Integer.parseInt(bf.readLine());
			String str[] = bf.readLine().split(" ");
			
			int max = -1000000;
			int min = 1000000;
			
			for (int i = 0; i < num; i++) {
                if (max < Integer.parseInt(str[i])) {
                    max = Integer.parseInt(str[i]);
                }
                if (min > Integer.parseInt(str[i])) {
                    min = Integer.parseInt(str[i]);
                }
            }
			System.out.println(min + " " + max);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
