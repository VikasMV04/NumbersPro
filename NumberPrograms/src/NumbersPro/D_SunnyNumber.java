package NumbersPro;

import java.util.Scanner;

public class D_SunnyNumber {

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
