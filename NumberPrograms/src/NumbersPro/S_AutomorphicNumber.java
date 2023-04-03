package NumbersPro;

public class S_AutomorphicNumber {

	public static void main(String[] args) {
		int num = 76;
		int sqr = num * num;

		boolean flag = true;
		while (num > 0) {
			if (num % 10  == sqr % 10 ) 
			{
				num =num/10;
				sqr =sqr/10;
			}
			else{
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("Automorphic number");
		else
			System.out.println("not a Automorphic number");

	}

}
