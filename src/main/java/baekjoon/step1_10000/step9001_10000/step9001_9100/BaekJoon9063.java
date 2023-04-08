package baekjoon.step1_10000.step9001_10000.step9001_9100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon9063 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		int xMin = 10000, xMax = -10000, yMin = 10000, yMax = -10000, x, y;
		String arr[];
		
		for (int i = 0; i < num; i++) {
			arr = in.readLine().split(" ");
			x = Integer.parseInt(arr[0]);
			y = Integer.parseInt(arr[1]);
			
			xMin = xMin < x ? xMin : x;
			xMax = xMax > x ? xMax : x;
			yMin = yMin < y ? yMin : y;
			yMax = yMax > y ? yMax : y;
		}
		
		System.out.println(num == 1 ? 0 : ( xMax - xMin ) * ( yMax - yMin ));
		in.close();
	}
}
