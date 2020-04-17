import java.io.BufferedReader;
import java.io.FileReader;

public class Voting {

    public void vote(int age,String address,String name) throws UnderAgeException,InvalidDetailsException,NotAValidAddressException
    {
        String nameOfCandidate="Sandeep";
        String addressofCandidate="Alwal";

        if(age<18)
        {
            throw new UnderAgeException("Not a right age to excersice votes");
        }
        else
        {
            System.out.println("Can vote");
        }

        if(!nameOfCandidate.equals(name))
            throw new InvalidDetailsException("Fake person");

        if(!addressofCandidate.equals(address))
            throw new NotAValidAddressException("Fake address");

    }

    public static void main(String args[])
    {
        Voting vote=new Voting();
        try {
            vote.vote(18, "Shamirpet", "Sandeep");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        finally {
            System.out.println("finally block executed");
        }
    }

}
