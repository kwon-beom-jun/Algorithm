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
public class BaekJoon2580_Success_Final {
	
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
			Arrays.stream(sudoku)
					.map(row -> Arrays.stream(row)
					.mapToObj(Integer::toString)
					.reduce((a, b) -> a + " " + b)
					.orElse(""))
					.forEach(System.out::println);
			return true;
		}
		
		int x = list.get(depth).charAt(0) - '0';
        int y = list.get(depth).charAt(1) - '0';

        // 가로, 세로, 정사각형 값 확인
        boolean checkValue[] = new boolean[10];
 		checkValue = checkValue(checkValue, x, y);
 		
 		for (int j = 1; j < 10; j++) {
        	if (!checkValue[j]) {
                sudoku[x][y] = j;
                if (sudoku(depth + 1)) {
					return true;
				}
                sudoku[x][y] = 0;  // backtrack
            }
        }
 		
 		return false;
	}
	
	public static boolean[] checkValue(boolean visit[], int x, int y) {
		
		// 가로, 세로 검사
		for (int i = 0; i < 9; i++) {
			if (sudoku[x][i] != 0) {
				visit[sudoku[x][i]] = true;
			}
			if (sudoku[i][y] != 0) {
				visit[sudoku[i][y]] = true;
			}
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
