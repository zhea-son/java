
public class interface_fact {
    
    public static void main(String[] args) {
        int number=5;
        A obj = new A();
        System.out.println("Factorial is : " + obj.calculatefact(number));
    }
}
interface factorial{
    int calculatefact(int x);
}
class A implements factorial{
    public int calculatefact(int x){
        int fact=1;
        while(x!=1){
            fact = fact*x;
            x--;
        }
        return(fact);
    }
}
