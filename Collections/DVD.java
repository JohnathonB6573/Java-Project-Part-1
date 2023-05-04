package Collections;
import Other.*;

import java.time.LocalDate;

//DVD has an ISBN number
public class DVD extends Collection {
    protected String ISBN;

    public DVD(){
        //this.idNumber = "";
        this.ISBN = "";
        this.publicationDate = LocalDate.of(0000,0,0);
        this.section = "";
        this.author = "";
        this.price = 0.0;
        this.title = "";
        this.renterName = "";
        this.renterID = "";
        this.checkoutDate = LocalDate.of(0000,0,0);
    }

    public DVD(String ISBN, String title, String publicationDate, String section, String author, Double price)
    {
        this.ISBN = ISBN;
        this.title = title;
        this.publicationDate = LocalDate.of(0000,0,0);
        this.section = section;
        this.author = author;
        this.price = price;
        this.renterName = "";
        this.renterID = "";
        this.checkoutDate = LocalDate.of(0000,0,0);
    }

    String getISBN(){
        return this.ISBN;
    }
    public void setISBN(String isbn){
        this.ISBN = isbn;
    }
    
}
