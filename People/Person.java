package People;

import Other.SSN;
import Other.Date;

class Person {
	protected String name, address, email, id;
	protected SSN ssn;
	protected Date dob;
	protected float balance;
	
	Person(){//default constructor sets everything to 0 and blanks
		name = "";
		address = "";
		email = "";
		ssn = new SSN("000-00-0000");
		dob = new Date("00/00/0000");
		balance = 0.0f;
		id = "";

	}
	
	public Person(String name,String id, String address,String email,SSN ssn,Date date, float balance) {//sets the different variables
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
	
	public void setDate(Date date) {
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
	public String setId(){return id;}
	
	public String getAddress() {
		return address;
	}
	public float getBalance(){return balance;}
	
	public Date getDate() {
		return dob;
	}
	
	public String getDate1() {
		return dob.getDate();
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
	
	public Person getPeople() {
		return this;
	}
	
	public static void main(String[] args) {
		
	}
}
