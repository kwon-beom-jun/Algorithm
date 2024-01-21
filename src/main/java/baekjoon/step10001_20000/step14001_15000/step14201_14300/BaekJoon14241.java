package baekjoon.step10001_20000.step14001_15000.step14201_14300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon14241 {
	public static void main(String[] args) throws IOException{
		
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        in.readLine();
        int[] arr = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        Arrays.sort(arr);
        
        int before = arr[arr.length-1];
        int socre = 0;
        
        for (int i = arr.length-2; i >= 0; i--) {
			socre = before * arr[i] + socre;
			before = before + arr[i];
		}
            
        System.out.println(socre);
        in.close();
	}
}
