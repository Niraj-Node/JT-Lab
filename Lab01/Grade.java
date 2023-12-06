import java.util.Scanner;

public class Grade
{
    public static void main(String args[])
    {
        int marks[] = new int[5];
        float total=0, avg;
        Scanner inputObj = new Scanner(System.in);

	System.out.println("Enter Your Name : ");;
      	String name = inputObj.nextLine();
	System.out.println("Enter Your Roll No : ");
        int rollNo = inputObj.nextInt();

        for(int i=0; i<5; i++)
	{ 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = inputObj.nextInt();
           total = total + marks[i];
        }

        avg = total/5;
	System.out.println("Name : " + name);
	System.out.println("Roll No : " + rollNo);
	System.out.println("Average : " + avg);

        System.out.print("The student Grade is: ");
        if(avg>=80)
        {
            System.out.print("A");
        }
        else if(avg>=60 && avg<80)
        {
           System.out.print("B");
        } 
        else if(avg>=40 && avg<60)
        {
            System.out.print("C");
        }
        else
        {
            System.out.print("D");
        }
    }
}
