package Collections;

import Other.Date;

public class Collection {

    //protected String idNumber;
    protected String title;
    protected Date publicationDate;
    protected String section, author;
    protected double price;

    //Default Constructor
    Collection(){
        this.title = " ";
        this.publicationDate = new Date("00/00/0000");
        this.section = " ";
        this.author = " ";
        this.price = 0;
    }

    //public void setID(String id) {
    //	try {
	//		if(id.length()==6) {
	//			this.idNumber = id;
	//		}
	//	} catch(Exception e) {
	//		e.printStackTrace();
	//	}
    //}

    //public String getID() {
       // return this.idNumber;
    //}

    //Getters
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

    //Setters

    public void setPrice(double d){
        this.price = d;
    }

    public void setAuthor(String s){
        this.author = s;
    }

    public void setSection(String s){
        this.section = s;
    }

    public void setPublicationDate(Date d){
        this.publicationDate = d;
    }

    public void setTitle(String s){
        this.title = s;
    }

    public void saveTo(String file)
    {
        //idk what this is for
    }
}
