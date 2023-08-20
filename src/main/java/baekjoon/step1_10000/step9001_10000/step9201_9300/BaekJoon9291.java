package baekjoon.step1_10000.step9001_10000.step9201_9300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class BaekJoon9291 {
	
	static char testCase[][];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(in.readLine()), cnt = 0;
		
		Loop :
		while (cnt++ < num) {
			
			String str;
			testCase = new char[9][9];
			for (int i = 0; i < 9; ) {
				if(!(str = in.readLine()).isEmpty()) {
					testCase[i++] = str.replaceAll(" ", "").toCharArray();
				}
			}
			
			// 행, 열 체크
			boolean multiCheck_1[];
			boolean multiCheck_2[];
			for (int i = 0; i < 9; i++) {
				 multiCheck_1 = new boolean[9];
				 multiCheck_2 = new boolean[9];
				for (int j = 0; j < testCase.length; j++) {
					if (!multiCheck_1[testCase[i][j]-49] && !multiCheck_2[testCase[j][i]-49]) {
						multiCheck_1[testCase[i][j]-49] = true;
						multiCheck_2[testCase[j][i]-49] = true;
						continue;
					}
					sb.append("Case ").append(cnt).append(": INCORRECT").append("\n");
					continue Loop;
				}
			}
			
			// 3*3 정사각형 체크
			for (int i = 0; i < 9; i+=3) {
				for (int j = 0; j < 9; j+=3) {
					if (checkCase(i, j)) {
						sb.append("Case ").append(cnt).append(": INCORRECT").append("\n");;
						continue Loop;
					}
				}
			}
			
			sb.append("Case ").append(cnt).append(": CORRECT").append("\n");;
		}
		
		System.out.println(sb.toString());
		in.close();
	}
	
	public static boolean checkCase(int x, int y) {
		
		boolean multiCheck[] = new boolean[9];
		
		for (int i = x; i < x+3; i++) {
			for (int j = y; j < y+3; j++) {
				if (!multiCheck[testCase[i][j]-49]) {
					multiCheck[testCase[i][j]-49] = true;
					continue;
				}
				return true;
			}
		}
		
		return false;
	}
}
