package baekjoon.step1_10000.step2001_3000.step2401_2500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문제 풀이
 * 		1. 입력된 가로수 사이의 차이에 대한 값들의 최대 공약수를 구하는것이 핵심
 * 		2. 심어진 가로수 중 최소값의 가로수에서 최대 공약수를 더해가며 가로수가 심어져 있는지 확인
 * 
 * 	# 가로수의 위치 값이 순차적으로 증가하며 심어진다는 가정하에 진행
 *
 */
public class BaekJoon2485_Final {
	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[Integer.parseInt(in.readLine())];
		int N_1, N_2, interval_1, interval_2, result = 0;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(in.readLine());
		}
		
		N_1 = arr[0]; N_2 = arr[1];
		interval_1 = N_2 - N_1;
		
		for (int i = 2; i < arr.length; i++) {
			N_1 = N_2;
			N_2 = arr[i];
			interval_2 = N_2 - N_1;
			interval_1 = interval_1 > interval_2 ? gcd(interval_1, interval_2) : gcd(interval_2, interval_1);
		}
		
		
		int cnt = arr[0] + interval_1; // 심어진 가로수 중 최소값 + 최소공약수
		for (int i = 1; i < arr.length;) {
			if (arr[i] == cnt) {
				i++;
			} else {
				result++;
			}
			cnt += interval_1;
		}
		
		System.out.println(result);
		in.close();
	}
	
	public static int gcd(int a, int b)
	{
	    int c;
	    while(b != 0)
	    {
	        c = a % b;
	        a = b;
	        b = c;
	    }
	    return a;
	}
}
