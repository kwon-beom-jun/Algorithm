package baekjoon.step1_10000.step2001_3000.step2501_2600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * 문제 풀이
 *		1. 도화지의 크기에 상관없이 사용 가능함 ( map으로도 구현 가능 )
 *  
 */
public class BaekJoon2563_Success {
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(in.readLine());
		ArrayList<String> arr = new ArrayList<String>();
		String xy[];  
		int x, y;
		
		for (int i = 0; i < N; i++) {
			xy = in.readLine().split(" ");
			x = Integer.parseInt(xy[0]); 
			y = Integer.parseInt(xy[1]);
			
			for (int j = 0; j < 10; j++) {
				for (int z = 0; z < 10; z++) {
					if (arr.indexOf("x"+(x+j) +"y"+(y+z)) == -1) {
						arr.add("x"+(x+j) +"y"+(y+z));
					}
				}
			}
		}
		
		System.out.println(arr.size());
	}
}