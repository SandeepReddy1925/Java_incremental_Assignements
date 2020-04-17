import java.util.ArrayList;

/*. A vampire number v is a number with an even number of digits n, that can be 
factored into two numbers x and y each with n/2 digits and not both with trailing
zeroes, where v contains precisely all the digits from x and from y, in any order.
 Write a java program to print first 100 vampire numbers.*/

public class VampireNumber {

    ArrayList<String> permutations;
	
	public VampireNumber()
	{
	permutations = new ArrayList<String>();
	}

    public boolean isVampireNumber(String num) {

        if (num.length() % 2 != 0)
            return false;

        Permutation perm = new Permutation();//creating object of Permutation class

        permutations = perm.permutate(num, 0, num.length() - 1);

        boolean isVampire=printVampireNumber(num);

        return isVampire;

    }



    public boolean printVampireNumber(String num) {

        for(String word:permutations)
        {
            String firstPart = word.substring(0, num.length() / 2);
            String secondPart = word.substring(num.length() / 2, num.length());

            if(firstPart.charAt(firstPart.length()-1)=='0' && secondPart.charAt(secondPart.length()-1)=='0')
                return false;

            if(Integer.parseInt(firstPart)*Integer.parseInt(secondPart)==Integer.parseInt(num))
            {
                System.out.println(num);
                return true;
            }
        }


        return false;
    }


    public void vampire() {
        int i = 1001;
        int count = 0;
        while (count<100) {
            String num = String.valueOf(i);
            i++;
            if (isVampireNumber(num))
                count++;
        }


    }
    public static void main(String args[])
    {
        VampireNumber number=new VampireNumber();

        number.vampire();
    }

}
