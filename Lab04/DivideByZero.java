import java.util.Scanner;

public class DivideByZero {

    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Numerator");
        int a  = in.nextInt();
        System.out.println("Enter the Denominator");
        int b  = in.nextInt();
        
        try {
            int div = a/b;
            System.out.println("Divison : " + div);
        }

        catch(ArithmeticException e) {
            System.out.println("Zero (0) as Denominator is Invalid");
        }

        in.close();
    }
}