package Task1;

public class UndergraduateStudent extends Student {

	public UndergraduateStudent(String studentName) {
		super(studentName);
	}

	void generateResult()
	{
		int sum = 0;
		for(int i : testScores)
			sum += i;
		int avg = sum/testScores.length;
		
		if(avg >= 60)
			setTestResult("Pass");
		else
			setTestResult("Fail");
	}
}
