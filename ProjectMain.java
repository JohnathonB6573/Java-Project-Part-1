import People.*;
import Other.*;
import Collections.*;
import LibarySystem.*;
import java.io.*;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

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
        System.out.println("8. Check overdues");
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

        System.out.print("Enter Membership type (Student/Professor/External): ");
        String membershipType = scn.nextLine();

        System.out.print("Creating a new member...");
        Member mem = new Member(name, address, email, ssn, date, membershipType);

        System.out.print("The membership ID is: "+mem.getID());
        //Save the new member into the membership database
        mem.saveTo("membershipdatabasefile.txt");
        System.out.println("\nNew Member Successfully Saved to file."); 


    };
    public static void newCollectionEvent(){
        
    };

    public static void newRemoveMemberEvent(){

        
    };
    public static void newRemoveCollectionEvent(){};
    public static void newEmployeeEvent(){};
    public static void newBorrowsEvent(){};
    public static void newReturnEvent(){};
    public static void newCheckOverdues(){};
    //You are free to implememnt other events that you see needs to be implemented

    public static void main(String [] args){
        ProjectMain.mainMenu();

        System.out.print("Enter your option number: ");
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
        while(true){

            switch (option) {
                case 1:
                    ProjectMain.newMemberEvent();
                    break;
                case 2:
                    ProjectMain.newCollectionEvent();
                    break;
                case 3:
                    ProjectMain.newRemoveMemberEvent();
                    break;
                case 4:
                    ProjectMain.newRemoveCollectionEvent();
                    break;
                case 5:
                    ProjectMain.newEmployeeEvent();
                    break;
                case 6:
                    ProjectMain.newBorrowsEvent();
                    break;
                case 7:
                    ProjectMain.newReturnEvent();
                    break;
                case 8:
                    ProjectMain.newCheckOverdues();
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
