public class throwseg {
    public static void main(String[] args) {
        try{
            System.out.println(div(15,0));

        }
        catch(ArithmeticException e){
            System.out.println("Divide by Zero Exception Occured.");
        }
    }

    public static int div(int m, int n) throws ArithmeticException {
        int res = m/n;
        return res;
    }
}
