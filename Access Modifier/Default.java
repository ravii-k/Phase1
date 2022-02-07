package importDefaultDemo;
import assistedProjects.*;
class Default {
	public static void main(String args[])
	  {
	             Default obj1 = new Default();
	             //Accessing the members from different package gives an error
	             obj1.thisIsDefault = 200;
	             System.out.println("Value of default member: " +obj1.thisIsDefault);
	             obj1.defaultMethod();
	  }
	}

//Accessing the default members inside the different class from different package gives an error –
//output
	/*
	 * error:- 
	 * Exception in thread "main" java.lang.Error: Unresolved compilation
	 * problems: thisIsDefault cannot be resolved or is not a field thisIsDefault
	 * cannot be resolved or is not a field The method defaultMethod() is undefined
	 * for the type Default
	 * 
	 * at AssistedProjects/defaultDemo.Default.main(Default.java:8)
	 */