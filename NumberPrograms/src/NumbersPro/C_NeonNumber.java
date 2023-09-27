package NumbersPro;

import java.util.Scanner;

public class C_NeonNumber {
	//A neon number is a number where the sum of digits of the square of the number is equal to the number. (9 0 1.)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int square=num*num;
		int sum=0;
		while(square!=0)
		{
			int rem=square%10;
			sum+=rem;
			square/=10;
		}
		
		if(sum==num)
			System.out.println("Neon Number");
		else
			System.out.println("Not a neon number");

	}

}
