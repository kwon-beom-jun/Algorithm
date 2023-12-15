package baekjoon.step1_10000.step9001_10000.step9001_9100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon9095_Success_2 {
    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(in.readLine());
        
        int arr[] = {0,1,2,4,7,13,24,44,81,149,274,504};

        for (int i = 0; i < T; i++) {
            sb.append(arr[Integer.parseInt(in.readLine())]).append("\n");
        }

        System.out.println(sb.toString());
    }
}
