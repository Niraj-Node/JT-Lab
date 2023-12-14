import java.util.Scanner;

public class IsPalindrome
{
	static boolean ispalindrome(String str)
	{
		StringBuilder strb  = new StringBuilder(str);
		String rev = strb.reverse().toString();
		return (str.equals(rev));
	}

	public static void main(String args[])
	{
		Scanner inputObj = new Scanner(System.in);
		System.out.println("Enter the String : ");;
      	String str = inputObj.nextLine();
		
		if(ispalindrome(str))
			System.out.println("Yes");
		else
			System.out.println("No");

		inputObj.close();
	}
}
