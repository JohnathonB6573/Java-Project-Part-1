package People;
import Other.SSN;
import Collections.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
public class Librarian extends Employee{
    Librarian(){
        id = "";
        salary = 0;
        name = "";
        address = "";
        email = "";
        ssn = new SSN("000-00-0000");
        dob = LocalDate.of(1111, 1, 1);
        balance = 0;
    }
    Librarian(Employee e){
        super.setName(e.getName());
        super.setAddress(e.getAddress());
        super.setEmail(e.getEmail());
        super.setSSN(e.getSSN());
        super.setDOB(e.getDOB());
        super.setBalance(e.getBalance());
        super.setSalary((int)e.getSalary());
        super.setID(e.getID());
    }

    public void searchISSN(ArrayList<Collection> Collections,String ISSN){
        if(Collections.isEmpty()){
            System.out.println("Nothing in Collections");
        }
        while(Collections != null){
            //    if(Collections.getIssn() == ISSN)
             //   print error
            }
        }
    //Search collection by issn
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


    //Set membership status
    public void StopMembership(Person p){
        p.SetMembershipStatus(false);
    }

    public void StartMembership(Person p){
        p.SetMembershipStatus(true);
    }

    //Check out books this will assign books to people
    public void checkoutBook(Book b, Person p){
        b.setRenterID(p.getID());
        b.setRenterName(p.getName());
        b.setCheckoutDate(LocalDate.now());
    }
}