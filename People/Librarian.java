package People;
import Other.SSN;
import Collections.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class Librarian extends Employee{
    public Librarian(){
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

    Librarian(String name, String address, String email, SSN ssn,
              LocalDate dob,float balance, float salary, String id){
        super.setName(name);
        super.setAddress(address);
        super.setEmail(email);
        super.setSSN(ssn);
        super.setDOB(dob);
        super.setBalance(balance);
        super.setSalary(salary);
        super.setID(id);
    }
/*
    //Returns the collection that matches the ISSN
    public Collection searchISSN(ArrayList<Collection> Collections,String ISSN){
        boolean hasISSN = false;
        int i=0;

        if(Collections.isEmpty()){
            System.out.println("There is nothing inside Collection.");
        }
        while(Collections != null){
               if(Collections.get(i).getISSN() == ISSN){
                 i++;
                 hasISSN = true;
               }
               return Collections.get(i);
            }
        if(hasISSN = false){
            System.out.println("We currently do not have a collection that has the ISSN of " + ISSN);
        }
        return null;
        }

    //Returns the collection that matches the ISSN
    public Collection searchISBN(ArrayList<Collection> Collections,String ISBN){
        boolean hasISBN = false;
        int i=0;

        if(Collections.isEmpty()){
            System.out.println("There is nothing inside Collection.");
        }
        while(Collections != null){
            if(Collections.get(i).getISSN() == ISBN){
                hasISBN = true;
            }
            return Collections.get(i);
        }
        if(hasISBN = false){
            System.out.println("We currently do not have a collection that has the ISSN of " + ISBN);
        }
        return null;
    }*/

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

    //Check out books this will assign Collections to people
    public void checkoutCollection(Collection c, Person p){
        c.setRenterID(p.getID());
        c.setRenterName(p.getName());
        c.setCheckoutDate(LocalDate.now());
    }
    //ArrayList<Collection> Collections, ArrayList<Person> People
    //Returns the collection by Title
    public int searchTitle(ArrayList<Collection> Collections,String Title){
        int x = 0;

        if(Collections.isEmpty()){
            System.out.println("There is nothing inside Collection.");
        }

        while(Collections != null){
                if(Collections.get(x).getTitle() == Title) {
                    return x;
                }
                x++;
        }
        return 0;
    }

    public int searchPeople(ArrayList<Person> People,String ID){
        int x = 0;

        if(People.isEmpty()){
            System.out.println("There is nothing inside People.");
        }

        while(People != null){
            if(People.get(x).getID() == ID){
                return x;}
            x++;
        }
        return 0;
    }

    public void returnOverdues(ArrayList<Collection> Collections){
        int x = 0, i = 0;
        ArrayList<Collection> Overdue = new ArrayList<>();

        if(Collections.isEmpty()){
            System.out.println("There is nothing inside Collection.");
        }

        while(Collections != null) {
            if(Collections.get(x).getOverdue() == true){
                Overdue.add(Collections.get(x));
            }
            x++;
        }

        if(Overdue.isEmpty()){
            System.out.println("There are no overdue collections.");
        }
        else{
            while(Overdue != null){
                Overdue.get(i).print();
                i++;
            }
        }
    }

    //Check out books this will unassign collections to people
    public void checkinCollection(Collection c){
        c.setRenterID("");
        c.setRenterName("");
        c.setCheckoutDate(LocalDate.of(0000,00,00));
    }
}