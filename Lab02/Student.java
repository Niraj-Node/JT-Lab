import java.util.Scanner;

class Student 
{
    int roll_no;
    String name;
    int[] marks;
    double avg;

    public Student() 
	{
        this.roll_no = 0;
        this.avg = -1.0;
        this.name = "Default";
        this.marks = new int[]{-1, -1, -1, -1, -1};
    }

    public Student(int roll_no, String name, int[] marks) 
	{
        this.roll_no = roll_no;
        this.name = name;
        this.marks = new int[marks.length];
        for(int i = 0; i < marks.length; i++)
            this.marks[i] = marks[i];
        findAverage();
    }

    public void printDetails() 
	{
        System.out.println("Name: " + this.name);
        System.out.println("Roll No.: " + this.roll_no);
        for(int i = 0; i < this.marks.length; i++)
            System.out.println("Mark of Subject " + (i + 1) + ": " + this.marks[i]);
    }

    public double findAverage() 
	{
        double sum = 0.0;
        for(int mark : marks)
            sum += mark;
        avg = sum / marks.length;
        return sum / marks.length;
    }
}

class TestStudent 
{
    public static void main(String[] args) 
	{
        Scanner inputObj = new Scanner(System.in);

        System.out.println("Enter the Name: ");
        String name = inputObj.nextLine();
        System.out.println("Enter the Roll No.: ");
        int roll = inputObj.nextInt();
        System.out.println("Enter the marks of 5 Subjects Separated by Space: ");
        int[] marks = new int[5];
        for(int i = 0; i < marks.length; i++)
            marks[i] = inputObj.nextInt();

        Student s1 = new Student(roll, name, marks);
        s1.printDetails();
        double avg = s1.findAverage();
        System.out.println("Average: " + avg);

        Student[] students = new Student[3];
        double highestAvg = -1.0;
        int highestIndex = -1;

        for(int i = 0; i < students.length; i++) 
		{
            inputObj.nextLine();
            System.out.println("\nEnter details for student " + (i + 1) + ":");
            System.out.println("Enter the Name: ");
            name = inputObj.nextLine();
            System.out.println("Enter the Roll No.: ");
            roll = inputObj.nextInt();
            System.out.println("Enter the marks of 5 Subjects Separated by Space: ");
            marks = new int[5];
            for(int j = 0; j < marks.length; j++)
                marks[j] = inputObj.nextInt();

            students[i] = new Student(roll, name, marks);
            avg = students[i].findAverage();
            if(avg > highestAvg) 
			{
                highestAvg = avg;
                highestIndex = i;
            }
        }

        System.out.println("\nStudent with the highest average:");
        students[highestIndex].printDetails();
        System.out.println("Average: " + highestAvg);

        inputObj.close();
    }
}