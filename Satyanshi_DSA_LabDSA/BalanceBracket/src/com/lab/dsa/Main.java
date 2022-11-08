package com.lab.dsa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter :");
		String str = sc.nextLine();
		int size = str.length();
		BalanceBracket br = new BalanceBracket();
		if(br.isBracketBalanced(str, size)) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
    sc.close();
	}

}
