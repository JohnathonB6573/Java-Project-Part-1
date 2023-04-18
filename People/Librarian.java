package People;
import Other.*;
public class Librarian extends Employee{
    Librarian(){
        id = 0;
        salary = 0;
        name = "";
        address = "";
        email = "";
        ssn = new SSN("000-00-0000");
        dob = new Date("00/00/0000");
        balance = 0;
    }
    Librarian(Employee e){
        super.setName(e.getName());
        super.setAddress(e.getAddress());
        super.setEmail(e.getEmail());
        super.setSSN(e.getSSN());
        super.setDate(e.getDate());
        super.setBalance(e.getBalance());
        super.setSalary((int)e.getSalary());
        super.setID(e.getID());
    }


    //Search collection by idNumber
    //Search checked out collections
    //search checked in collections
    //Search collection by title
    //Search collections by author
    //Search collection by price
    //Search for fiction or non-fiction
    //Search by section
    //Search by publicationDate
    //Search who has collection
    //Search who has membership
    //Implement a new membership
    //Stop membership
    //Check out books this will assign books to people
}