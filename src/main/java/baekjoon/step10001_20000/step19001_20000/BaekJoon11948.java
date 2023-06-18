package baekjoon.step10001_20000.step19001_20000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon11948 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;

		int A[] = {
			Integer.parseInt(in.readLine()) ,
			Integer.parseInt(in.readLine()) ,
			Integer.parseInt(in.readLine()) ,
			Integer.parseInt(in.readLine())
		};
		int B[] = {
			Integer.parseInt(in.readLine()) ,
			Integer.parseInt(in.readLine())
		};
		
		Arrays.sort(A);
		Arrays.sort(B);

		sum += A[1] + A[2] + A[3] + B[1];
		
		System.out.println(sum);
		in.close();
	}
}
