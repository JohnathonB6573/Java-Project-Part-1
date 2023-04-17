package People;
import Other.*;



public class Member extends Person {
    protected int id;//id for the member
    protected int numOfBooks;//how many books they have checked out
    protected String membershipType;
    protected int idCount = 1; // keep track of IDs. make sure each member has unique ID
    //protected float balance; //every person should have a balance
    


    Member() {
        name = "";
        address = "";
        email = "";
        ssn = new SSN("000-00-0000");
		dob = new Date("00/00/0000");
        id = idCount;
        idCount++; //add one to id count after each member initialization
        numOfBooks = 0;
        //balance = 0;
    }


    public Member(String name,String address,String email,SSN ssn,Date date, String membershipType)
    {
        this.id = idCount; //member given unique ID
        idCount++; //add one to id count after each member initialization
        this.name = name;
        this.address = address;
        this.email = email;
        this.ssn = ssn;
        this.dob = date;
        this.membershipType = membershipType;
    }

    public void setID(int id){
        this.id = id;
    }

    public int getID(){
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
        System.out.println("Dob: "+ getDate1());
        System.out.println("Balance:"+ getBalance());
        
    }   

    public void saveTo(String file){ //needs to be implemented to write member to database file

        
    }
}
