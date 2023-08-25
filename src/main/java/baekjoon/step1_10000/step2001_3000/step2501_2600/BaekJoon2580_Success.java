package algorithm.baekjoon2000_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaekJoon2580_Success {
	
	static int sudoku[][] = new int[9][9];
	static List<String> list = new ArrayList<>();
	static boolean visit;
	
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
		
			
		int x = list.get(depth).charAt(0)-'0';
		int y = list.get(depth).charAt(1)-'0';
		List<Integer> availableNumbers = checkUseValue(x, y);
		
		for (int num : availableNumbers) {
	        sudoku[x][y] = num;
	        if (sudoku(depth + 1)) {
	            return true;
	        }
	        sudoku[x][y] = 0;
	    }
		
		 return false;
	}
	
	public static List<Integer> checkUseValue(int x, int y) {
		
		boolean[] isUsed = new boolean[10];
		
		// 가로, 세로  검사
	    for (int i = 0; i < 9; i++) {
	        isUsed[sudoku[x][i]] = true;
	        isUsed[sudoku[i][y]] = true;
	    }

	    // 3x3 정사각형 검사
	    for (int i = x/3*3; i < x/3*3+3; i++) {
	        for (int j = y/3*3; j < y/3*3+3; j++) {
	            isUsed[sudoku[i][j]] = true;
	        }
	    }
		
	    // 사용 가능한수 List로 추출
		List<Integer> availableNumbers = new ArrayList<>();
	    for (int i = 1; i <= 9; i++) {
	        if (!isUsed[i]) {
	            availableNumbers.add(i);
	        }
	    }
	    
	    return availableNumbers;
	}
}
