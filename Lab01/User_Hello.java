import java.util.Scanner;

class User_Hello {
        public static void main(String[] a)
        {
		System.out.println("Enter Your Name : ");
		Scanner inputObj = new Scanner(System.in);
		String name = inputObj.nextLine();
                System.out.println("Hello " + name + "!");
        }
}
