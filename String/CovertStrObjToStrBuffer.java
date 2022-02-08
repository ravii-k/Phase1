package String;

public class CovertStrObjToStrBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Mybook");
		String str = sb.toString();
		System.out.println("***Before append***");
		System.out.println("StringBuffer contains: " + sb);
		System.out.println("String object contains: " + str);

		sb.append(".com");

		System.out.println("***After append***");
		System.out.println("StringBuffer contains: " + sb);
		System.out.println("String object contains: " + str);
	}
}