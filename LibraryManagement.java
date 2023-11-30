package Projects;

import java.util.*;

class Book{
    private int id;
    private String titile;
    private String auther;
    private int quantity;

    public Book(int id, String title, String auther, int quantity){
        this.id=id;
        this.titile=title;
        this.auther=auther;
        this.quantity=quantity;
    }

    public int getId(){
        return id;
    }
    public String getTitile(){
        return titile;
    }
    public String getAuther(){
        return auther;
    }
    public int getQuantity(){
        return quantity;
    }
}

class Member{
    private int id;
    private String name;
    private String contact;

    public Member(int id,String name, String contact){
        this.id=id;
        this.name=name;
        this.contact=contact;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getContact(){
        return contact;
    }
}

public class LibraryManagement {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();
    private int bookIdCount=1;
    private int memberIdCount=1;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LibraryManagement librarySystem = new LibraryManagement();
        
        while(true){
            // to clear screen
            // System.out.print("\033[H\033[2J"); 
            // System.out.flush();
            
            System.out.println("\n --- Welcome to Digital Library Management ---\n");
            System.out.println("1. Add Book");
            System.out.println("2. List Books");
            System.out.println("3. Add Member");
            System.out.println("4. List Members");
            System.out.println("5. Exit");
            
            System.out.print("\n Selcet an Option : ");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    librarySystem.addBook();
                    break;
                case 2:
                    librarySystem.listBook();
                    break;
                case 3:
                    librarySystem.addMember();
                    break;
                case 4:
                    librarySystem.listMember();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Invalid Option. Please try again.");
            }
        }
        
    }
    public void addBook(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Title of the Book: ");
        String title= input.nextLine();
        System.out.println("Enter the author of Book: ");
        String author= input.nextLine();
        System.out.println("enter the quantity of the Book: ");
        int quantity = input.nextInt();

        Book book = new Book(bookIdCount++,title,author,quantity);
        books.add(book);
        System.out.println("Book Added Successfully.\n");

        // input.close();
    }

    public void listBook(){
        System.out.println("\nList Of Books :");
        for(Book book:books){
            System.out.println("ID : "+book.getId());
            System.out.println("Title : "+book.getTitile());
            System.out.println("Author: "+book.getAuther());
            System.out.println("Quantity: "+book.getQuantity());
            System.out.println("\t*************");
        }
    }
    
    public void addMember(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Name of a Member: ");
        String name = input.nextLine();
        System.out.print("Enter the Contact Information of Member: ");
        String contact = input.nextLine();

        Member member = new Member(memberIdCount++, name, contact);
        members.add(member);
        System.out.println("Member Added Successfully.\n");

        // input.close();
    }
    
    public void listMember(){
        System.out.println("\nList Of Members: ");
        for(Member member : members){
            System.out.println(" Id: "+member.getId());
            System.out.println("Name: "+member.getName());
            System.out.println("Contact: "+member.getContact());
            System.out.println("\t*************");
        }
    }
}
