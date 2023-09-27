package NumbersPro;

import java.util.Scanner;

public class B_SpyNumber 
{

//A spy number is a number where the sum of its digits equals 
//the product of its digits. For example, 1124 is a spy number, 
//the sum of its digits is 1+1+2+4=8 and the product of its digits 
//is 1*1*2*4=8.(1124,22,123)
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enetr the number");
	int num=sc.nextInt();
	int copy=num;
	int rem;
	int sum=0;
	int pro=1;
	while(num>0)
	{
		rem=num%10;
		sum+=rem;
		pro*=rem;
		num=num/10;
	}
	
	if(sum==pro)
	{
		System.out.println(copy+ " is spy number");
	}
	else
		System.out.println(copy+ " is not a spy number");
}
}
