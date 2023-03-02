package baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

public class BaekJoon2562 {
	public static void main(String[] args) {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			
			List<String> arr = new ArrayList<String>();
			String str = null;
			int result = 0;
			int cnt = 0;
			
			while ( (str = bf.readLine()) != null && str.length() != 0 ) {
				
				arr.add(str);
						
				int num = Integer.parseInt(str);
				if (result < num) {
					result = num;
				}
				
			}
			
			for (int i = 0; i < arr.size(); i++) {
				if (arr.get(i).equals(String.valueOf(result))) {
					cnt = i;
				}
			}
			
			
			
			bw.write(result+"\n"+(cnt+1));
			bw.flush();
			bw.close();
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
