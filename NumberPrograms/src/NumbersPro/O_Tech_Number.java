package NumbersPro;

import java.util.Scanner;

//A number is called a tech number if the given number has an even number of 
//digits and the number can be divided exactly into two parts from the middle.
//After equally dividing the number, sum up the numbers and find the square of
//the sum. If we get the number itself as square, the given number is a tech 
//number, else, not a tech number. For example, 3025 is a tech number.

public class O_Tech_Number 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int no=sc.nextInt();
		int num=no;
		int copy=no;
		int totoalDigits=count(no);

		if(totoalDigits%2==0)
		{
			//dividing the number to half
			int split=totoalDigits/2;

			//finding denominator weather it is 10 100 1000 10000 based
			//no of digits
			int denominator=metdofdiv(split);
			
			int num2=copy%denominator;
			int num1=copy/denominator;
			
			int num3=num1+num2;
			int sqr=num3*num3;
			
			if(num==sqr)
			System.out.println("tech number");
			else
			System.out.println("not tech number");
			
		}
		else
		{
			System.out.println("Enter the even digits number");
		}
	}

	//******************************************************************
	private static int metdofdiv(int split) 
	{
		int ds = 1;
		for(int i=1;i<=split;i++)
		{
			ds=ds*10;
		}
		return ds;
	}
	
//********************************************************
	private static int count(int no) 
	{
		int a=0;
		while(no!=0)
		{
			no/=10;
			a++;
		}
		return a;
	}

}

