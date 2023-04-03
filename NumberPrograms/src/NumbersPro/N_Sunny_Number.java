package NumbersPro;

import java.util.Scanner;

public class N_Sunny_Number
{
	
//	A number is called a sunny number if the number next to the given 
//	number is a perfect square. In other words, a number N will be a 
//	sunny number if N+1 is a perfect square.
	
	public static void main(String[] args) {

		boolean flag = false;
		System.out.println("Eneter the number");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		int finalnumber=num+1;
		
		for (int i = 1; i <= finalnumber; i++)
		{
			if (i * i == finalnumber) 
			{
				flag = true;
				break;
			} 
			else {

			}
			
		}
		if (flag) {
			System.out.println("Sunny Number");
		} else {
			System.out.println("Not a Sunny Number");
		}

	}


}
