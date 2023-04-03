package NumbersPro;

public class P_Nth_Fibonaccie_Of_Number 
{

	public static void main(String[] args) 
	{
		int nth = 10;
		int a = 0;
		int b = 1;
		
		int n=0;
		for (int i = 1; i <= 10; i++) {
		int c = a + b;
		System.out.print(a + " ");
		n=a;
		a = b;
		b = c;
		}
		System.out.println();
		System.out.println("************************");
		System.out.println(n);
	}
}
