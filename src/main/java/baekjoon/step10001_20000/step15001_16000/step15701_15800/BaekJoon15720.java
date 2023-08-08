package baekjoon.step10001_20000.step15001_16000.step15701_15800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon15720 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Integer[] BCD = parseIntegerArr(in.readLine().split(" "));
		Integer[] price = parseIntegerArr(in.readLine().split(" "));
		Integer[] side = parseIntegerArr(in.readLine().split(" "));
		Integer[] drink = parseIntegerArr(in.readLine().split(" "));
		
		int totalPrice = sumIntArr(price) + sumIntArr(side) + sumIntArr(drink);
		
		int discount = 0;
		for (int i = 0; i < BCD[2]; i++) {
			discount += (price[i] + side[i] + drink[i]) / 10;
		}
		
		System.out.println(totalPrice);
		System.out.println(totalPrice-discount);
		in.close();
	}
	
	public static Integer[] parseIntegerArr(String arr[]) {
		
		Integer intArr[] = new Integer[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			intArr[i] = Integer.parseInt(arr[i]);
		}
		
		Arrays.sort(intArr, (a,b) -> b-a);
		return intArr;
	}
	
	public static int sumIntArr(Integer[] price) {
		
		int sum = 0;
		
		for (int i = 0; i < price.length; i++) {
			sum += price[i];
		}
		
		return sum;
	}
}
