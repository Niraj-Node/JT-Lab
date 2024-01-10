package Task2;

public class CompareLines {

	public static void main(String args[])
	{
		Line l1 = new Line(2.0,2.0,5.0,10.0);
		Line l2 = new Line(2.0,6.0,5.0,6.0);
		
		System.out.println(String.format("isEqual : %b", l1.isEqual(l2)));
		System.out.println(String.format("isGreater : %b", l1.isGreater(l2)));
		System.out.println(String.format("isLess : %b", l1.isLess(l2)));
	}

}
