public class ConstructorExample {

    public ConstructorExample(String surname)
    {
        this("Sandeep","Reddy");//this() is used to invoke current class constructor
        System.out.println(surname);
    }
    public ConstructorExample(String frstname,String middlename)
    {
        System.out.println("FirstName and MiddleName is "+frstname+" "+middlename);
    }

    public static void main(String args[])
    {

        ConstructorExample con=new ConstructorExample("Morusurajannagari");
    }

}
