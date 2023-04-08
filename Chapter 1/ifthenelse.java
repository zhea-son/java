public class ifthenelse {
    public void month (int mon) {
        if (mon == 1)
        {
            System.out.println("January");
        }
        else if (mon == 2)
        {
            System.out.println("February");
        }
        else if (mon == 3)
        {
            System.out.println("March");
        }
        else if (mon == 4)
        {
            System.out.println("April");
        }
        else if (mon == 5)
        {
            System.out.println("May");
        }
        else if (mon == 6)
        {
            System.out.println("June");
        }
        else if (mon == 7)
        {
            System.out.println("July");
        }
        else if (mon == 8)
        {
            System.out.println("August");
        }
        else if (mon == 9)
        {
            System.out.println("September");
        }
        else if (mon == 10)
        {
            System.out.println("October");
        }
        else if (mon == 11)
        {
            System.out.println("November");
        }
        else 
        {
            System.out.println("December");
        }

    }

    public void grade(int score) {
        if (score>=90)
        {
            System.out.println("Grade is A+");
        }
        else if (score>=80 && score<90)
        {
            System.out.println("Grade is A");
        }
        else if (score>=70 && score<80)
        {
            System.out.println("Grade is B+");
        }
        else if (score>=60 && score<70)
        {
            System.out.println("Grade is B");
        }
        else if (score>=50 && score<60)
        {
            System.out.println("Grade is C+");
        }
        else if (score>=40 && score<50)
        {
            System.out.println("Grade is C");
        }
        else if (score<40)
        {
            System.out.println("Grade is D+");
        }
        else
        {
            System.out.println("Invalid Grade");
        }
    }
    public static void main(String args[])
    {
        ifthenelse i = new ifthenelse();
        i.grade(79);
        i.month(5);
    }
}
