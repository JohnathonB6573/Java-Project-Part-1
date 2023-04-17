package Collections;
import Other.*;
//book has a ISBN Number 
public class Book extends Collection {
    protected String ISBN;

    Book(){
        this.idNumber = 0;
        this.publicationDate = new Date("00/00/0000");
        this.section = "";
        this.author = "";
        this.price = 0.0;
    }

    Book(int idNumber, String ISBN, String title, String publicationDate, String section, String author, Double price)
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
