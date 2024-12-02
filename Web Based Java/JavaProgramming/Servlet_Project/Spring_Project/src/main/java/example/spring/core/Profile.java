package example.spring.core;

public class Profile {
	private int candidateId;
	private  String name;

	

	public Profile() {
		// TODO Auto-generated constructor stub
	}



	public Profile(int candidateId, String name) {
		super();
		this.candidateId = candidateId;
		this.name = name;
	}



	public int getCandidateId() {
		return candidateId;
	}



	public void setCandidateId(int candidateId) {
		this.candidateId = candidateId;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Profile [candidateId=" + candidateId + ", name=" + name + "]";
	}
	
	

}
