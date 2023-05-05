package Collections;
import java.time.LocalDate;


public class Collection {

    //protected String idNumber;
    protected String title;
    protected LocalDate publicationDate, checkoutDate;
    protected String section, author, renterName, renterID, ISBN, ISSN;
    protected double price;
    protected boolean isCheckedOut, isOverdue;

    //Default Constructor
    Collection(){
        this.title = " ";
        this.publicationDate = LocalDate.of(0000,0,0);
        this.section = " ";
        this.author = " ";
        this.price = 0;
        this.isCheckedOut = false;
        this.renterName = "";
        this.renterID = "";
        this.checkoutDate = LocalDate.of(0000,0,0);
        this.ISBN = "";
        this.ISSN = "";
        this.isOverdue = false;
    }

    //Constructor
    Collection(String title,LocalDate publicationDate,String section,String author, double price){
        this.title = title;
        this.publicationDate = publicationDate;
        this.section = section;
        this.author = author;
        this.price = price;
        this.isCheckedOut = false;
        this.renterName = "";
        this.renterID = "";
        this.checkoutDate = LocalDate.of(0000,0,0);
        this.ISBN = "";
        this.ISSN = "";
        this.isOverdue = false;
    }
    //Getters
    public String getTitle(){
        return this.title;
    }

    public String getRenterName(){
        return this.renterName;
    }

    public String getRenterID(){
        return this.renterID;
    }

    public LocalDate getCheckoutDate(){
        return this.checkoutDate;
    }

    public boolean getIsCheckedOut(){
        return this.isCheckedOut;
    }
    public LocalDate getPubDate() {
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

    public void setCheckoutDate(LocalDate d){
        this.checkoutDate = d;
    }

    public void setRenterName(String s){
        this.renterName = s;
    }

    public void setRenterID(String s){
        this.renterID = s;
    }

    public void setCheckedOut(boolean isCheck){
        this.isCheckedOut = isCheck;
    }

    public void setAuthor(String s){
        this.author = s;
    }

    public void setSection(String s){
        this.section = s;
    }

    public void setPublicationDate(LocalDate d){
        this.publicationDate = d;
    }

    public void setTitle(String s){
        this.title = s;
    }

    public String getISBN(){
        return this.ISBN;
    }
    public void setISBN(String isbn){
        this.ISBN = isbn;
    }

    public String getISSN(){
        return this.ISSN;
    }
    public void setISSN(String issn){
        this.ISSN = issn;
    }

    public void saveTo(String file)
    {
        //idk what this is for
    }

    public boolean getOverdue(){
        return this.isOverdue;
    }

    public void setOverdue(boolean b){
        this.isOverdue = b;
    }

    public void print(){
        System.out.println("Title = " + this.getTitle());
        System.out.println("Publication Date = " + this.getPubDate());
        System.out.println("Section = " + this.getSection());
        System.out.println("Author = " + this.getAuthor());
        System.out.println("Section = " + this.getPrice());
        System.out.println("Section = " + this.getIsCheckedOut());
        System.out.println("Section = " + this.getRenterName());
        System.out.println("Section = " + this.getRenterID());
        System.out.println("Section = " + this.getCheckoutDate());
        System.out.println("Section = " + this.getISBN());
        System.out.println("Section = " + this.getISSN());
        System.out.println("Section = " + this.getOverdue());
    }
}
