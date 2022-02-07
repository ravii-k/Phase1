package assistedProjects;


class PrivateAccess
	{
	private int thisIsPrivate;    
	  private void privateMethod()  
	  {
	    System.out.println("THis is private method");
	  }
	
	
	public static void main(String args[])
	  {
		PrivateAccess obj1 = new PrivateAccess();
	    obj1.thisIsPrivate = 100;
	    System.out.println("Value of private member is: " +obj1.thisIsPrivate);
	    obj1.privateMethod();
	  }
}
// trying to access the members of the PrivateAccess class with the objwect of other classes
class AccessModifier { //declaring another class



	public static void main(String args[]) {
	AccessModifier obj1 = new AccessModifier();
     obj1.thisIsPrivate = 100;
   System.out.println("Value of private member is: " +obj1.thisIsPrivate);
        obj1.privateMethod();
}
}
