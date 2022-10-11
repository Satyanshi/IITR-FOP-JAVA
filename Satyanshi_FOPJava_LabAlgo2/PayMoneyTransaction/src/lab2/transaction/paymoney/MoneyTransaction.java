package lab2.transaction.paymoney;

public class MoneyTransaction {

	public void transaction(int transactionArr[], int size, int target, int targetNumber) {
		int flag = 0;
		int count =0;
		while (targetNumber != 0) {
			int value = 0;
			for (int i = 0; i < size; i++) {
			value += transactionArr[i];
			if (value >= target) {
				count = i+1;
			flag = 1;
			break;
		  }
		}
		   targetNumber--;
       }
		if (flag == 0) {
			   System.out.println(" Given target is not achieved ");
			 } else {
				 System.out.println("Target achieved after "+ count + " transactions ");
			 }
	}

}
