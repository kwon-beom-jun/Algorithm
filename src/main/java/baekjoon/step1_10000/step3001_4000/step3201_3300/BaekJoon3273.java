package baekjoon.step1_10000.step3001_4000.step3201_3300;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BaekJoon3273 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(in.readLine());
		
		int arr[] = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		Arrays.sort(arr);
		
		int x = Integer.parseInt(in.readLine());
		
		int front = 0;
		int rear = num-1;
		int cnt = 0;
		
		for (int i = 0; i < num; i++) {
			if (front == rear) {
				break;
			}
			if (arr[front] + arr[rear] == x) {
				cnt++;
				rear--;
			} else if (arr[front] + arr[rear] > x) {
				rear--;
			} else {
				front++;
			}
		}
		
		System.out.println(cnt);
		in.close();
	}
}
