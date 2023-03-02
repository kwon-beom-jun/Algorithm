package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon1000 {
	public static void main(String[] args){
			
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {
			String StL = in.readLine();
			String St[] = StL.split(" ");

			int A = Integer.parseInt(St[0]);
			int B = Integer.parseInt(St[1]);

			System.out.println(A + B);
			
		} catch (Exception e) {
			System.out.println("실패");
		}
		
	}
}
