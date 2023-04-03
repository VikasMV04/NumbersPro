package NumbersPro;

public class R_DuckNumber {

	 static boolean check_duck(String num)
	    {
	       
	        int i = 1, n = num.length();
	    
	        if(num.charAt(0)=='0')
	        	return false;
	      
	        // Check remaining digits
	        while (i < n) 
	        {
	            if (num.charAt(i) == '0')
	            return true;
	            i++;
	        }
	 
	        return false;
	    }
	 
	    // Driver Method
	    public static void main(String args[]) 
	    {
	        String num = "01023";
	        if (check_duck(num))
	            System.out.println("It is a duck number");
	        else
	            System.out.println("It is not a duck number");
	    }

}
