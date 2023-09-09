package baekjoon.step1_10000.step2001_3000.step2401_2500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon2470_Success_Final {
    public static void main(String[] args) throws IOException {
    	
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        in.readLine();
        String[] arr = in.readLine().split(" ");

        int[] N = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(N);
        
        int i = 0;
        int j = N.length-1;
        int gap = Integer.MAX_VALUE;
        int N1 = 0, N2 = 0;
        
        int temp;
        int sum;
        while (i < j || N[i] + N[j] == 0) {
			sum = N[i] + N[j];
			temp = Math.abs(sum);
			if (temp < gap) {
				gap = temp;
				N1 = N[i];
				N2 = N[j];
			}
			if (sum > 0) {
				j--;
			} else {
				i++;
			}
		}

        System.out.println(N1 + " " + N2);
        in.close();
    }
}
