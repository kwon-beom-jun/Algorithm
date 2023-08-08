package baekjoon.step10001_20000.step11001_12000.step11201_11300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon11292 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringBuilder temp = new StringBuilder();
		
		float tall, max;
		String arr[], name, num;
		
		while (!(num = in.readLine()).equals("0")) {
			
			name = "";
			tall = 0;
			max = 0;
			
			for (int i = 0; i < Integer.parseInt(num); i++) {
				arr = in.readLine().split(" ");
				tall = Float.parseFloat(arr[1]);
				if (max == tall) {
					temp.append(" ");
					temp.append(arr[0]);
				}else if (max < tall) {
					temp.setLength(0);
					temp.append(arr[0]);
					max = tall;
				}
			}
			
			sb.append(temp.toString());
			sb.append("\n");
			temp.setLength(0);
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
