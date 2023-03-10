package baekjoon.step1_10000.step4001_5000.step4601_4700;

import java.util.ArrayList;

public class BaekJoon4673 {
	public static void main(String[] args) {
		
		int num = 1;
		int resultnum = 0;
		ArrayList<Integer> result = new ArrayList<>();
		
		for (int i = 1; i <= 10000; i++) {
			result.add(i);
		}

		while (num <= 10000) {
		
			resultnum = num;
			
			for (int i = 0; i < Integer.toString(num).length(); i++) {
				resultnum += Integer.parseInt(String.valueOf((Integer.toString(num).charAt(i))));
			}
			if(result.indexOf(resultnum) != -1) {
				result.set(result.indexOf(resultnum), 0);
			}
			num++;
            
		}

		for (int i = 0; i < result.size(); i++) {
			if(result.get(i) != 0) {
				System.out.println(result.get(i));
			}
		}
		
	}
}
