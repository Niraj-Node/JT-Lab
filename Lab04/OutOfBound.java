import java.util.Scanner;

public class OutOfBound {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        try {
            int[] arr = new int[5];
            System.out.println("Enter the Index you want to Access");
            int idx = in.nextInt();
            arr[idx] = 30/5;
            
        }

        catch(ArithmeticException e) {  
            System.out.println("Invalid Arithmetic Operation Performed");
        }

        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid Index Accessed");
        }

        in.close();
    }
}
