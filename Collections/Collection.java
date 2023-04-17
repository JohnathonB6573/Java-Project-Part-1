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

    public Date getPubDate() {
        return this.publicationDate;
    }

    public String getSection() {
        return this.section;
    }

    public String getAuthor() {
        return this.author;
    }

    public float getPrice() {
        return this.price;
    }
}
