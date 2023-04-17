package Collections;

import Other.Date;

public abstract class Collection {
    protected Date publicationDate;
    protected String section, author, idNumber;
    protected float price;

    public String getID() {
        return this.idNumber;
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

    public void setPrice(float price) {
        this.price = price;
    }
}
