 /*Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster,etc. In the base class,
 provide methods that are common to all Rodents,and override these in the derived classes to
 perform different behaviors depending on the specific type of Rodent. Create an array of
 Rodent, fill it with different specific types of Rodents, and call your base-class methods 
 to see what happens. Make the methods of Rodent abstract whenever possible and all classes 
 should have default constructors that print a message about that class.*/
    abstract class Rodent
    {
        public Rodent()
        {
            System.out.println("Rodents are mammals with extra large front teeth");
        }

        abstract void eat();
        abstract void giveBirth();
        void makeSound()
        {
            System.out.println("Rodents do make noises ");
        }
    }

    class Rats extends Rodent
    {
        public Rats()
        {
            System.out.println("Rats make huge family of rodents,they have long tails and pointed snouts");
        }

        @Override
        void eat() {
            System.out.println("eats vegetables,grains,seed and fuits");
        }

        @Override
        void giveBirth() {
            System.out.println("gives birth to 3 to 14 young");
        }


    }

    class Squirrels extends Rodent
    {

        public Squirrels()
        {
            System.out.println("Squirrels are members of the family Sciuridae, a family that includes small rodents. ");
        }
        @Override
        void eat() {
           System.out.println("peanuts, peanut butter, pecans, pistachios, grapes, corn, squash and zucchini");
        }

        @Override
        void giveBirth() {
            System.out.println("gives birth to two to five babies");
        }

        void makeSound()
        {
            System.out.println("Squirrels make scratching noises");
        }
    }
    class GuineaPigs extends Rodent
    {
        public GuineaPigs()
        {
            System.out.println("The guinea pig or domestic guinea pig (Cavia porcellus), also known as cavy or domestic cavy");
        }

        @Override
        void eat() {
            System.out.println("They are herbivore and does not eat meat");
        }

        @Override
        void giveBirth() {
            System.out.println("gives birth to 1 to 8 pups");
        }
    }

    public class Inheritance {

        public static void main(String args[]) {
            Rodent[] rodents = new Rodent[3];

            rodents[0] = new Rats();
            rodents[1] = new Squirrels();
            rodents[2] = new GuineaPigs();

            rodents[0].eat();
            rodents[0].giveBirth();

            rodents[1].eat();
            rodents[1].giveBirth();
            rodents[1].makeSound();

            rodents[2].eat();
            rodents[2].makeSound();

        }
    }
