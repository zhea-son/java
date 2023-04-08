public class multiple_inheritance {
    public static void main(String[] args) {
        child c = new child();
        c.display();    
    }
}

class parent1{
    void display(){
        System.out.println("print in parent1....");
    }
}

class parent2{
    void display(){
        System.out.println("print in parent1....");
    }
}

class child extends parent1, parent2 {}
