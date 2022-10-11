package com.currency;

import java.util.Scanner;

public class CurrencyAmountCalMain {

	public static void main(String[] args) {
		
		int size, amount;
		System.out.println("Enter the size of the currency");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt(); // taking size input		
		System.out.println("enter the currency denominations value");
		int[] currency = new int[size];
		for(int i=0; i<size;i++) {
			currency[i] = sc.nextInt(); // taking currency denomination value input
		}
		System.out.println("enter the amount you want to pay");
		
		amount = sc.nextInt(); // taking amount input
		
		CurrencyDenominationCalculation cdc = new CurrencyDenominationCalculation(); // objection creation
		
		cdc.currenyDenominationCal(currency,size,amount); // calling service function
		sc.close();
		
	}

}
