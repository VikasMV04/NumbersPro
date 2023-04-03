package NumbersPro;

import java.util.Scanner;

public class J_SpyNumber {
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
