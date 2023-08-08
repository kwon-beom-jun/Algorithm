package baekjoon.step1_10000.step1001_2000.step1901_2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 풀이
 * 		1|1 : 1
 * 		2|2 : 00 / 11
 * 		3|3 : 001 100 / 111
 * 		4|5 : 0011 1001 1100 / 0000 / 1111 
 * 		5|8 : 00111 10011 11001 11100 / 00001 00100 10000 / 11111
 * 		6|13 : 001111 100111 110011 111001 111100 / 
 *			   000011 001001 100001 001100 100100 110000 / 111111 / 000000
 * 		7|21 : 0000001 0000100 0010000 1000000 /
 * 	   		   0000111 0010011 1000011 0011001 1001001 1100001 0011100 1001100 1100100 1110000 /
 * 	   		   0011111 1001111 1100111 1110011 1111001 1111100 /
 * 	   		   1111111
 * 
 * 		Nn = N(n-1) + N(n-2)
 *  
 */
public class BaekJoon1904 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		
		int temp;
		int before = 1;
		int result = 1;
        
		// Nn = N(n-1) + N(n-2)
		// Nn % m = (N(n-1) + N(n-2)) % m
		// Nn % m = (N(n-1 % m) + (N(n-2) % m)) % m 
		for (int i = 1; i < n; i++) {
			temp = result;
			result = ((result % 15746) + (before % 15746)) % 15746;
			before = temp;
			
		}
		
		System.out.println(result);
		in.close();
	}
}
