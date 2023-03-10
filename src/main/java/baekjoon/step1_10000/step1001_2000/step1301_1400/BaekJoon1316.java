package baekjoon.step1_10000.step1001_2000.step1301_1400;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1316 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int forNum =  Integer.parseInt(reader.readLine());
		String[] readarr = new String[forNum];
		// next == -1 : start
		// next == -2 : break
		int next = -1;
		int result = 0;
		
		for (int i = 0; i < forNum; i++) {
			readarr[i] = reader.readLine();
		}
		
		for (int i = 0; i < readarr.length; i++) {
			
			String readStr = readarr[i];
			
			for (int j = 0; j < readStr.length(); j++) {
				
				next = -1;
				
				if (!(readStr.indexOf(String.valueOf(readStr.charAt(j))) == readStr.lastIndexOf(String.valueOf(readStr.charAt(j))))) {
					for (int z = 0; z < readStr.length(); z++) {
						if (String.valueOf(readStr.charAt(j)).equals(String.valueOf(readStr.charAt(z)))) {
							if (next == -1 || (next != z && next == z-1)) {
								next = z;
							}else {
								next = -2;
								break;
							}
						}
					}	
				}
				if (next == -2) {
					break;
				}
				if (j == readStr.length()-1 && next != -2) {
					result++;
				}
				
				
			}
		}

		System.out.println(result);
		
	}
}
