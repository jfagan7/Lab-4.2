package csv;

public class School {

	private String name;
	private String numOfTestTakers;
	private String avgCRScore;
	private String avgMathScore;
	private String avgWritingScore;
	private String schoolID;

	public School(String schoolID,String name, String numOfTestTakers, String avgCRScore, String avgMathScore,String avgWritingScore) {
		// TODO Auto-generated constructor stub
		this.schoolID=schoolID;
		this.name=name;
		this.numOfTestTakers=numOfTestTakers;
		this.avgCRScore=avgCRScore;
		this.avgMathScore=avgMathScore;
		this.avgWritingScore=avgWritingScore;
	}
	public String getSchoolName()
	{
		return name;
	}
	public String getSchoolID()
	{
		return schoolID;
	}
	public String getNumOfTestTakers()
	{
		return numOfTestTakers;
	}
	public String getAvgCRScore()
	{
		return avgCRScore;
	}
	public String getAvgMathScore()
	{
		return avgMathScore;
	}
	public String getAvgWritingScore()
	{
		return avgWritingScore;
	}
}
