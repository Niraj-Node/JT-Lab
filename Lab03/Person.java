package lab03;
import java.util.Arrays;
import java.util.Scanner;

class Person {
	private String name;
	private int age;
	
	public Person() {
		super();
		this.name = "Default";
		this.age = -1;
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + "]";
	}
}

class Student extends Person {
	private int rollNo;
	private double[] marks;
	static int count;
	
	static {
		count = 0;
	}
	public static String getCount() {
		return ("Number of Students is " + String.valueOf(count));
	}
	
	
	{
		count++;
	}
	public Student() {
		super();
	}
	public Student(int rollNo) {
		super();
		this.rollNo = rollNo;
	}
	public Student(int rollNo, double[] marks) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
	}
	public Student(int rollNo, String name, int age, double[] marks) {
		super(name, age);
		this.rollNo = rollNo;
		this.marks = marks;
	}
	
	public double getTotalMarks() {
		double sum = 0;
		for(int i=0;i<5;i++) {
			sum += marks[i];
		}
		return sum;
	}
	public double[] getMarks() {
		return marks;
	}
	public void setMarks(double[] marks) {
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "RollNo= " + rollNo + "\nName= " + getName() + "\nAge= " + getAge() + "\nMarks= " + Arrays.toString(marks);
	}
	
	public void displayDetails() {
		System.out.println(this);
	}
}

class TestStudent {
	
	public static void main(String args[])
	{
		Scanner inputScanner = new Scanner(System.in);
		
		System.out.print("Enter the number of the Students: ");
		int n = inputScanner.nextInt();
		
		Student[] obj = new Student[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the details of Student " + (i+1) + ": ");
			System.out.print("Name ~ ");
			inputScanner.nextLine();
			String s = inputScanner.nextLine();
			System.out.print("Roll No. ~ ");
			int rollNo = inputScanner.nextInt();
			System.out.print("Age ~ ");
			int age = inputScanner.nextInt();
			
			double[] marks = new double[5];
			for(int j=0;j<marks.length;j++)
			{
				System.out.print("Marks of Subject " + (j+1) + " ~ ");
				marks[j] = inputScanner.nextInt();
			}
			
			obj[i] = new Student(rollNo, s, age, marks);
			System.out.println();
		}
		
		//Find Student with Maximum Average
		double maxAvg = -1.0;
		int maxIdx = 0;
		for(int i=0;i<n;i++)
		{
			double total = obj[i].getTotalMarks();
			if(total > maxAvg)
			{
				maxAvg = total;
				maxIdx = i;
			}
		}
		System.out.println("Details of Student with Highest Average is: ");
		obj[maxIdx].displayDetails();
		System.out.println();
		
		//Extra Student
		System.out.println("Enter the details of Student: ");
		System.out.print("Name ~ ");
		inputScanner.nextLine();
		String s = inputScanner.nextLine();
		System.out.print("Roll No. ~ ");
		int rollNo = inputScanner.nextInt();
		System.out.print("Age ~ ");
		int age = inputScanner.nextInt();
		
		double[] marks = new double[5];
		for(int j=0;j<marks.length;j++)
		{
			System.out.print("Marks of Subject " + (j+1) + " ~ ");
			marks[j] = inputScanner.nextInt();
		}
		Student newObj = new Student(rollNo, s, age, marks);
		newObj.displayDetails();
		
		System.out.println();
		System.out.println(Student.getCount());
		
		inputScanner.close();
	}
}
