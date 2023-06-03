package baekjoon.step1_10000.step5001_6000.step5301_5400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon5337 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		sb.append(".  .   .\n");
		sb.append("|  | _ | _. _ ._ _  _\n");
		sb.append("|/\\|(/.|(_.(_)[ | )(/.\n");
		
		System.out.println(sb.toString());
		in.close();
	}
}
