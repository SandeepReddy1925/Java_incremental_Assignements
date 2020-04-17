/*
  Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle. 
  Add a balance( ) method to Unicycle and Bicycle, but not to Tricycle.
  Create instances of all three types and upcast them to an array of Cycle.
  Try to call balance( ) on each element of the array and observe the results.
  Downcast and call balance( ) and observe what happens.
*/
class Cycle {
    void balance(){
        System.out.println("in cycle");
    }
}

class Unicycle extends Cycle {
    void balance(){
        System.out.println("in unicycle");
    }
}

class Bicycle extends Cycle {
    void balance(){
        System.out.println("in bicycle");
    }
}

class Tricycle extends Cycle {
}


public class Demo {

    public static void main(String[] args) {
        //upcatsing means casting to super class type
        Cycle arr[] = new Cycle[3];
        arr[0] = new Unicycle();
        arr[1] = new Bicycle();
        arr[2] = new Tricycle();

        arr[0].balance();  //this calls balance() method in Unicycle eventhough it is upcasted object
        arr[1].balance();  //this calls balance() method in Bicycle eventhough it is upcasted object
        arr[2].balance();  //this calls balance() method in cycle class


        //Downcasting means casting to its own individual type
        Unicycle uni=new Unicycle();
        uni.balance();//calls balance method of Unicycle class
        Bicycle byc=new Bicycle();
        byc.balance();//calls balance method of Bicycle class
        Tricycle tri=new Tricycle();
        tri.balance();//call balance method of Cycle class ycle class
    }
}

