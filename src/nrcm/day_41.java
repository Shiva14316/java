package nrcm;

public class day_41 {
	private String FirstName;
	private String LastName;
	private String EmailId;
	private long Phoneno;
	
	public void setfirstName(String fn) {
		FirstName=fn;
	}
	public void setlastName(String ln) {
	    LastName=ln;
	}
	public void setEmailId(String EI) {
		EmailId=EI;
		
	}
	public void setPhonenum(long no) {
		Phoneno=no;
	}
	public String getFirstName() {
		return FirstName;
		
	}
	public String getLastName() {
		return LastName;
	}
	public String getEmailId() {
			return EmailId;
	}
	public long getphoneno() {
			return Phoneno;
				

}
    public static void main(String[] args) {
    	day_41 d1=new day_41();
    	d1.setfirstName("Arun");
    	d1.setlastName("Nani");
    	d1.setEmailId("arunnani205@gmail.com");
    	d1.setPhonenum(9573123040L);
    	System.out.println(d1.getFirstName());
    	System.out.println(d1.getLastName());
    	System.out.println(d1.getEmailId());
    	System.out.println(d1.getphoneno());
    	
    	
    }
			
}