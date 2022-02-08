package String;

public class DeleteMethod {

	public static void main(String[] args) {

			    // create a string buffer
			    StringBuffer str = new StringBuffer();

			    // add string to string buffer
			    str.append("Java");
			    str.append(" is");
			    str.append(" popular.");
			    System.out.println("StringBuffer: " + str);

			    // clear the string
			    // using delete()
			    str.delete(0, str.length());
			    System.out.println("Updated StringBuffer: " + str);
			  }
			}