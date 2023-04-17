package Collections;

import Other.Date;

public class Collection {

    protected String idNumber;
    protected String title;
    protected Date publicationDate;
    protected String section, author;
    protected double price;


    public void setID(String id) {
    	try {
			if(id.length()==6) {
				this.idNumber = id;
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
    }

    public String getID() {
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

    public void saveTo(String file)
    {

    }
}
