package NumbersPro;

public class I_PrimeNumbers_Between_the_ranges {

	public static void main(String[] args) {
		int i, m = 0;
		int start=1;
		int end=10;
		
		for (int s = start; s <= end; s++) 
		{
			boolean flag=true;
			if (s == 0 || s == 1) {
//				System.out.println(s + " not a prime number");
			} else {
				for (i = 2; i <= s/2; i++) {
					if (s % i == 0) {
//						System.out.println(s + " not a prime number");
						flag = false;
						break;
					}
				}
				if (flag == true) {
					System.out.println(s + " is a prime number");
				}
			}
		}
	}

}
