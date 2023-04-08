public class hierarchical {
    public static void main(String[] args) {
        cat c = new cat();
        c.sound();
        c.meow();
        c.bark();
    }
}

class animal{
    void sound(){
        System.out.println("animal makes sound...");
    }
}

class dog extends animal{
    void bark(){
        System.out.println("dog barks bhau bhau...");
    }
}

class cat extends animal{
    void meow(){
        System.out.println("cat meows meow meow...");
    }
}