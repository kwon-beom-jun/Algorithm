package baekjoon.step1_10000.step1001_2000.step1101_1200;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon1193 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int roomNum = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
		int fraction, denominator, check = 1; 
		String position = null;

        if (roomNum == 1) {
			System.out.println("1/1");
		}else {
            /**
		 		i++ : 위, 아래 변경 - 대각선 i번째 위치
		 		check : 해당 대각선 이전까지의 합계 ex) 입력 5, check 3
		 		position : 위, 아래
			 */
			for (int i = 2; ; i++) {
				check += i;
				if (check >= roomNum) {
                    
					check -= i;
					position = i%2 == 0 ? "위" : "아래";
					fraction = position.equals("위") ? 1 : i; 
					denominator = position.equals("위") ? i : 1;

//					System.out.println("i ( 숫자 최대 값 ) == "+i);
//					System.out.println("check == "+check);
//					System.out.println("position == "+position);
//					System.out.println("-----"+fraction+"/"+denominator+"-----");
                    
                    if (position.equals("위")) {
						while (check < roomNum-1) {
							fraction++;
							denominator--;
							check++;
						}
					}else {
						while (check < roomNum-1) {
							fraction--;
							denominator++;
							check++;
						}
					}
					break;
				}
			}
			System.out.println(fraction + "/" + denominator);
		}
	}
}
