class Tester{
	public static void main(String[] a)
	{
		Tester t = new Tester();
		int[] num = {68,79,86,99,23,2,41,100};
		int s = t.calculateSumOfEvenNumbers(num);
		System.out.println(s);
	}

	int calculateSumOfEvenNumbers(int[] myNum)
	{
		int sum=0;
		for(int i=0;i<myNum.length;i++)
		{
			if(myNum[i]%2==0) sum += myNum[i];
		}
		return sum;
	}
}
