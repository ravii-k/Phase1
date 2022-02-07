package assistedProjects;

public class PublicModifier {
	public void main() {
	  System.out.println("Hello");
}

public class Test extends PublicModifier {
public static void main(String args[]) {
	PublicModifier first = new PublicModifier();
	first.main();
}
}}
