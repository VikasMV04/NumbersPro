package NumbersPro;

import java.util.Scanner;
// it is the number whose product by itself gives the original number.
public class F_find_the_square_root_of_given_number {

	public static void main(String[] args) 
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enetr the Number");
	int x=sc.nextInt();
	
	int low=1;
	int high=x/2;
	boolean flag=false;
	
	while(low<=high)
	{
		int mid=(low+high)/2;
		int sqr=mid*mid;
		if(sqr==x)
		{
			flag=true;
			System.out.println(mid+" is square root of "+x);
			break;
		}else if(sqr<x)
		{
			low=mid+1;
		}else
		{
			high=mid-1;
		}
	}
	if(flag==false)
	{
		System.out.println("it does't have square root number");
	}
	}

}
