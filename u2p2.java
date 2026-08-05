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

class Puppy extends Dog{
    void weep(){
        System.out.println("This puppy is weeping.");
    }
}

public class u2p2{
    public static void main(String[] args) {
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.weep();
    }
}