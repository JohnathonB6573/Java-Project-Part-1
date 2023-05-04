package People;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import Other.SSN;

class Person {
	protected String name, address, email, id;
	protected SSN ssn;
	protected LocalDate dob;
	protected float balance;

	protected boolean hasMembership;
	
	Person(){//default constructor sets everything to 0 and blanks
		name = "";
		address = "";
		email = "";
		ssn = new SSN("000-00-0000");
		dob = LocalDate.of(0000, 0, 0);
		balance = 0.0f;
		id = "";
		hasMembership = false;
	}
	
	public Person(String name,String id, String address,String email,SSN ssn,LocalDate date, float balance) {//sets the different variables
		this.name = name;
		this.id = id;
		this.address = address;
		this.email = email;
		this.ssn = ssn;
		this.dob = date;
		this.balance = balance;
	}
	
	public void setName(String name){
        this.name = name;
    }
	public void setId(String id){this.id = id;}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setDOB(LocalDate date) {
		this.dob = date;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setSSN(SSN ssn) {
		this.ssn = ssn;
	}
	public void setBalance(float balance){this.balance = balance;}
	
	public String getName() {
		return name;
	}
	public String getID(){return id;}
	
	public String getAddress() {
		return address;
	}
	public float getBalance(){return balance;}
	
	public LocalDate getDOB() {
		return dob;
	}
	
	public String getEmail() {
		return email;
	}
	
	public SSN getSSN() {
		return ssn;
	}
	
	public String getSSN1() {
		return ssn.getData();
	}

	public void SetMembershipStatus(boolean b){
		this.hasMembership = b;
	}

	public boolean SeeMembershipStatus(){
		return hasMembership;
	}
	
	//public Person getPeople() {
		//return this;
	//}

}
