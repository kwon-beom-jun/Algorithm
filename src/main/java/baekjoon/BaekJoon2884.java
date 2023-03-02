package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BaekJoon2884 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String writer = reader.readLine();
		String hour = null;
		String minite = null;
		
		String[] writer_arr = writer.split(" ");
		
		if((Integer.parseInt(writer_arr[1]) - 45) >= 0 ? true : false) {
			hour = writer_arr[0];
			minite = Integer.toString((Integer.parseInt(writer_arr[1]) - 45));
		}else {
			hour = Integer.toString((Integer.parseInt(writer_arr[0]) - 1) >= 0 ? Integer.parseInt(writer_arr[0]) -1 : 23);
			minite = Integer.toString(Integer.parseInt(writer_arr[1]) - 45 + 60);
		}
		
		System.out.println(hour + " " + minite);
        
        /*
        StringTokenizer 사용
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(stk.nextToken());
		int M = Integer.parseInt(stk.nextToken());
		M = M-45;
		if(M<0) {
			H--;
			if(H<0) {
				H = 23;
			}
			M = M+60;
		}
		
		System.out.println(H+" "+M);*/
		
	}
}
