package example.spring.core;

public class ContactInfo {

	
	private String mobileNo;
	private String emailAddrress;
	
	public ContactInfo() {
		// TODO Auto-generated constructor stub
	}

	public ContactInfo(String mobileNo, String emailAddrress) {
		super();
		this.mobileNo = mobileNo;
		this.emailAddrress = emailAddrress;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailAddrress() {
		return emailAddrress;
	}

	public void setEmailAddrress(String emailAddrress) {
		this.emailAddrress = emailAddrress;
	}

	@Override
	public String toString() {
		return "ContactInfo [mobileNo=" + mobileNo + ", emailAddrress=" + emailAddrress + "]";
	}
	

}
