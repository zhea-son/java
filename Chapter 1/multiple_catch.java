public class multiple_catch {
    public static void main(String[] args) {
        try{
            int a[] = new int[5];
            // a[5] = 5/0;
            System.out.println(a[10]);
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
        System.out.println("Rest of code.");
    }
}
