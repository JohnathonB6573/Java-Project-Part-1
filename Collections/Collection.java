package Collections;

import Other.Date;

public abstract class Collection {
    protected int idNumber;
    protected Date publicationDate;
    protected String section, author;
    protected float price;

    public int getID() {
        return this.idNumber;
    }

    public void setID(int idNumber) {
        this.idNumber = idNumber;
    }

    public Date getPubDate() {
        return this.publicationDate;
    }

    public void setDate(Date d) {
        this.publicationDate = d;
    }

    public String getSection() {
        return this.section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
