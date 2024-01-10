package Task1;

public class Tester {

	public static void main(String args[])
	{
		UndergraduateStudent s1 = new UndergraduateStudent("Jerry");
		
		s1.setTestScores(1,70);
		s1.setTestScores(2,69);
		s1.setTestScores(3,71);
		s1.setTestScores(4,55);
		
		s1.generateResult();
		
		System.out.println("Stdent Name : " + s1.getStudentName());
		System.out.println("Result : " + s1.getTestResult());
		
		PostGraduateStudent s2 = new PostGraduateStudent("Tom");
		
		s2.setTestScores(1,70);
		s2.setTestScores(2,75);
		s2.setTestScores(3,80);
		s2.setTestScores(4,85);
		
		s2.generateResult();
		
		System.out.println("Stdent Name : " + s2.getStudentName());
		System.out.println("Result : " + s2.getTestResult());
	}

}
