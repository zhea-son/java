public class Demo {
    public void display(){
        System.out.println("Non Return Type");
    }
        
    public int calc(int n){
        return n*n*n;
    }

    public static void main(String[] args){

        Demo d = new Demo();
        d.display();
        System.out.println(d.calc(5));
    }   
}
