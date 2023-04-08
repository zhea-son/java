public class throweg {
    public static void main(String[] args) {
        validate(12);
    }

    public static void validate(int age) {
        if(age<18){
            throw new ArithmeticException("Underaged");
        }
        else{
            System.out.println("Eligible to vote");
        }
        
    }
}
