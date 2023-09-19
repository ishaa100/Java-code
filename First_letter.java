import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class First_letter {

	public static void main(String[] args)
	{
		String s1 = "Talent needs improvement";
		String s2 = "A Computer Science Portal should always updated";
		
		Pattern p = Pattern.compile("\\b[a-zA-Z]");
		
		Matcher m1 = p.matcher(s1);
		Matcher m2 = p.matcher(s2);
		
		System.out.println("First letter of each word from the string \"" + s1 + "\" : ");
		while (m1.find())
			System.out.print(m1.group());
		
		System.out.println();
		
		System.out.println("First letter of each word from string
 \"" + s2 + "\" : ");
		
		while (m2.find())
			System.out.print(m2.group());
		
		
	}
}
