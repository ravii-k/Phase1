package assistedProjects;

class ProtectedModifier {
	 protected static int count;

	   public void update(){
	      System.out.println(++count);
	   }

	   public class Test extends ProtectedModifier {

	      public static void main(String args[]) {

	    	  ProtectedModifier out = new ProtectedModifier();
	         out.update();
	      }
	   }
}
