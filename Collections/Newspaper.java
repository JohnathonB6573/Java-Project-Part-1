package Collections;
import Other.*;
//Newspaper has an ISSN number
public class Newspaper extends Collection{
    protected String ISSN;

    public Newspaper(){
        //this.idNumber = "";
        this.publicationDate = new Date("00/00/0000");
        this.section = "";
        this.author = "";
        this.price = 0.0;
        this.title = "";
        this.ISSN = "";
        this.renterName = "";
        this.renterID = "";
        this.checkoutDate = new Date("00/00/0000");
    }

    public Newspaper(String ISSN, String title, String publicationDate, String section, String author, Double price)
    {
        this.ISSN = ISSN;
        this.title = title;
        this.publicationDate = new Date(publicationDate);
        this.section = section;
        this.author = author;
        this.price = price;
        this.renterName = "";
        this.renterID = "";
        this.checkoutDate = new Date("00/00/0000");
    }

    String getISSN(){
        return this.ISSN;
    }
    public void setISSN(String issn){
        this.ISSN = issn;
    }
}
