package algorithm.baekjoon2000_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 문제 풀이
 *		1. 0의 해당 위치의 정사각형 9칸 검사 → 가로줄 검사 → 세로줄 검사하여 방문 가능 확인
 *		2. 방문하지 않은 값 1 ~ 9 중에 제일 적은 값 기입
 *		3. 순서대로 진행하다가 조건에 안맞으면 이전경로로 돌아가서 제일 적은 값의 다음 값으로 기입
 *		4. 1-3번  루프
 *		5. 0이 모두 채워지면 종료
 *
 */
public class BaekJoon2580_Success_2 {
	
	static int sudoku[][] = new int[9][9];
	static List<String> list = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 9; i++) {
			String arr[] = in.readLine().split(" ");
			for (int j = 0; j < 9; j++) {
				int num = Integer.parseInt(arr[j]);
				if (num == 0) {
					list.add(i+""+j);
				}
				sudoku[i][j] = Integer.parseInt(arr[j]);
			}
		}
		
		sudoku(0);
		
		in.close();
	}
	
	public static boolean sudoku(int depth) {

		if (depth == list.size()) {
			
			boolean check = true;
			
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					if (sudoku[i][j] == 0) {
						check = false;
						break;
					}
				}
			}
			
			if (check) {
				Arrays.stream(sudoku)
						.map(row -> Arrays.stream(row)
						.mapToObj(Integer::toString)
						.reduce((a, b) -> a + " " + b)
						.orElse(""))
						.forEach(System.out::println);
				return true;
			}
			
			return false;
		}
		
		/** 
		 * 문제 발생 원인
		 *	- 재귀함수로 넘어가지 않을 경우 현재칸에 값을 넣어주지 않고 다음칸으로 진행
		 *	  ex) 5번쨰 칸에 값이 들어갈게 없어서 이전칸으로 돌아가야하는데 i가 ++되면서 다음칸으로 진행되며 5번쨰 칸에는 0이 그대로 남음
		 */
		for (int i = 0 + depth; i < list.size(); i++) {
			
			int x = list.get(i).charAt(0)-'0';
			int y = list.get(i).charAt(1)-'0';
			boolean checkValue[] = new boolean[10];
//			boolean check = false;

			// 가로, 세로, 정사각형 값 확인
			checkValue = checkValue(checkValue, x, y);
			
			for (int j = 1; j < 10; j++) {
				if (!checkValue[j]) {
					sudoku[x][y] = j;
					if (sudoku(depth+1)) {
						return true;
					}
					sudoku[x][y] = 0;
//					check = true;
				}
			}
			
			/** 
			 * 해당 부분에 반환이 없어서 depth 다음 칸으로 진행
			 * 
			 * 주의
			 * 	for문에 "!checkValue[j] 내부 로직을 타지 않는다면 check값 true로 설정 후 return false"로 하는것도 문제가 되는 이유
			 * 		1. 4번째 칸은 값을 넣고 5번쨰 칸으로 이동, 이때 check는 true가 됨
			 * 		2. 5번쨰 칸에서 값 넣기 실패로 4번째 칸으로 되돌아옴
			 * 		3. 4번째 칸에서 나머지 4번째칸 0으로 초기화
			 * 		4. 실패로 이전으로 돌아가야하는데 check가 true라 4번째 칸은 0으로 놔두고 5번째칸으로 이동
			 */
//			if (!check) {
//				return false;
//			}
			return false;
		}
		
		return false;
	}
	
	public static boolean[] checkValue(boolean visit[], int x, int y) {
		
		// 가로, 세로 검사
		for (int i = 0; i < 9; i++) {
			if (sudoku[x][i] != 0) visit[sudoku[x][i]] = true;
            if (sudoku[i][y] != 0) visit[sudoku[i][y]] = true;
		}
		
		// 3*3 정사각형 검사
		for (int i = x/3*3; i < x/3*3+3; i++) {
			for (int j = y/3*3; j < y/3*3+3; j++) {
				if (sudoku[i][j] != 0) {
					visit[sudoku[i][j]] = true;
				}
			}
		}
		
		return visit;
	}
}
