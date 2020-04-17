import java.io.File;
import java.util.Scanner;



// noode of the SList
class Node<Type> {

    // value contained in the node
    Type value;

    //pointer to the next node
    Node<Type> nextPtr;

    Node(Type value, Node<Type> nextPtr) {
        this.value = value;
        this.nextPtr = nextPtr;
    }

    Node(Type value) {
        this(value, null);
    }

    public String toString() {
        if(value == null) return "null";
        return value.toString();
    }
}

class SList<Type> {
    private Node<Type> head = new Node<Type>(null);
    public Node<Type> getHead()
    {
        return head;
    }

    SListIterator<Type> iterator() { return new SListIterator<Type>(head); }

    public String toString() {

        if(head.nextPtr == null) return "list is empty";
        SListIterator<Type> it = this.iterator();
        String s = new String();
        while(it.hasNext()) {
            s=s.concat(it.next() + (it.hasNext() ? "-->" : ""));
        }
        return s;

    }
}

class SListIterator<Type> {
    Node<Type> current;

    SListIterator(Node<Type> link) {
        current = link;
    }

    public boolean hasNext() {
        return current.nextPtr != null;
    }

    public Node<Type> next() {
        current = current.nextPtr;
        return current;
    }

    public void insert(Type value) {
        current.nextPtr = new Node<Type>(value, current.nextPtr);
        current = current.nextPtr;
    }

}


public class Slist {
    public static void main(String[] args) {
        SList<String> list = new SList<String>();
        System.out.println(list);
        SListIterator<String> iterator = list.iterator();

        while(true){
            System.out.println("To insert press: 1\n to display the list press: 2\nto exit press: 3\n");
            Scanner in = new Scanner(System.in);
            String option = in.nextLine();

            if(option.equals("3")) {
                break;
            }

            else if(option.equals("1")) {
                System.out.println("enter the value");
                String value = in.nextLine();
                iterator.insert(value);
            }

            else if(option.equals("2")) {
                System.out.println(list);
            }
        }
    }
}
