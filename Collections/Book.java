package Collections;
import Other.*;
//book has a ISBN Number 
public class Book extends Collection {
    protected String ISBN;

    public Book(){
        this.idNumber = "";
        this.ISBN = "";
        this.title = "";
        this.publicationDate = new Date("00/00/0000");
        this.section = "";
        this.author = "";
        this.price = 0.0;
    }

    public Book(String id, String ISBN, String title, String publicationDate, String section, String author, Double price)
    {
        this.ISBN = ISBN;
        this.title = title;
        this.publicationDate = new Date(publicationDate);
        this.section = section;
        this.author = author;
        this.price = price;

        setID(id);
    }

    String getISBN(){
        return this.ISBN;
    }

}
