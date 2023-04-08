public class method_overload {
    public int area(int a, int b)
    {
        return (a*b);
    }
    public int area(int a)
    {
        return (a*a);
    }
    public static void main(String[] args) {
        int length=5, breadth=3;
        method_overload m = new method_overload();
        System.out.println("Area of rectangle is:" + m.area(length, breadth));
        System.out.println("Area of square is:" + m.area(length));

    }
}
