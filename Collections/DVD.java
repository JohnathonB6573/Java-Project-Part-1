package Collections;
import Other.*;
//DVD has an ISBN number
public class DVD extends Collection {
    protected String ISBN;

    DVD(){
        this.idNumber = 0;
        this.ISBN = "";
        this.publicationDate = new Date("00/00/0000");
        this.section = "";
        this.author = "";
        this.price = 0.0;
    }

    DVD(int idNumber, String ISBN, String title, String publicationDate, String section, String author, Double price)
    {
        this.idNumber = idNumber;
        this.ISBN = ISBN;
        this.title = title;
        this.publicationDate = new Date(publicationDate);
        this.section = section;
        this.author = author;
        this.price = price;
    }

    String getISBN(){
        return this.ISBN;
    }
    
}
