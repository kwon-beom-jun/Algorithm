package baekjoon.step10001_20000.step14001_15000.step14801_14900;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon14888_Success_Final {
	
	// operator : + == 0, - == 1, * == 2, / == 3 
	static int A[], operator[];
	static int max = -1000000000;
	static int min = 1000000000;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		String arr[] = in.readLine().split(" ");
		operator = new int[4];
		A = new int[num];
		
		for (int i = 0; i < A.length; i++) {
			A[i] = Integer.parseInt(arr[i]);
		}
		
		arr = in.readLine().split(" ");
		for (int i = 0; i < 4; i++) {
			operator[i] = Integer.parseInt(arr[i]);
		}
		
		Operataion(A[0], 0);
		
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
	public static void Operataion(int num, int depth) {
		
		if (depth == A.length-1) {
			min = num < min ? num : min;
			max = num > max ? num : max;
			return;
		}
		
		for (int i = 0; i < 4; i++) {
			if (operator[i] > 0) {
				operator[i]--;
				
				Operataion(
					i == 0 ? num + A[depth+1] : 
					i == 1 ? num - A[depth+1] :
					i == 2 ? num * A[depth+1] :
							 num / A[depth+1]
				 , depth + 1
				);
				
				operator[i]++;
			}
		}
	}
}
