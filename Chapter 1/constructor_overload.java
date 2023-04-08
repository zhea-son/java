public class constructor_overload {
    int b;
    String a;
    constructor_overload()
    {
        System.out.println("This is default constructor\n");
    }

    constructor_overload(int x, String z)
    {
        b = x; a = z;
    }
    public static void main(String[] args) {
        constructor_overload c =new constructor_overload();
        System.out.println("Default constructor values:");
        System.out.println("Code:" + c.b + "\tSubject:" + c.a);
        constructor_overload c1 =new constructor_overload(30,"Python");
        System.out.println("\nParameterized constructor values:");
        System.out.println("Code:" + c1.b + "\tSubject:" + c1.a);
    }
}
