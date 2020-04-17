import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Create a java program to search through the home directory and look for files that
 match a regular expression. The program should be able to take inputs repeatedly and
 should print out the full absolute path of the matching files found.*/

class FilesInDirectory
{
    //findFileMatchingRegex() tries to match file with given regex and also recursively
    //finds list of files in sub-directories.
    public void findFileMatchingRegex(File[] files,String regex)
    {
        for(File fileName:files)
        {

            //if file is a directory then again call the findFileMatchingRegex()
            if(fileName.isDirectory()) {
                File[] files1 = fileName.listFiles();
                findFileMatchingRegex(files1, regex);
            }
            Pattern pattern=Pattern.compile(regex);
            Matcher matcher=pattern.matcher(fileName.getName());
            boolean match=matcher.matches();
                if(match) {
                     printFileWithAbslutePath(fileName);
                }
            }

        }

    public void printFileWithAbslutePath(File f)
    {
        String absolutePath=f.getAbsolutePath();
        System.out.println("The absolute path of the file is "+absolutePath);
    }

    public static void main(String args[])
    {
        FilesInDirectory a=new FilesInDirectory();
        File file =new File(System.getProperty("user.home"));
        File[] files=file.listFiles();
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter regular Expression");
        String regex=scan.nextLine();

       while (!regex.equals("1"))
        {
            a.findFileMatchingRegex(files,regex);
            System.out.println("Enter regular Expression or if u want to quit press 1");
            regex=scan.nextLine();

        }



    }
}
