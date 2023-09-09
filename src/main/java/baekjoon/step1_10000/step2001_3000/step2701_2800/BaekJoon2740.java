package baekjoon.step1_10000.step2001_3000.step2701_2800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon2740 {
    public static void main(String[] args) throws IOException {
    	
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        String arr[] = in.readLine().split(" ");
        int N = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);
        int A[][] = new int[N][M];
        
        for (int i = 0; i < N; i++) {
        	arr = in.readLine().split(" ");
			for (int j = 0; j < M; j++) {
				A[i][j] = Integer.parseInt(arr[j]);
			}
		}
        
        arr = in.readLine().split(" ");
        N = Integer.parseInt(arr[0]);
        M = Integer.parseInt(arr[1]);
        int B[][] = new int[N][M];
        
        for (int i = 0; i < N; i++) {
        	arr = in.readLine().split(" ");
			for (int j = 0; j < M; j++) {
				B[i][j] = Integer.parseInt(arr[j]);
			}
		}
        
        int answer[][] = new int[A.length][M];

        for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				for (int z = 0; z < B[0].length; z++) {
					answer[i][z] += A[i][j] * B[j][z];
				}
			}
		}
        
        for (int i = 0; i < answer.length; i++) {
			for (int j = 0; j < answer[i].length; j++) {
				sb.append(answer[i][j] + " ");
			}
			sb.append("\n");
		}
        
        System.out.println(sb.toString());
        in.close();
    }
}
