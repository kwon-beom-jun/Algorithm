package baekjoon.step10001_20000.step14001_15000.step14201_14300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon14215 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String arr[] = in.readLine().split(" ");
		int ABC[] = new int[3];
		
		ABC[0] = Integer.parseInt(arr[0]);
		ABC[1] = Integer.parseInt(arr[1]);
		ABC[2] = Integer.parseInt(arr[2]);
		
		Arrays.sort(ABC);
		
		System.out.println(ABC[2] < ABC[1] + ABC[0] ? ABC[2] + ABC[1] + ABC[0] : (ABC[1] + ABC[0]) * 2 - 1);
		in.close();
	}
}
