package Sandeep.assignment;

public class Main {

    public static void main(String args[])
    {
        Data data=new Data();
        data.printVariable();
        data.printLocalVariables();


        Singleton.initializiNonStstic("Sandeep");
        Singleton singleton=new Singleton();
        singleton.printNonStaticMethod();

    }
}
