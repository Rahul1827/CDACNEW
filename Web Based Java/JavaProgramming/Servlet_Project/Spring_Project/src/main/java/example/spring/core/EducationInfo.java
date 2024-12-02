package example.spring.core;

public class EducationInfo {
	private String highestDegree;
	private String grade;
	

	public EducationInfo() {
		// TODO Auto-generated constructor stub
	}


	public EducationInfo(String highestDegree, String grade) {
		super();
		this.highestDegree = highestDegree;
		this.grade = grade;
	}


	public String getHighestDegree() {
		return highestDegree;
	}


	public void setHighestDegree(String highestDegree) {
		this.highestDegree = highestDegree;
	}


	public String getGrade() {
		return grade;
	}


	public void setGrade(String grade) {
		this.grade = grade;
	}


	@Override
	public String toString() {
		return "EducationInfo [highestDegree=" + highestDegree + ", grade=" + grade + "]";
	}

	
	
}
