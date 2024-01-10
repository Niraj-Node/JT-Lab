package Task1;
public class PostGraduateStudent extends Student {

	public PostGraduateStudent(String studentName) {
		super(studentName);
	}

	void generateResult()
	{
		int sum = 0;
		for(int i : testScores)
			sum += i;
		int avg = sum/testScores.length;
		
		if(avg >= 75)
			setTestResult("Pass");
		else
			setTestResult("Fail");
	}
}
