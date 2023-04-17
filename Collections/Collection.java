package Collections;

import java.time;
import java.date;

public abstract class Collection {
    protected Date publicationDate;
    protected String section, author, idNumber;
    protected float price;
    protected boolean isCheckedOut;

    //DEFAULT CONSTRUCTOR
    Collection(){
        this.author = "";
        this.idNumber = "";
        this.section = "";
        this.isCheckedOut = false;
        this.price = 0.0f;
        this.publicationDate = new Date();
    }

    //GETTERS
    public String getID() {
        return this.idNumber;
    }
    public Date getPubDate() {
        return this.publicationDate;
    }

    public float getPrice() {
        return this.price;
    }

    public String getSection() {
        return this.section;
    }

    public String getAuthor() {
        return this.author;
    }

    public boolean getIsCheckedOut(){return this.isCheckedOut;}

    //SETTERS
    public void setIsCheckedOut(boolean check){this.isCheckedOut = check; }

    public void setSection(String section) {
        this.section = section;
    }
    public void setDate(Date d) {
        this.publicationDate = d;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setID(String id) {
        try {
            if(id.length()==6) {
                this.idNumber = id;
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
