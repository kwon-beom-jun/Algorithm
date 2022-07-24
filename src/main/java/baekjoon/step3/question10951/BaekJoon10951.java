package baekjoon.step3.question10951;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon10951 {
	public static void main(String[] args) {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		
		try {

			
			// Scanner를 사용하면 .hasNextLine()이나 .hasNextInt를 사용
			// BufferedReader를 사용하면 (input = br.readLine()) != null를 사용
			// EOF = 컴퓨팅에서, 파일 끝(End of File, EOF[1])는 데이터 소스로부터 더 이상 읽을 수 있는 데이터가 없음을 나타낸다.
			while ((str = bf.readLine()) != null && str.length() != 0) {
				
				
				String arr[] = str.split(" ");
				
				Integer A = Integer.parseInt(arr[0]);
				Integer B = Integer.parseInt(arr[1]);

				System.out.println(A+B);
				
				
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
