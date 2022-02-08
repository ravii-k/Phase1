package String;

public class InsertMethod {

		public String insertStringAtPosition(String originalString, int position, String toBeInserted) {
		
			  int startIndex = 0;
			  int endIndex = originalString.length();
			  String newString = "";

			  for (int i = startIndex; i < endIndex; i++) {
			  // Insert the original string character into the new string
			  newString += originalString.charAt(startIndex);

			  if (startIndex == position) {
			   // Insert the string to be inserted into the new string
			   newString += toBeInserted;
			  }
			 }

			 return newString;
		
	}

}
