package baekjoon.step20001_30000.step27001_28000.step27801_27900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon27866 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String S = in.readLine();
		
		System.out.println(S.charAt(Integer.parseInt(in.readLine())-1));
		in.close();
	}
}
