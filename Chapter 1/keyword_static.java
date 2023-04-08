public class keyword_static {
    public static void main(String[] args) {
        Student s = new Student(101,"Ram");
        s.display();
        Student.change();
        s.display();
    }
}

class Student{
    int roll;
    String name;
    static String college = "LICT";

    static void change(){
        System.out.println("This is method in static method.");
        college = "LFS";
    }

    Student(int r, String n){
        roll = r;
        name = n;
    }

    public void display(){
        System.out.println("Name is: "+name+"\nRoll is: "+roll+"\nCollege is: "+college);
    }
}