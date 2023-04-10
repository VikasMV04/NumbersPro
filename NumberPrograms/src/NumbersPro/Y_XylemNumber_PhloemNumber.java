 package NumbersPro;

import java.util.Scanner;

public class Y_XylemNumber_PhloemNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the number");
		int num=sc.nextInt();
		int sumfl=0;
		int sumrest = 0;
		
		int last=num%10;

		num=num/10;
		
		while(num>9)
		{
			int lastdigit=num%10;
			sumrest=lastdigit+sumrest;
			num/=10;
		}
		
		sumfl=last+num;
	
		if(sumfl==sumrest)
			System.out.println("Xylem Number");
		else	
			System.out.println("Pholem Number");

	}

}
