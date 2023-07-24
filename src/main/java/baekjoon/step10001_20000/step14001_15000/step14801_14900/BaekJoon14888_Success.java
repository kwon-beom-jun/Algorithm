package baekjoon.step10001_20000.step14001_15000.step14801_14900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon14888_Success {
	
	// operator : + = 0, - = 1, * = 2, / = 3 
	static int A[], temp, operator[], location[];
	static int min = 1000000000, max = -1000000000;
	static boolean visit[];
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		String arr[] = in.readLine().split(" ");
		A = new int[num];
		operator = new int[num-1];
		location = new int[num-1];
		visit = new boolean[num-1];
		
		for (int i = 0; i < A.length; i++) {
			A[i] = Integer.parseInt(arr[i]);
		}
		
		arr = in.readLine().split(" ");
		for (int i = 0, j = 0; i < arr.length; i++) {
			num = Integer.parseInt(arr[i]);
			for (int z = 0; z < num; z++, j++) {
				operator[j] = i;
			}
		}
		
		Operataion(0);
		
		System.out.println(max + "\n" + min);
		in.close();
	}
	
	/**
		+ / - *	 │  / + - *
		+ / * -  │  / + * -
		+ - / *  │  / * - +
		+ - * /  │  / * + -
		+ * - /  │  .
		+ * / -  │  .
	*/
	public static void Operataion(int depth) {
		
		if (depth == operator.length) {
			temp = A[0];
			for (int i = 1; i < A.length; i++) {
				if (operator[location[i-1]] == 0) {
					temp += A[i];
				} else if (operator[location[i-1]] == 1) {
					temp -= A[i];
				} else if (operator[location[i-1]] == 2) {
					temp *= A[i];
				} else {
					temp = temp < 0 ? -(Math.abs(temp) / A[i]) : temp / A[i] ;
				}
			}
			
			min = temp < min ? temp : min;
			max = temp > max ? temp : max;
			return;
		}
		
		for (int i = 0; i < operator.length; i++) {
			
			if (visit[i] == false) {
				visit[i] = true;
				
				location[depth] = i;
				Operataion(depth + 1);
				
				visit[i] = false;
			}
		}
	}
}
