public class keyword_this {
    public static void main(String[] args) {
        Student s = new Student(1,"RK");
        s.display1();
        s.display();
    }
}

class Student{
    int roll; 
    String Name;

    Student(){
        System.out.println("This is display inside constructor\n");
    }

    Student(int r, String n){
        this();
        roll = r;
        Name = n;
    }

    void display1(){
        System.out.println("\nThis is display1.\n");
    }

    void display(){
        System.out.println("Name is: "+Name+"\nRoll No. is: "+roll);
        this.display1();
    }
  
}
