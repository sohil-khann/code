import javax.xml.bind.SchemaOutputResolver;

class Animal {
    void eat() {
        System.out.println("Eating...");
    }

    void sleep() {
        System.out.println("Sleeping...");
    }
}


class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
           System.out.print("sfjsf");
    }
}

public class practical{
    public static void main(String[] args) {
        Dog dog = new Dog();
     
        dog.eat();
        dog.bark(); }
} 