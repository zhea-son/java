public class multilevel_inheritance {
    public static void main(String[] args) {
        child2 c = new child2();
        c.print_area();
        System.out.println(c.area(5, 10));
        c.print_cube();
        System.out.println(c.cube(6));
    }
}

class parent{
    int area(int a, int b){
        return(a*b); 
    }
}

class child1 extends parent{
    int cube(int a){
        return(a*a*a);
    }
}

class child2 extends child1{
    void print_area(){
        System.out.println("The area is: ");
    }
    void print_cube(){
        System.out.println("The cube is: ");
    }
}
