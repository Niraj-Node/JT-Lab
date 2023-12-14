import java.util.Scanner;

public class AbbreviateName {
    public static void main(String args[]) 
	{
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter the Full Name in First Middle Last Format: ");
        String fullName = inputScanner.nextLine();

        String[] nameParts = fullName.split(" ");
        String abbreviatedName = "";

        if(nameParts.length >= 3) 
		{
            for(int i = 0; i < nameParts.length - 1; i++) 
			{
                abbreviatedName += nameParts[i].charAt(0) + ".";
            }
            abbreviatedName += nameParts[nameParts.length - 1];
        } 
		else
            abbreviatedName = fullName;

        System.out.println("Abbreviated Name: " + abbreviatedName);

        inputScanner.close();
    }
}
