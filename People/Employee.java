package JavaProject;

import JavaProject.Person;

public class Employee extends Person{
	protected int id;
	protected float salary;
	
	Employee(){
        id = 0;
        salary = 0;
    }
	
	public Employee(Person p) {
		super.setName(p.getName());
        super.setAddress(p.getAddress());
        super.setEmail(p.getEmail());
        super.setSSN(p.getSSN());
        super.setDate(p.getDate());
	}
	
	public void setID(int id){
        this.id=id;
    }

    public int getID(){
        return id;
    }

    public void setSalary(int salary){
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
        System.out.println("Dob: "+ getDate1());
    }
}
