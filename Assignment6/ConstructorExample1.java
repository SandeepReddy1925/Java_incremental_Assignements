public class ConstructorExample1 {

    public ConstructorExample1(String call)
    {
        System.out.println(call);
    }

    public static void main(String args[])
    {
        ConstructorExample1[] constructorArray= new ConstructorExample1[6];

        for(int i=0;i<constructorArray.length;i++)
        {
            constructorArray[i]=new ConstructorExample1(i+"call");
        }
    }
}
