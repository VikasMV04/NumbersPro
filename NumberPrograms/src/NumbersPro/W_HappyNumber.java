package NumbersPro;

	public class W_HappyNumber 
	//Happy number is a number which will yield to 1 when you do sum of 
	//Individual number square repeatedly
	{
	
		public static void main(String[] args) 
		{
			int num=17;
	
			while(num>9)
			{
				int sum=0;
				while(num>0)
				{
				int ld=num%10;
				int sqr=(ld*ld)+sum;
				num=num/10;
				sum=sum+sqr;
				}
				sum=num;
			}
			if(num==1||num==7)
				System.out.println("Happy Number");
			else
				System.out.println("Not a Happy Number");
			
		}
	
	}
