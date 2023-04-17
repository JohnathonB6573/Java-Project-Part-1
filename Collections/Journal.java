package Collections;
import Other.*;
//Journal has an ISSN number
public class Journal extends Collection{
    protected String ISSN;

    Journal(){
        this.idNumber = 0;
        this.publicationDate = new Date("00/00/0000");
        this.section = "";
        this.author = "";
        this.price = 0.0;
    }

    Journal(int idNumber, String ISSN, String title, String publicationDate, String section, String author, Double price)
    {
        this.idNumber = idNumber;
        this.ISSN = ISSN;
        this.title = title;
        this.publicationDate = new Date(publicationDate);
        this.section = section;
        this.author = author;
        this.price = price;
    }

    String getISSN(){
        return this.ISSN;
    }
    
}
