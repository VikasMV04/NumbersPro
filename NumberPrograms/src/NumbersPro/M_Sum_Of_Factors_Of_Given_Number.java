package NumbersPro;

import java.util.Scanner;


public class M_Sum_Of_Factors_Of_Given_Number
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the number");
		int num=sc.nextInt();
		int sum=0;
		for (int i = 1; i <=num; i++) 
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum = "+sum);
	}

}
