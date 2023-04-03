package NumbersPro;

public class E_MultiplicationTable {

	public static void main(String[] args) {
		
		for(int i=11;i<=20;i++)
		{
			for(int j=1;j<=10;j++)
			{
				int ans=i*j;
				System.out.print("|"+i+"*"+j+"="+ans+"| |");
			}
			System.out.println();
		}

	}

}
