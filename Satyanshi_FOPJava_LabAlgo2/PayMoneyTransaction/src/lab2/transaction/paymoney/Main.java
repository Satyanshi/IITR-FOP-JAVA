package lab2.transaction.paymoney;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int size, target, targetNumber;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of transaction array");
		size = sc.nextInt();
		
		System.out.println("enter the values of array");
		int[] transactionValue = new int[size];
		 for(int i = 0; i<size; i++) {
			 transactionValue[i] = sc.nextInt();
		 }
		 
		 System.out.println("enter the total no of targets that needs to be achieved"); 
		 targetNumber = sc.nextInt();
		 
		System.out.println("enter the value of target");
		target = sc.nextInt();
		
		MoneyTransaction mt = new MoneyTransaction();
		mt.transaction(transactionValue, size, target, targetNumber);
		sc.close();

	}

}
