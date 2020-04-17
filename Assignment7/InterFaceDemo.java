/*
 Create three interfaces, each with two methods. Inherit a new interface that combines
 the three, adding a new method. Create a class by implementing the new interface and 
 also inheriting from a concrete class. Now write four methods, each of which takes one 
 of the four interfaces as an argument. In main( ), create an object of your class and
 pass it to each of the methods.
*/
interface FoodItems
{
    void vegItems();
    void nonVegItems();
}
interface Desserts
{
    void availaibleIceCreams();
    void availaibleBiscuits();
}
interface Soups {
    void vegSoups();
    void nonVegSoups();
}
interface  MenuCard extends FooedItems, Desserts, Soups
{
    void selectFromMenuCard();
}

class Chef{
    void cook()
    {
        System.out.println("Cooks food items");
    }
}

class Restaurant extends Chef implements MenuCard
{

    @Override
    public void vegItems() {
        System.out.println("list of non veg items");
    }

    @Override
    public void nonVegItems() {
        System.out.println("list  of veg items");
    }

    @Override
    public void availaibleIceCreams() {
        System.out.println("list of availaible icecreams");
    }

    @Override
    public void availaibleBiscuits() {
        System.out.println("List of availaible Biscuits");
    }

    @Override
    public void vegSoups() {
        System.out.println("list of veg soups");
    }

    @Override
    public void nonVegSoups() {
        System.out.println("list of nonVeg soups");
    }

    @Override
    public void selectFromMenuCard() {
        System.out.println("Select dishes from menucard");
    }
}

public class InterFaceDemo {

    void interafec1(FooedItems items)
    {
        items.nonVegItems();
    }
    void interface2(Desserts desserts)
    {
        desserts.availaibleIceCreams();
    }
    void interface3(Soups soup)
    {
        soup.nonVegSoups();
    }
    void interface4(MenuCard card)
    {
        card.selectFromMenuCard();
    }
    public static void main(String args[])
    {
        InterFaceDemo demo=new InterFaceDemo();

        Restaurant res=new Restaurant();

        demo.interafec1(res);
        demo.interface2(res);
        demo.interface3(res);
        demo.interface4(res);

    }
}
