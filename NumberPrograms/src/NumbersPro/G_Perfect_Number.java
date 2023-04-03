package NumbersPro;

import java.util.Scanner;

//A number is said to be a perfect number if the sum of its proper divisors 
//( i.e. all positive divisors excluding the number itself )is 
//equal to that number itself.
public class G_Perfect_Number
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the number");
		int num=sc.nextInt();
		int sum=0;
		for (int i = 1; i < num; i++) 
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
			
		}
		
		if(num==sum)
			System.out.println("Perfect number");
		else
			System.out.println("Not a perfect number");
	}

}
