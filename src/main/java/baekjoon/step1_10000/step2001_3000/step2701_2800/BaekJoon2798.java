package baekjoon.step1_10000.step2001_3000.step2701_2800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;

public class BaekJoon2798 {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String NM[] = in.readLine().split(" ");
		String arr[] = in.readLine().split(" ");
		int card[] = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			card[i] = Integer.parseInt(arr[i]);
		}
		
		int sum = Integer.parseInt(NM[1]);
		int result = 0;
		
		for (int i = 0; i < arr.length-2; i++) {
			for (int j = i+1; j < arr.length-1; j++) {
				for (int k = j+1; k < arr.length; k++) {
					if ( result <  card[i] + card[j] + card[k] 
						&&	sum >= card[i] + card[j] + card[k] ) {
						result = card[i] + card[j] + card[k];
					}
				}
			}
		}
		
		in.close();
		System.out.println(result);
	}
}
