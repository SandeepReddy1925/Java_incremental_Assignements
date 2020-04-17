public class ConstructorExample2 {


    public ConstructorExample2(String call) {
        System.out.println(call);
    }

    public static void main(String args[]) {
        //creating objects to attach to the array of references.

        ConstructorExample2 constructor1 = new ConstructorExample2("first call");
        ConstructorExample2 constructor2 = new ConstructorExample2("second call");
        ConstructorExample2 constructor3 = new ConstructorExample2("third call");
        ConstructorExample2 constructor4 = new ConstructorExample2("fourth call");
        ConstructorExample2 constructor5 = new ConstructorExample2("fifth call");

        ConstructorExample2[] constructorArray = new ConstructorExample2[5];

        constructorArray[0] = constructor1;
        constructorArray[1] = constructor2;
        constructorArray[2] = constructor3;
        constructorArray[3] = constructor4;
        constructorArray[4] = constructor5;


    }
}