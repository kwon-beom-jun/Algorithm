package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1712 {
	public static void main(String[] args) throws IOException {
		
        // int ? = sc.nextInt(); -> (A / (C - B)) + 1 : 속도 향상
        
		String[] question = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
		int A = Integer.parseInt(question[0]), B = Integer.parseInt(question[1]), C = Integer.parseInt(question[2]),breakEndPoint = 0, result;
		
		if (B < C) {
			result = A;
			while(result >= 0){
				result = (result+B)-C;
				breakEndPoint++;
			}
			System.out.println(breakEndPoint);
		}else {
			System.out.println(-1);
		}
		
	}
}
