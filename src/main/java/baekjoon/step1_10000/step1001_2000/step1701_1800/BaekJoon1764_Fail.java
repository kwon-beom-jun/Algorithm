package baekjoon.step1_10000.step1001_2000.step1701_1800;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 *	시간 초과 
 *
 */
public class BaekJoon1764_Fail {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String NM[] = in.readLine().split(" ");
		ArrayList<String> n_arr = new ArrayList<>();
		ArrayList<String> m_arr = new ArrayList<>();
		
		for (int i = 0; i < Integer.parseInt(NM[0]); i++) {
			n_arr.add(in.readLine());
		}
		
		String str = "";
		for (int i = 0; i < Integer.parseInt(NM[1]); i++) {
			str = in.readLine();
			if (n_arr.indexOf(str) != -1) {
				m_arr.add(str);
			}
		}
		
		Collections.sort(m_arr);
		
		sb.append(m_arr.size() + "\n");
		for (int i = 0; i < m_arr.size(); i++) {
			sb.append(m_arr.get(i) + "\n");
		}
		
		System.out.println(sb.toString());
		in.close();
	}
}
