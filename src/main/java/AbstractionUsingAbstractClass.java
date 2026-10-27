abstract class Animal{

    private String name; //name has default (package-private) access, now its private.

    Animal(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    //eat() is a concrete method.

    void eat(){
        System.out.println(name + " is eating. ");
    }


    //sound() is an abstract method.
    abstract void sound();

    static String category(){
        return "Animal Kingdom";
    }
}

class Dog extends Animal{

    Dog(String name) {
        super(name); // super(name) means send the name to the parent class constructor.
    }

    void sound() {
        System.out.println( getName() + " barks!");
    }

    static String category(){
        return "Animal";
    }
}

class Cat extends Animal{

    Cat(String name){
        super(name);
    }

//    @Override
    void eat(){
        System.out.println( getName() + " is drinking milk. ");
    }

    void sound (){
        System.out.println( getName() + " meows!");
    }
}

public class AbstractionUsingAbstractClass {
    public static void main(String[] args) {

        Animal dog = new Dog("Charlie");
        dog.eat();
        dog.sound();
        System.out.println("Category: " + Dog.category());

        Animal cat = new Cat("Kitty");
        cat.eat();
        cat.sound();
        System.out.println("Category: " + Cat.category());
    }

}
