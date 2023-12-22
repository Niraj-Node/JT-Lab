import java.util.Scanner;

class PrimeNumber {
	private int num;

	public PrimeNumber(int num) {
		super();
		this.num = num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
	@Override
	public String toString() {
		return "[num=" + num + "]";
	}
	
	boolean isPrime()
	{
		for(int i=2;i*i<=num;i++)
		{
			if(num%i == 0) return false;
		}
		return true;
	}
}

class Tester {
	
	public static void main(String args[])
	{
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.print("Enter the Number: ");
		int n = inputScanner.nextInt();
		
		PrimeNumber obj = new PrimeNumber(n);
		
		if(obj.isPrime())
			System.out.println(obj.getNum() + " is Prime");
		else
			System.out.println(obj.getNum() + " is Non-Prime");
		
		inputScanner.close();
	}
}
