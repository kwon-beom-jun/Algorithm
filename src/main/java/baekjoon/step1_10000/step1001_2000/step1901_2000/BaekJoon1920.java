package baekjoon.step1_10000.step1001_2000.step1901_2000;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class BaekJoon1920 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Map<Integer, Integer> map = new HashMap<>();
		
		int A[] = new int[Integer.parseInt(in.readLine())];
		String Aarr[] = in.readLine().split(" ");
		
		int M[] = new int[Integer.parseInt(in.readLine())];
		String Marr[] = in.readLine().split(" ");
		
		for (int i = 0; i < Aarr.length; i++) {
			A[i] = Integer.parseInt(Aarr[i]);
		}
		for (int i = 0; i < Marr.length; i++) {
			M[i] = Integer.parseInt(Marr[i]);
			map.put(M[i], 0);
		}
		
		Arrays.sort(A);
		Arrays.sort(M);
		
		int Acnt = 0;
		int Mcnt = 0;
		while (Mcnt != M.length && Acnt != A.length) {
			if (M[Mcnt] == A[Acnt]) {
				map.put(M[Mcnt], 1);
				Mcnt++;
                Acnt++; // 같이 증가하지 않으면 M[Mcnt] > A[Acnt] 구문을 한번 더 진행함
			} else if (M[Mcnt] < A[Acnt]) {
				Mcnt++;
			} else {
				Acnt++;
			}
		}
		
		for (String string : Marr) {
			sb.append(map.get(Integer.parseInt(string)));
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
