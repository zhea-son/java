public class method_override {
    public static void main(String[] args) {
        next c = new next();
        c.display();
        System.out.println(c.calculate(2,3));
    }
}

class up{
    int calculate(int a, int b){
        return (a+b);
    }
}

class next extends up{
    int calculate(int a, int b){
        return (a+b)*(a+b);
    }
    void display(){
        System.out.println("The square of sum is:");
    }
}
