package baekjoon.step7.question2775;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BaekJoon2775 {
	public static void main(String[] args) throws IOException {
		
		/**
		 	1	5	15	35	70
			1	4	10	20	35	56	...	
			1	3	6	10	15	21	28	36	45	55
			1	2	3	4	5	6	7	8	9	10	11	12	13	14
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
//		Map 사용시 오름차순으로 자동 정렬되어 틀림.
//		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> question = new ArrayList<>();
		
		int count = Integer.parseInt(reader.readLine());
		int room[][] = new int[15][14];
		
		for (int i = 0; i < count; i++) {
			question.add(Integer.parseInt(reader.readLine()));
			question.add(Integer.parseInt(reader.readLine()));
		}
		
		for (int i = 0; i < 15; i++) {
			for (int j = 0; j < 14; j++) {
				
//				room[i][j] = i == 0 ? j + 1 : j == 0 ? 1 : room[i][j-1] + room[i-1][j];
				
				if (i == 0) {
					room[i][j] = j+1;
				}else if (j == 0) {
					room[i][j] = 1;
				}else {
					room[i][j] = room[i][j-1] + room[i-1][j];
				}
				
			}
		}
		
		for (int i = 0; i < question.size(); i = i+2) {
			System.out.println(room[question.get(i)][question.get(i+1)-1]);
		}
		
		
	}
}
