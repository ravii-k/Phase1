package RegularExpr;

import java.util.regex.*;

public class RegularExpressions {
	public static final String Example_Test = "This is my small example string which I'm going to use for pattern matching.";

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\w+");
		// in case we would like to ignore case sensitivity,
		// we could use this statement:
		// Pattern pattern = Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(Example_Test);
		// check all occurance
		while (matcher.find()) {
			System.out.print("Start index: " + matcher.start());
			System.out.print(" End index: " + matcher.end() + " ");
			System.out.println(matcher.group());
		}
		// now create a new pattern and matcher to replace whitespace with tabs
		Pattern replace = Pattern.compile("\\s+");
		Matcher matcher2 = replace.matcher(Example_Test);
		System.out.println(matcher2.replaceAll("\t"));
	}
}