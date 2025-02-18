public class Animal {
//Animal class
    
    //fields
    public int age;
    public String gender;

    //main function
    public static void main(String[] args) {
    
        Animal myAnimal = new Animal();
            myAnimal.isMammal();
            myAnimal.mate();

        Fish myFish = new Fish();
    
        Zebra myZebra = new Zebra();
            myZebra.run();

    }

//methods
    public void isMammal() {
        System.out.println("This animal is a mammal.");
    }
    public void mate() {
        System.out.println("This animal has found a mate.");
    }

}

class Fish extends Animal {
//Fish class (subclass of animal class)
    
    //fields
    private int sizeInFeet;

    //methods
    private void canEat() {
        System.out.println("The fish is eating");
    }
}

class Zebra extends Animal {
//Zebra class (subclass of animal class)

    //fields
    public boolean is_wild;

    //methods
    public void run() {
        System.out.println("The zebra is running.");
    }
}
