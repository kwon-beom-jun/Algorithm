package baekjoon.step1_10000.step1001_2000.step1001_1100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1100 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		char chessBoard[];
		
		int cnt = 0;
		for (int i = 0; i < 8; i++) {
			chessBoard = in.readLine().toCharArray();
			for (int j = 0; j < 8; j++) {
				if ((i % 2 == 0 && j % 2 == 0 && chessBoard[j] == 'F')
				  ||(i % 2 == 1 && j % 2 == 1 && chessBoard[j] == 'F')) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
		in.close();
	}
}