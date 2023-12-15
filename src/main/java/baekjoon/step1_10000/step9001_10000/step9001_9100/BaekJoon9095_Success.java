package baekjoon.step1_10000.step9001_10000.step9001_9100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon9095_Success {

    static int memorization[] = new int[12];

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(in.readLine());

        for (int i = 0; i < T; i++) {
            sb.append(dfs(Integer.parseInt(in.readLine()))).append("\n");
        }

        System.out.println(sb.toString());
    }

    public static int dfs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n == 3) {
            return 4;
        }

        if (memorization[n] != 0) {
            return memorization[n];
        }

        memorization[n] = dfs(n-1) + dfs(n-2) + dfs(n-3);
        return memorization[n];
    }
}
