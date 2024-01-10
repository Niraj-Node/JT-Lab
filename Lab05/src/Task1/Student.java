package Task1;

public abstract class Student 
{
	protected String studentName;
	protected int[] testScores;
	protected String testResult;
	
	public Student(String studentName) {
		this.studentName = studentName;
		testScores = new int[4];
	}
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public int[] getTestScores() {
		return testScores;
	}
	public void setTestScores(int testNumber, int testScore) {
		this.testScores[testNumber-1] = testScore;
	}
	
	public String getTestResult() {
		return testResult;
	}
	public void setTestResult(String testResult) {
		this.testResult = testResult;
	}
	
	abstract void generateResult();
}
