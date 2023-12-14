import java.util.Scanner;

class RemoveWhiteSpaces
{
        public String removewhitespaces(String str)
        {
                return str.replace(" ","");
	}
}

class Tester
{
        public static void main(String args[])
        {
                Scanner inputObj = new Scanner(System.in);

                System.out.println("Enter the String: ");;
                String str = inputObj.nextLine();

		RemoveWhiteSpaces ts = new RemoveWhiteSpaces();
		String modified = ts.removewhitespaces(str);
		System.out.println("Without Whitespace: " + modified);

                inputObj.close();
	}
}

