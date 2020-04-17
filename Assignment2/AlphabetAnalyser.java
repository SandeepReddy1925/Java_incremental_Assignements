import java.util.Scanner;
import java.util.Arrays;

/* The class AlphabetAnalyser checks whether the given string contains all the alphabet.
    So comming to time complexity f(n)=4n+2 after ignoring all the initializations the
    time complexity is O(n) is dependent on length of string.

    The space complexity in here is i have initialized a int variable index 4bytes,boolean array visited 26*4=104bytes,
    and input has n*1+1(where n is no of characters) So it is linear space complexity O(n)
    */

public class AlphabetAnalyser {


    /* the method checkForAllAlphabet takes string as input. I have used a boolean visited array to mark the every
     characters presence.Using for loop i will check each character and update its presence in visited array by
     using their u=index.At last again iam using visited array to check if every character is present by using
     index if ever character is present then returns true else false.
     */

    public boolean checkForAllAlphabet(String input) {

        int index = 0;

        boolean[] visited = new boolean[26];

        input=input.toLowerCase();

        for (int i= 0; i < input.length(); i++) {

            if ('a' <= input.charAt(i) && input.charAt(i) <= 'z') {
                index = input.charAt(i) - 'a';
                visited[index] = true;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (!visited[i]) {
                return false;
            }
        }
        return true;
    }


    public static void main(String args[])
    {
        AlphabetAnalyser check=new AlphabetAnalyser();

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter input:");

        String input=scan.nextLine();

        boolean containsAllAlphabet=check.checkForAllAlphabet(input);

        if(containsAllAlphabet)
            System.out.println("\""+input+"\"\tcontain every alphabet");
        else
            System.out.println("\""+input+"\"\t does not contain every alphabet");


    }


}
