package baekjoon.step7.question10250;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon10250 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		/**
	 		H : 층 수
	 		W : 방 수
	 		N : 몇 번째 손님
	 		
	 		N < H ? N : N % H == 0 ? H : N % H // 각 층의 제일 앞쪽부터 채워짐
	 		N % H == 0 ? N / H : N / H + 1 = 해당 호
	 		W <= 99 각 층의 방 수 최대가 99 이하이므로 최대 두자리 수 and 호는 한자리수가 될 수 없음 → 항상 두자리 수
	 			해당 호 < 10  ? "0" : ""
	 			ex) N = 5, W = 3, N = 3 : 301호(○), 31호(X)
		 */
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[][] question = new String[Integer.parseInt(reader.readLine())][]; // 입력 갯수
		int H, W, N;
		
		for (int i = 0; i < question.length; i++) {
			question[i] = reader.readLine().split(" ");
		}
		
		for (int i = 0; i < question.length; i++) {
			
			H = Integer.parseInt(question[i][0]);
			W = Integer.parseInt(question[i][1]);
			N = Integer.parseInt(question[i][2]);
			
			System.out.println(
				(N < H ? N : N % H == 0 ? H : N % H) // 층 수
				+ ((N % H == 0 ? N / H : N / H + 1) < 10  ? "0" : "") // 해당 층의 호의 자릿수 체크
				+ (N % H == 0 ? N / H : N / H + 1)); // 해당 층의 호
            /*
            System.out.println(
                (N < H ? N : N % H == 0 ? H : N % H) // 층 수
                + String.format("%02d",(int) Math.ceil(N / H))); // 해당 층의 호
            */
		
		}
		
	}
}
