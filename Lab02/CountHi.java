import java.util.Scanner;

public class CountHi 
{
    static int countHi(String str) 
	{
        int count = 0;
        int index = 0;
		String find = "hi";
        while(true) 
		{
            index = str.indexOf(find, index);
            if(index != -1) 
			{
                count++;
                index += find.length();
            } 
			else 
                break;
        }
        return count;
    }

    public static void main(String[] args) 
	{
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String inputString = inputObj.nextLine();

        int result = countHi(inputString);
        System.out.println("The number of times 'hi' appears: " + result);

        inputObj.close();
    }
}
