package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon4344 {
	public static void main(String[] args) {
		
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			
			int count = Integer.parseInt(bf.readLine());
			String arr[] = new String[count];
			
			for (int i = 0; i < count; i++) {
				arr[i] = bf.readLine();
			}
			
			double sum = 0;
			double percent = 0;
			double cnt = 0;
			double result[] = new double[count];
			
			
			for (int i = 0; i < arr.length; i++) {
				
				String N[] = arr[i].split(" ");
				
				for (int j = 1; j < N.length; j++) {
					sum += Double.parseDouble(N[j]); 
				}
				percent = sum/(N.length-1);
				//System.out.println(percent);
				
				for (int j = 1; j < N.length; j++) {
					if (percent < Double.parseDouble(N[j])) {
						cnt++;
					}
				}
				result[i] = cnt/(N.length-1)*100;
				sum = 0;
				cnt = 0;
			}
			
			for (int j = 0; j < result.length; j++) {
//				그냥하면 40.000 은 뒤에 40.0으로 나옴 format 해줘야뎀
//				System.out.println( Math.round(result[j]*1000d)/1000d );
				
//				반올림까지 다 해줌.
				System.out.println(String.format("%.3f", result[j])+"%");
			}
			
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
