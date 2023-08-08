package baekjoon.step20001_30000.step28001_29000.step28201_28300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon28235 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String str = in.readLine();
		
		if (str.equals("SONGDO")) {
			System.out.println("HIGHSCHOOL");
		} else if (str.equals("CODE")) {
			System.out.println("MASTER");
		} else if (str.equals("2023")) {
			System.out.println("0611");
		} else if (str.equals("ALGORITHM")) {
			System.out.println("CONTEST");
		}
		
		in.close();
	}
}