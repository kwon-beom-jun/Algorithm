package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon11720 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer result = new StringBuffer();
		int num = 0;
		
        // (첫째 줄 숫자의 개수 == 둘째 줄에 숫자 개수) 동일하므로 첫번째는 필요없음.
		reader.readLine();
		result.append(reader.readLine());
		reader.close();
		
		for (int i = 0; i < result.toString().length(); i++) {
			num += Integer.parseInt(String.valueOf(result.toString().charAt(i)));
		}
		
		System.out.println(num);
		
	}
}
