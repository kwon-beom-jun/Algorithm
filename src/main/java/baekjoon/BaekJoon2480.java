package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon2480 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] number = reader.readLine().split(" ");
		Arrays.sort(number);
		
		System.out.println(
			number[0].equals(number[1]) && number[0].equals(number[2]) ? Integer.toString(10000 + Integer.parseInt(number[0])*1000) : 
			// Integer.parseInt(number[1]) : Arrays.sort로 정렬 후 중앙의 숫자는 자릿수가 3자리이므로 앞이나 뒤의 값 중 하나는 같다.
			number[0].equals(number[1]) || number[0].equals(number[2]) || number[1].equals(number[2]) ? Integer.toString(1000 + Integer.parseInt(number[1])*100) :
			Integer.parseInt(number[number.length - 1]) * 100
		);
		
	}
}
