public class try_catch_finally {
    public static void main(String[] args) {
        try{
            int a = 2/0;
            System.out.println(a);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception Occurs.");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of Bound Exception Occurs.");
        }
        catch(Exception e){
            System.out.println("Parent  Exception Occurs.");
        }
        finally{
            System.out.println("The finally block is always executed");
        }
    }
}
