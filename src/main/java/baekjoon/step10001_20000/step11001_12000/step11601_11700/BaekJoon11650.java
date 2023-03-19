package baekjoon.step10001_20000.step11001_12000.step11601_11700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BaekJoon11650 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int arr[][] = new int[Integer.parseInt(in.readLine())][2];
		String value[];
		
		for (int i = 0; i < arr.length; i++) {
			value = in.readLine().split(" ");
			arr[i][0] = Integer.parseInt(value[0]);
			arr[i][1] = Integer.parseInt(value[1]);
		}
		
		Arrays.sort(arr, new Comparator<int[]>() { 
		    @Override
		    public int compare(int[] o1, int[] o2) {
		        return o1[0]!=o2[0] ? o1[0]-o2[0] : o1[1]-o2[1];
		    }
		});
		
		for (int[] num : arr) {
			sb.append(num[0] + " " + num[1] + "\n");
		}
		
		in.close();
		System.out.println(sb);
	}
}
