package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2577{
	public static void main(String[] args) {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		try {
		
			int A = Integer.parseInt(bf.readLine());
			int B = Integer.parseInt(bf.readLine());
			int C = Integer.parseInt(bf.readLine());
			String result = null;
			
			result = String.valueOf(A*B*C);
			String arr[] = result.split("");
			
			int num0 = 0;
			int num1 = 0;
			int num2 = 0;
			int num3 = 0;
			int num4 = 0;
			int num5 = 0;
			int num6 = 0;
			int num7 = 0;
			int num8 = 0;
			int num9 = 0;
			
			for (int i = 0; i < result.length(); i++) {
				if (arr[i].equals("0")) {
					num0++;
				} else if (arr[i].equals("1")) {
					num1++;
				} else if (arr[i].equals("2")) {
					num2++;
				} else if (arr[i].equals("3")) {
					num3++;
				} else if (arr[i].equals("4")) {
					num4++;
				} else if (arr[i].equals("5")) {
					num5++;
				} else if (arr[i].equals("6")) {
					num6++;
				} else if (arr[i].equals("7")) {
					num7++;
				} else if (arr[i].equals("8")) {
					num8++;
				} else if (arr[i].equals("9")) {
					num9++;
				}
			}
			
			System.out.println(num0 + "\n" + num1 + "\n" + num2 + "\n" + 
			num3 + "\n" + num4 + "\n" + num5 + "\n" + num6 + "\n" + num7 + "\n" + num8 + "\n" + num9);
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
	}
}
