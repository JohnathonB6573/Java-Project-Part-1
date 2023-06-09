package People;
import Other.SSN;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class Member extends Person {
    //protected int id;//id for the member
    protected int numOfBooks;//how many books they have checked out
    protected String membershipType;
    //protected int idCount = 1; // keep track of IDs. make sure each member has unique ID (this should only be useful for the librian)
    //protected float balance; //every person should have a balance
    


    Member() {
        name = "";
        address = "";
        email = "";
        ssn = new SSN("000-00-0000");
		dob = LocalDate.of(0000,0,0);
        id = "";
        //idCount++; //add one to id count after each member initialization
        numOfBooks = 0;
        //balance = 0;
    }


    public Member(String name,String id, String address,String email,SSN ssn,LocalDate date, String membershipType)
    {
        this.id = id; //member given unique ID
        //idCount++; //add one to id count after each member initialization
        this.name = name;
        this.address = address;
        this.email = email;
        this.ssn = ssn;
        this.dob = date;
        this.membershipType = membershipType;
    }

    public void setID(String id){
        this.id = id;
    }

    public String getID(){
        return id;
    }

    public void setNumOfBooks(int numOfBooks){
        this.numOfBooks=numOfBooks;
    }

    public int getNumOfBooks(){
        return numOfBooks;
    }

    public void printInfo(){
        System.out.println("Name: "+ getName());
        System.out.println("ID: " + getID());
        System.out.println("Address: "+ getAddress());
        System.out.println("Email: "+ getEmail());
        System.out.println("SSN: "+ getSSN1());
        System.out.println("Dob: "+ getDOB());
        System.out.println("Balance:"+ getBalance());
        
    }   

    public void saveTo(String file){ //needs to be implemented to write member to database file

        
    }
    //All members should be able to request collections, get information about collections, check overdue books, and pay fees.
}
