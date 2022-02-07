package assistedProjects;

class DefaultAccess {
	  int thisIsDefault;   //default data member
	  void defaultMethod() //   method declared as default
	  {
	      System.out.println("This is a default method inside package assistedProjects");
	  }
	}
	//Using the default members inside the different class but within the same package
class Default {      //Different class
	  public static void main(String args[])
	  {
	    DefaultAccess obj1 = new DefaultAccess();
	    obj1.thisIsDefault = 200;
	    System.out.println("Value of private member is: " +obj1.thisIsDefault);
	    obj1.defaultMethod();
	  }
	}

