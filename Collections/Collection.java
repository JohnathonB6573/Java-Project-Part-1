package Collections;

import Other.Date;

public class Collection {
    protected int idNumber;
    protected String title;
    protected Date publicationDate;
    protected String section, author;
    protected double price;


    public int getID() {
        return this.idNumber;
    }

    public String getTitle(){
        return this.title;
    }

    public Date getPubDate() {
        return this.publicationDate;
    }

    public String getSection() {
        return this.section;
    }

    public String getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }
}
