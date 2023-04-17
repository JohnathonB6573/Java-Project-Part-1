package Other;

public class Borrowcollection {
    /*this class will be used when someone puts outs in an ISBN or ISSN
       to check out a collection. It will check to see if the number is
       less than or equal to six then return it.
     */
    protected String borrowCollection;

    public String borrowCollection(String collectionNumber){
        if(collectionNumber.toCharArray().length<=6){
            this.borrowCollection = collectionNumber;
        }
        else
            System.out.println("Invalid");
    }
    public String getISBN() {
        return this.borrowCollection;
    }
    public void printBorrowedISBN() {
        System.out.println(this.borrowCollection);
    }
}
