import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 Using the documentation for java.util.regex.Pattern as a resource, write and test 
 a regular expression that checks a sentence to see that it begins with a capital 
 letter and ends with a period.
*/
public class RegularExpressions {

    public void patternMatching(String sentence)
    {
        if(isMatchesPattern(sentence))
        {
            System.out.println("done");
        }
        else
        {
            System.out.println("not");
        }
    }

   public boolean isMatchesPattern(String sentence)
    {
        Pattern pattern=Pattern.compile("^[A-Z][a-z]+[a-z A-Z]*[a-z A-Z]+.$");
        Matcher matcher=pattern.matcher(sentence);
        boolean matched=matcher.matches();

        return matched;
   }

   public static void main(String args[])
   {
       RegularExpressions regex=new RegularExpressions();
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter a String to test whether it matches the pattern");
       String sentence=scan.nextLine();
       regex.patternMatching(sentence);
   }
}
