import People.*;
import Other.*;
import Collections.*;
//import LibarySystem.*;
import java.io.*;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ProjectMain{

    public static void mainMenu(){
        System.out.println("University of Java Library System");
        System.out.println("Menu Options");
        System.out.println("1. New Membership");
        System.out.println("2. New Collection");
        System.out.println("3. Remove Membership");
        System.out.println("4. Remove Item from Collection");
        System.out.println("5. New Employee");
        System.out.println("6. Borrow Item");
        System.out.println("7. Return Item");
        System.out.println("8. Check overdue books");
        System.out.println("9. Quit");
        System.out.println("");
    }


    //You can either implement your events in these functions, or you can write an Event class and call a static function here.
    public static void newMemberEvent(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Membership info: ");
        System.out.print("Enter Member Name: ");
        String name = scn.nextLine();

        System.out.print("Enter Member Address: ");
        String address = scn.nextLine();

        System.out.print("Enter Member Date of Birth: ");
        Date date = new Date(scn.nextLine());


        System.out.print("Enter Member email: ");
        String email = scn.nextLine();

        System.out.print("Enter Member SSN: ");
        SSN ssn = new SSN(scn.nextLine());

        System.out.println("Enter an ID: ");
        String id = scn.nextLine();

        System.out.print("Enter Membership type (Student/Professor/External): ");
        String membershipType = scn.nextLine();

        System.out.print("Creating a new member...");
        Member mem = new Member(name,id,address, email, ssn, date, membershipType);

        System.out.print("The membership ID is: "+mem.getID());
        //Save the new member into the membership database
        mem.saveTo("membershipdatabasefile.txt");
        System.out.println("\nNew Member Successfully Saved to file."); 


    };
    public static void newCollectionEvent(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Collection info: ");
        System.out.print("Enter Collection Type: (Book, DVD, Journal, or Newspaper)");

        String collectionType = scn.nextLine();
        switch(collectionType){
            case "Book", "book":
                System.out.print("Enter Book Name: ");
                String bookName = scn.nextLine();

                System.out.print("Enter Book Author: ");
                String bookAuthor = scn.nextLine();

                System.out.print("Enter Book ISBN: ");
                String bookISBN = scn.nextLine();

                System.out.print("Enter Book Publication Date: ");
                String bookPublication = scn.nextLine();

                System.out.print("Enter Book Section: ");
                String bookSection = scn.nextLine();

                System.out.print("Enter Book Price: ");
                Double bookPrice = scn.nextDouble();

                Book book = new Book(bookISBN, bookName, bookPublication, bookSection, bookAuthor, bookPrice);

                book.saveTo("collectionDatabaseFile.txt");
                System.out.println("\nNew Book Successfully Saved to file.");
                break;
            case "DVD", "dvd":
                System.out.print("Enter DVD Name: ");
                String dvdName = scn.nextLine();

                System.out.print("Enter DVD Author: ");
                String dvdAuthor = scn.nextLine();

                System.out.print("Enter DVD ISBN: ");
                String dvdISBN = scn.nextLine();

                System.out.print("Enter DVD Publication Date: ");
                String dvdPublication = scn.nextLine();

                System.out.print("Enter DVD Section: ");
                String dvdSection = scn.nextLine();

                System.out.print("Enter DVD Price: ");
                Double dvdPrice = scn.nextDouble();

                DVD dvd = new DVD(dvdISBN, dvdName, dvdPublication, dvdSection, dvdAuthor, dvdPrice);

                dvd.saveTo("collectionDatabaseFile.txt");
                System.out.println("\nNew DVD Successfully Saved to file.");
                break;
            case "Journal", "journal":
                System.out.print("Enter Journal Name: ");
                String journalName = scn.nextLine();

                System.out.print("Enter Journal Author: ");
                String journalAuthor = scn.nextLine();

                System.out.print("Enter Journal ISBN: ");
                String journalISBN = scn.nextLine();

                System.out.print("Enter Journal Publication Date: ");
                String journalPublication = scn.nextLine();

                System.out.print("Enter Journal Section: ");
                String journalSection = scn.nextLine();

                System.out.print("Enter Journal Price: ");
                Double journalPrice = scn.nextDouble();

                Journal journal = new Journal(journalISBN, journalName, journalPublication, journalSection, journalAuthor, journalPrice);

                journal.saveTo("collectionDatabaseFile.txt");
                System.out.println("\nNew Journal Successfully Saved to file.");
                break;
            case "Newspaper", "newspaper":
                System.out.print("Enter Newspaper Name: ");
                String newspaperName = scn.nextLine();

                System.out.print("Enter Newspaper Author: ");
                String newspaperAuthor = scn.nextLine();

                System.out.print("Enter Newspaper ISBN: ");
                String newspaperISBN = scn.nextLine();

                System.out.print("Enter Newspaper Publication Date: ");
                String newspaperPublication = scn.nextLine();

                System.out.print("Enter Newspaper Section: ");
                String newspaperSection = scn.nextLine();

                System.out.print("Enter Newspaper Price: ");
                Double newspaperPrice = scn.nextDouble();

                Newspaper newspaper = new Newspaper(newspaperISBN, newspaperName, newspaperPublication, newspaperSection, newspaperAuthor, newspaperPrice);

                newspaper.saveTo("collectionDatabaseFile.txt");
                System.out.println("\nNew Newspaper Successfully Saved to file.");
                break;
        }

        
    };

    public static void newRemoveMemberEvent(ArrayList<Person> People){
        Iterator<Person> iterator = People.iterator();
        Scanner scanner = new Scanner(System.in);
        String idNumber = null;
        Boolean success = false;

        try {
            System.out.println("Enter the identification number of member: ");
            idNumber = scanner.next();
        } catch(Exception InputMismatchException) {
            System.out.println("Error: input must be a string.");
            System.out.println();
        }

        while(iterator.hasNext()) {
            if(iterator.next().getID().equals(idNumber)) {
                iterator.remove();
                System.out.printf("%s has been removed.\n",iterator.next().getName());
                success = true;
                break;
            }
        }

        if(!success) {
            System.out.println("No member with that ID");
        }

    };

    public static void newRemoveCollectionEvent(ArrayList<Collection> Collections){
        Iterator<Collection> iterator = Collections.iterator();
        Scanner scanner = new Scanner(System.in);
        String type = null;
        String id = null;
        Boolean success = false;

        try{
            System.out.println("Enter the type of collection(Book/DVD/Journal/Newspaper): ")
            type = scanner.next();

            if(type.equals("Book") || type.equals("DVD")) {
                System.out.println("Enter the ISBN: ")
                id = scanner.next();
            }

            if(type.equals("Journal") || type.equals("Newspaper")) {
                System.out.println("Enter the ISSN: ")
                id = scanner.next();
            }
        } catch(Exception InputMismatchException) {
            System.out.println("Error: input must be a string.");
            System.out.println();
        }

        while(iterator.hasNext()) {

            if(type.equals("Book") || type.equals("DVD")) {
                if(iterator.next().getISBN().equals(id)) {
                    iterator.remove();
                    System.out.printf("%s has been successfully removed",iterator.next().getTitle());
                    success = true;
                }
            }

            if(type.equals("Journal") || type.equals("Newspaper")) {
                if(iterator.next().getISSN().equals(id)) {
                    iterator.remove();
                    System.out.printf("%s has been successfully removed",iterator.next().getTitle());
                    success = true;
                }
            }
        }

        if(!success) {
            System.out.println("No collection item was found with that ISBN or ISSN number.");
        }

    };

    public static void newEmployeeEvent(ArrayList<Person> People){
        String Name = null, Address = null, Email = null , ID = null;
        int dob_year = 0, dob_month = 0, dob_day = 0;
        SSN ssn;
        float salary = 0;
        Scanner scanner = new Scanner(System.in);

        //Ask for inputs
        try {
            System.out.println("Please enter your name: ");
            Name = scanner.nextLine();
        }catch(Exception InputMismatchException){
            System.out.println("Error: input must be a string.");
            System.out.println();
        }

        try {
            System.out.println("Please enter your Address: ");
            Address = scanner.nextLine();
        }catch(Exception InputMismatchException){
            System.out.println("Error: input must be a string.");
            System.out.println();
        }

        try {
            System.out.println("Please enter your Email: ");
            Email = scanner.nextLine();
        }catch(Exception InputMismatchException){
            System.out.println("Error: input must be a string.");
            System.out.println();
        }

        try {
            System.out.println("Please enter your ID: ");
            ID = scanner.nextLine();
        }catch(Exception InputMismatchException){
            System.out.println("Error: input must be a string.");
            System.out.println();
        }

        try {
            System.out.println("Please enter your birth year: ");
            dob_year = scanner.nextInt();
        }catch(Exception InputMismatchException){
            System.out.println("Error: input must be an integer.");
            System.out.println();
        }

        try {
            System.out.println("Please enter your birth month: ");
            dob_month = scanner.nextInt();
        }catch(Exception InputMismatchException){
            System.out.println("Error: input must be an integer.");
            System.out.println();
        }

        try {
            System.out.println("What day of the month were you born on: ");
            dob_day = scanner.nextInt();
        }catch(Exception InputMismatchException){
            System.out.println("Error: input must be an integer.");
            System.out.println();
        }


        System.out.println("Please enter your SSN: ");
        ssn = new SSN(scanner.nextLine());

        try {
            System.out.println("What is your hourly salary: ");
            salary = scanner.nextFloat();
        }catch(Exception InputMismatchException){
            System.out.println("Error: input must be an Float.");
            System.out.println();
        }

        scanner.close();


        Employee employee = new Employee(Name, Address, Email, ssn,
                LocalDate.of(dob_year, dob_month,dob_day),
                0, salary, ID);

        People.add(employee);

    };
    public static void newBorrowsEvent(ArrayList<Collection> Collections, ArrayList<Person> People){
        Librarian John = new Librarian();
        Scanner scanner = new Scanner(System.in);
        String Title = "", ID = "";

        try {
            System.out.println("What is the title of the Collection: ");
            Title = scanner.nextLine();
        }catch(Exception InputMismatchException){
            System.out.println("Error: input must be an String.");
            System.out.println();
        }

        try {
            System.out.println("What is the ID of the customer: ");
            ID = scanner.nextLine();
        }catch(Exception InputMismatchException){
            System.out.println("Error: input must be an String.");
            System.out.println();
        }

        scanner.close();
        John.checkoutCollection((Collections.get(John.searchTitle(Collections, Title))),
                People.get(John.searchPeople(People, ID)));
    };
    public static void newReturnEvent(ArrayList<Collection> Collections){
        Librarian John = new Librarian();
        Scanner scanner = new Scanner(System.in);
        String Title = "", ID = "";

        try {
            System.out.println("What is the title of the Collection: ");
            Title = scanner.nextLine();
        }catch(Exception InputMismatchException){
            System.out.println("Error: input must be an String.");
            System.out.println();
        }

        try {
            System.out.println("What is the ID of the customer: ");
            ID = scanner.nextLine();
        }catch(Exception InputMismatchException){
            System.out.println("Error: input must be an String.");
            System.out.println();
        }

        scanner.close();
        John.checkinCollection(Collections.get(John.searchTitle(Collections, Title)));

    };
    public static void newCheckOverdues(ArrayList<Collection> Collections){
        Librarian John = new Librarian();
        John.returnOverdues(Collections);

    };
    //You are free to implememnt other events that you see needs to be implemented

    public static void main(String [] args){

        ProjectMain.mainMenu();
        //Initialization
        ArrayList<Collection> Collections = new ArrayList<>();
        ArrayList<Person> People = new ArrayList<>();

        System.out.println("Enter your username to login:");
        System.out.print("Enter your option number: ");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        while(true){

            switch (option) {
                case 1:
                    ProjectMain.newMemberEvent();
                    //need to convert date to date can see example in newemployee, needs to add to people
                    break;
                case 2:
                    ProjectMain.newCollectionEvent();
                    //book error, needs to add to array list collections
                    break;
                case 3:
                    ProjectMain.newRemoveMemberEvent(People);
                    //not finished, needs to remove from people
                    break;
                case 4:
                    ProjectMain.newRemoveCollectionEvent(Collections);
                    //Not finished, needs to remove from collections
                    break;
                case 5:
                    ProjectMain.newEmployeeEvent(People);
                    //finished
                    break;
                case 6:
                    ProjectMain.newBorrowsEvent(Collections, People);
                    //finished
                    break;
                case 7:
                    ProjectMain.newReturnEvent(Collections);
                    //finished
                    break;
                case 8:
                    ProjectMain.newCheckOverdues(Collections);
                    //finished
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid operator.");
                    continue;
            }
        }




    }
}