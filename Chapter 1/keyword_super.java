public class keyword_super {
    public static void main(String[] args) {
        new Mammal();
    }
       
}

class Animal{
    String color = "Skin";
    void eat(){
        System.out.println("Parent class Eating....");
    }
    Animal(){
        System.out.println("Animal is created....");
    }
}

class Mammal extends Animal{
    String color = "Blue";

    void eat(){
        System.out.println("Child class Eating....");
    }

    Mammal(){
        super();
        System.out.println(color);
        System.out.println(super.color); 
        super.eat();
        eat();  
    }
}
