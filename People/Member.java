package People;

public class Member extends Person {
    protected int id;//id for the member
    protected int numOfBooks;//how many books they have checked out
    //protected float balance; //every person should have a balance


    Member() {
        id = 0;
        numOfBooks = 0;
        //balance = 0;
    }

    public Member(Person p) {
        super.setName(p.getName());
        super.setAddress(p.getAddress());
        super.setEmail(p.getEmail());
        super.setSSN(p.getSSN());
        super.setDate(p.getDate());
        super.setBalance(p.getBalance());
    }
    public void setID(int id){
        this.id=id;
    }

    public int getID(){
        return id;
    }

    public void setNumOfBooks(int numOfBooks){
        this.numOfBooks=numOfBooks;
    }

    public float getNumOfBooks(){
        return numOfBooks;
    }
    public void printInfo(){
        System.out.println("Name: "+ getName());
        System.out.println("Address: "+ getAddress());
        System.out.println("Email: "+ getEmail());
        System.out.println("SSN: "+ getSSN1());
        System.out.println("Dob: "+ getDate1());
        System.out.println("Balance:"+ getBalance());
    }
}