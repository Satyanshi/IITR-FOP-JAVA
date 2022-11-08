package com.lab.dsa2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		NodeFinding tree = new NodeFinding();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total number of nodes");
		int total = sc.nextInt();
		for(int i=0; i<total; i++) {
			tree.insert(sc.nextInt());
		}
		
		System.out.println("Enter sum:");
		int sum = sc.nextInt();
		
		tree.isPairPresent(tree.root, sum);
		sc.close();
		
	}

}
