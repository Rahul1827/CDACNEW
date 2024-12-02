package example.spring.core;

public class UserService implements GreetingService{
	
	
	private String userName;
	private int userAge;
	
	 public UserService() {
	      
	    }


	public UserService(String userName,int userAge) {
		System.out.println("Inside userService(String int)");
		this.userName=userName;
		this.userAge=userAge;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		System.out.println("Setting username.");
		this.userName = userName;
	}


	public int getUserAge() {
		return userAge;
	}


	public void setUserAge(int userAge) {
		System.out.println("Setting user age.");
		this.userAge = userAge;
	}


	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		
		String message=
				"Hey " + userName + ", your age is " +userAge;
		return message;
	}

}
