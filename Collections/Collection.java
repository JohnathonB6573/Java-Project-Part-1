package Collections;

import Other.Date;

public abstract class Collection {
    private int idNumber;
    private Date publicationDate;
    private String section, author;
    private float price;

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
