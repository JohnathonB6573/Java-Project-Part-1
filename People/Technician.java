
package People;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import Other.SSN;
public class Technician extends Employee{
    Technician(){
        id = "";
        salary = 0;
        name = "";
        address = "";
        email = "";
        ssn = new SSN("000-00-0000");
        dob = LocalDate.of(0000,0,0);
        balance = 0;
    }
    Technician(Employee e){
        super.setName(e.getName());
        super.setAddress(e.getAddress());
        super.setEmail(e.getEmail());
        super.setSSN(e.getSSN());
        super.setDOB(e.getDOB());
        super.setBalance(e.getBalance());
        super.setSalary((int)e.getSalary());
        super.setID(e.getID());
    }


    //Sort collections
    //Insert collections
    //Collections need to be organized in an arraylist one for everything in the
    //library and one for specific types of collections
}