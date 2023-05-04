package Collections;
import Other.*;

import java.time.LocalDate;

//Journal has an ISSN number
public class Journal extends Collection{
    protected String ISSN;

    public Journal(){
        //this.idNumber = "";
        this.publicationDate = LocalDate.of(0000,0,0);
        this.section = "";
        this.author = "";
        this.price = 0.0;
        this.title = "";
        this.ISSN = "";
        this.renterName = "";
        this.renterID = "";
        this.checkoutDate = LocalDate.of(0000,0,0);
    }

    public Journal(String ISSN, String title, String publicationDate, String section, String author, Double price)
    {
        this.ISSN = ISSN;
        this.title = title;
        this.publicationDate = LocalDate.of(0000,0,0);
        this.section = section;
        this.author = author;
        this.price = price;
        this.renterName = "";
        this.renterID = "";
        this.checkoutDate = LocalDate.of(0000,0,0);
    }

    String getISSN(){
        return this.ISSN;
    }
    public void setISSN(String issn){
        this.ISSN = issn;
    }
    
}
