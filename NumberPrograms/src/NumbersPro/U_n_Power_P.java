package NumbersPro;

import java.util.Scanner;

public class U_n_Power_P 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enetr the base number");
	int base=sc.nextInt();
	System.out.println("Enetr the power number");
	int power=sc.nextInt();
	int ans=1;
	for(int i=1;i<=power;i++)
	{
		ans=base*ans;
	}
	System.out.println("answer = "+ans);
}
}
