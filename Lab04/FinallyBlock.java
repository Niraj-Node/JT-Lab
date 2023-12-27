public class FinallyBlock {
    public static void main(String[] args) 
    {
        try {
            System.out.println(25/5);
        }
        catch(NullPointerException e) {
            
        }
        finally {
            System.out.println("Finally Block 1");
        }

        try {
            System.out.println(25/0);
        }
        catch(NullPointerException e) {

        }
        catch(ArithmeticException e) {

        }
        finally {
            System.out.println("Finally Block 2");
        }
    }
}
