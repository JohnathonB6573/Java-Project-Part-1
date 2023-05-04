package Collections;
import Other.SSN;
import java.time.LocalDate;
//book has a ISBN Number 
public class Book extends Collection {
    protected String ISBN;

    public Book(){
        //this.idNumber = "";
        this.ISBN = "";
        this.title = "";
        this.publicationDate = LocalDate.of(0000,0,0);
        this.section = "";
        this.author = "";
        this.price = 0.0;
        this.renterName = "";
        this.renterID = "";
        this.checkoutDate = LocalDate.of(0000,0,0);
    }

    public Book(String ISBN, String title, String publicationDate, String section, String author, Double price)
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

}
