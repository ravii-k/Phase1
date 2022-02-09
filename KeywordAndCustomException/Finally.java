package KeywordAndCustomException;
import java.util.Scanner;
public class Finally {

	public static void main(String[] args) {
		   int num1, num2, result;
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter any two numbers: ");
	        num1 = input.nextInt();
	        num2 = input.nextInt();
	        try {
	            if(num2 == 0)
	                throw new ArithmeticException("Division by zero");
	            result = num1 / num2;
	            System.out.println(num1 + "/" + num2 + "=" + result);
	        }
	        catch(ArithmeticException ae) {
	            System.out.println("Problem info: " + ae.getMessage());
	        }
	        finally {
	            System.out.println("The finally block executes always");
	        }
	        System.out.println("End of the program");	
	    }
	            
	}