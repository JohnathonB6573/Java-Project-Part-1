package People;

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
	
	public void setID(String id){
        this.id=id;
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
        System.out.println("Dob: "+ getDOB());
        System.out.println("Balance:"+ getBalance());
    }
}
