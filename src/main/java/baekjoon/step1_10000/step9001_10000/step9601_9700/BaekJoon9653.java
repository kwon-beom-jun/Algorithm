package baekjoon.step1_10000.step9001_10000.step9601_9700;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BaekJoon9653 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		sb.append("    8888888888  888    88888\n"
				+ "   88     88   88 88   88  88\n"
				+ "    8888  88  88   88  88888\n"
				+ "       88 88 888888888 88   88\n"
				+ "88888888  88 88     88 88    888888\n"
				+ "\n"
				+ "88  88  88   888    88888    888888\n"
				+ "88  88  88  88 88   88  88  88\n"
				+ "88 8888 88 88   88  88888    8888\n"
				+ " 888  888 888888888 88  88      88\n"
				+ "  88  88  88     88 88   88888888");
		
		System.out.println(sb.toString());
		in.close();
	}
}
