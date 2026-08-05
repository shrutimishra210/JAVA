class Animal{
    String name="Animal";
    void eat(){
        System.out.println("This Animal eats food.");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("This dog barks: WOOF! WOOF!");
    }
}

public class u2p1{
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();
    }
}
