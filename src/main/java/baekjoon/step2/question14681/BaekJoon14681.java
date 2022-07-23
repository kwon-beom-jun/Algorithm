package baekjoon.step2.question14681;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon14681 {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int valueX = Integer.parseInt(reader.readLine());
		int valueY = Integer.parseInt(reader.readLine());

		String result = 
				(valueX > 0 && valueY > 0) == true ? "1" : 
				(valueX < 0 && valueY > 0) == true ? "2" : 
				(valueX < 0 && valueY < 0) == true ? "3" : 
				(valueX > 0 && valueY < 0) == true ? "4" : "Faile";

		System.out.println(result);

	}
}
