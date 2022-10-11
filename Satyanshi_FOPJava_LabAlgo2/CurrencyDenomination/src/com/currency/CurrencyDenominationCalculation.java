package com.currency;

import java.util.Arrays;

public class CurrencyDenominationCalculation {
	
	public void currenyDenominationCal(int currency[], int size, int amount) {
		
		int count=0;
		Arrays.sort(currency); //sorting array in ascending
		
		int i = size-1; // taking array last value (the highest one)
		
		while(amount != 0) {
			 /* checking if amount is greater then only perform operation for that currency value*/
			if(amount >=currency[i]) {
				if(amount % currency[i] == 0) {
					count = amount/currency[i];
					System.out.println(currency[i] + ":" +count);
					amount = 0;
				} else {
					count = amount/currency[i];
					System.out.println(currency[i] + ":" +count);
					amount = amount - currency[i]*count;
				}
			} else { // else decrement the currency value
				i--;
			}
		}
		
		
	}

}
