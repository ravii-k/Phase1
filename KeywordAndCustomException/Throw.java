package KeywordAndCustomException;
import java.util.Scanner;
public class Throw {
	                          
	    int num1, num2, result;
	    Scanner input = new Scanner(System.in);
	                
	    void division() throws ArithmeticException {
	        System.out.print("Enter any two numbers: ");
	        num1 = input.nextInt();
	        num2 = input.nextInt();
	        result = num1 / num2;
	        System.out.println(num1 + "/" + num2 + "=" + result);
	    }
	                
	    public static void main(String[] args) {
	                    
	        try {
	            new Throw().division();
	        }
	        catch(ArithmeticException ae) {
	            System.out.println("Problem info: " + ae.getMessage());
	        }
	        System.out.println("End of the program");		
	    }
	}