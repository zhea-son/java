public class switch_case {
    public void grade(int x){
        switch (x/10) {
            case 9:
                System.out.println("A+");
                break;
            
            case 8:
                System.out.println("A");
                break;
            
            case 7:
                System.out.println("B+");
                break;
            
            case 6:
                System.out.println("B");
                break;

            case 5:
                System.out.println("C+");
                break;

            case 4:
                System.out.println("C");
                break;

            case 3:
                System.out.println("D+");
                break;
            
            default:
                System.out.println("Invalid!");
                break;
        }
    }

    public static void main(String args[])
    {
        int score=89;
        switch_case s = new switch_case();
        s.grade(score);
    }
}
