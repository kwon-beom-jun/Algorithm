package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2525 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] time = reader.readLine().split(" ");
		int add = Integer.parseInt(reader.readLine());
		
		System.out.println(
		Integer.parseInt(time[1]) + add >= 60 ? 
				Integer.parseInt(time[0]) + (Integer.parseInt(time[1]) + add)/60 >= 24 ? 
						(Integer.parseInt(time[0]) + (Integer.parseInt(time[1]) + add)/60 - 24) + " " + (Integer.parseInt(time[1]) + add)%60 : 
						(Integer.parseInt(time[0]) + (Integer.parseInt(time[1]) + add)/60) + " " + (Integer.parseInt(time[1]) + add)%60
			: 	time[0] + " " + (Integer.parseInt(time[1]) + add)
		);
		
	}
}
