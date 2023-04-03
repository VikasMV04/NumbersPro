package NumbersPro;

import java.util.Scanner;

//Strong Numbers are the numbers whose sum of factorial of digits is equal to the original number.

public class l_Strong_Number {
	
	public static void main(String[] args) {

		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		while (num != 0) {
			int fact = 1;
			int rem = num % 10;
			for (int i = 1; i <= rem; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			num = num / 10;
		}

		if (sum == temp)
			System.out.println("Strong Number");
		else
			System.out.println("Not a Strong number");
	}
}