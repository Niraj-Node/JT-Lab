import java.util.Scanner;

class Mod{
	public static void main(String[] a)
	{
		Scanner inputObj = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int n = inputObj.nextInt();

		System.out.println("");		
		System.out.println("Numbers Divisible by 3 : ");
		for(int i=1;i<=n;i++)
		{
			if(i%3==0)
				System.out.print(i + " ");
		}
		System.out.println("");
                System.out.println("Numbers Divisible by 5 : ");
                for(int i=1;i<=n;i++)
                {
                        if(i%5==0)
                        	System.out.print(i + " ");
                }
		System.out.println("");
                System.out.println("Numbers Divisible by Both 3 & 5 : ");
                for(int i=1;i<=n;i++)
                {
                        if(i%3==0 && i%5==0)
                        	System.out.print(i + " ");
                }

	}
}
