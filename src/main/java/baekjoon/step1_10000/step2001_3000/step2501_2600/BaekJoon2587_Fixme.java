package baekjoon.step1_10000.step2001_3000.step2501_2600;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 풀이
 *		1. 평균값 도출
 *		2. 각각의 입력값을 배열에 추가
 *		3. for문 사용
 *			3-1. 현재 배열의 값을 평균값에서 빼고 절대값으로 변경 후 check 변수에 저장
 *			3-2. 이전 절대값과 현재 절대값을 비교
 *		4. 제일 낮은 절대값을 가지고 있는 배열값을 표출  
 *
 *	# 정렬 알고리즘을 사용 X
 *	# 시간 알고리즘 : O(n)
 *
 */
// 100 50 20 10 30 : 실패 / 무조건 정렬을 사용해야되나?
public class BaekJoon2587_Fixme {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int result[] = new int[5];
		int average = 0, place = 0;
		int check, abs; 
		
		for (int i = 0; i < 5; i++) {
			int num = Integer.parseInt(in.readLine());
			average += num;
			result[i] = num;
		}
		
		check = average; // 제일 큰 수로 초기화
		average /= 5; // 평균
		
		for (int i = 0; i < result.length; i++) {
			if (average - result[i] == 0) {
				place = i;
				break;
			}
			abs = Math.abs(average - result[i]);
			if (abs < check) {
				place = i;
				check = abs;
			}
		}
		
		System.out.println(average + "\n" + result[place]);
		in.close();
	}
}
