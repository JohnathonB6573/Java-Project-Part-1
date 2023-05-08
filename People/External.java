package People;

import Other.Date;
import Other.SSN;

public class External extends Member{
    public External(Member m) {
        super.setName(m.getName());
        super.setAddress(m.getAddress());
        super.setEmail(m.getEmail());
        super.setSSN(m.getSSN());
        //super.setDate(m.getDate());
        super.setID(m.getID());
    }

    public External(String name, String id, String address, String ssn, String date)
    {
        super.setName(name);
        super.setAddress(address);
        super.setSSN(new SSN(ssn));
        //super.setDate(new Date(date));
        super.setID(id);
    }
}
