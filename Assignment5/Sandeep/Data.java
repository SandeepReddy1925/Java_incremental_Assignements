package Sandeep.assignment;

public class Data{

    public int test_Int_variable;
    public char test_Char_Variable;

    public void printVariable()
    {
        System.out.println(test_Int_variable);
        System.out.println(test_Char_Variable);
    }

    public void printLocalVariables()
    {
        int local_int;
        int local_char;

        /* we cannot print local variables without
            initialization because they not
            assigned with any default values
         */
        //System.out.println(local_char);
       // System.out.println(local_int);


    }
}
