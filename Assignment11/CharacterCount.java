import javax.print.attribute.HashAttributeSet;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/*

 Using TextFile and a Map<Character,Integer>, create a program that takes
 the file name as a command line argument and counts the occurrence of all
 the different characters. Save the results in a text file.

*/
public class CharacterCount {

    private HashMap<Character,Integer>charCount;

    public CharacterCount()
    {
        charCount=new HashMap<Character, Integer>();
    }

    public void readFile(String filename) throws IOException {


        File file=new File(filename);

        BufferedReader br=new BufferedReader(new FileReader(file));

        String line;
        while((line=br.readLine())!=null)
        {
            line=line.toLowerCase();

            for(char ch:line.toCharArray())
            {
                if(!charCount.containsKey(ch))
                {
                    charCount.put(ch,1);
                }
                else
                {
                    int value=charCount.get(ch);
                    charCount.put(ch,value+1);
                }
            }
        }

        br.close();

    writeResultsToFile(charCount);

    }

   public void writeResultsToFile(HashMap<Character,Integer>charCountMap) throws IOException {

        FileWriter writer =new FileWriter("results.txt");

       for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
           writer.write("Charcter  "+entry.getKey()+" have occured "+entry.getValue() +" time\n");
       }

        writer.close();
    }

    public static void main(String[] args) throws IOException {
        HashMap<Character, Integer> c = new HashMap<Character, Integer>();
        CharacterCount diffChar = new CharacterCount();
	String file=args[0];
        diffChar.readFile(file);

    }
}
