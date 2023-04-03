package NumbersPro;

import java.util.Scanner;

public class C_NeonNumber {

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
