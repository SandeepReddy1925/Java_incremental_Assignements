package Sandeep.assignment;

import java.text.SimpleDateFormat;

public class Singleton {

    public String string_variable;

    public static Singleton initializiNonStstic(String string)
    {
        Singleton object=new Singleton();

        object.string_variable=string;//we cannot directly initialize non static field directly we will use class reference

        return object;
    }

    public void printNonStaticMethod()
    {
        Singleton object=initializiNonStstic("Sandeep");
        System.out.println(object.string_variable);
    }


}