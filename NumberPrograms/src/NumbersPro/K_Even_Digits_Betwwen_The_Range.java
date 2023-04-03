package NumbersPro;

import java.util.Scanner;

public class K_Even_Digits_Betwwen_The_Range 
{
	
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enetr the start range");
	int start=sc.nextInt();
	System.out.println("Enetr the end range");
	int end=sc.nextInt();
	
	for (int i = start; i <= end; i++) 
	{
		if(i%2==0)
			System.out.println(i);
	}
}
}