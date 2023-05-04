package People;

import Other.SSN;

import java.time.LocalDate;

public class Employee extends Person{
	protected float salary;

	Employee(){
        salary = 0;
        id = "";
    }

	public Employee(Person p) {
		super.setName(p.getName());
        super.setAddress(p.getAddress());
        super.setEmail(p.getEmail());
        super.setSSN(p.getSSN());
        super.setDOB(p.getDOB());
        super.setBalance(p.getBalance());
        salary = 0;
	}

    Employee(String name, String address, String email, SSN ssn,
              LocalDate dob, float balance, float in_salary,String in_id){
        super.setName(name);
        super.setAddress(address);
        super.setEmail(email);
        super.setSSN(ssn);
        super.setDOB(dob);
        super.setBalance(balance);
        salary = in_salary;
        id = in_id;
    }
	
	public void setID(String id){
        this.id=id;
    }

    public void setSalary(float salary){
        this.salary=salary;
    }

    public float getSalary(){
        return salary;
    }
    
    public void printInfo(){
        System.out.println("Name: "+ getName());
        System.out.println("Address: "+ getAddress());
        System.out.println("Email: "+ getEmail());
        System.out.println("SSN: "+ getSSN1());
        System.out.println("Dob: "+ getDOB());
        System.out.println("Balance:"+ getBalance());
    }
}
