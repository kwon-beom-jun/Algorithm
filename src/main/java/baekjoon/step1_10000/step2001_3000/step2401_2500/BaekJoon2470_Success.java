package baekjoon.step1_10000.step2001_3000.step2401_2500;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon2470_Success {
    public static void main(String[] args) throws IOException {
    	
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String[] arr = in.readLine().split(" ");

        int[] N = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(N);

        int N1 = 0, N2 = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n - 1; i++) {
        	
            int low = i + 1, high = n - 1, mid = 0;

            while (low <= high) {
            	
                mid = (low + high) / 2;

                int sum = N[i] + N[mid];

                if (Math.abs(sum) < min) {
                    min = Math.abs(sum);
                    N1 = N[i];
                    N2 = N[mid];
                }

                if (sum < 0) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        System.out.println(N1 + " " + N2);
        in.close();
    }
}
