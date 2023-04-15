package JavaProject;

import JavaProject.SSN;
import JavaProject.Date;

class Person {
	protected String name, address, email;
	protected SSN ssn;
	protected Date dob;
	
	Person(){
		name = "";
		address = "";
		email = "";
		ssn = new SSN("000-00-0000");
		dob = new Date("00/00/0000");
	}
	
	public Person(String name,String address,String email,SSN ssn,Date date) {
		this.name = name;
		this.address = address;
		this.email = email;
		this.ssn = ssn;
		this.dob = date;
	}
	
	public void setName(String name){
        this.name = name;
    }
	
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
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
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
