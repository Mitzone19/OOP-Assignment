package ro.scoalainformala;


import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library=new Library();
        Scanner scanner=new Scanner(System.in);
        // Standard introduction
        Book book1;
        Book book2;
        Book book3;
        System.out.println("This is a simple Library Catalog algorithm");
        System.out.println();
        System.out.println("You can add 3 books, remove one of them, and display all items");
        System.out.println();

        //ADD BOOK SEQUENCE
        // book1 Input
        System.out.println("Enter the first book name");
        String input1=scanner.nextLine();
        System.out.println("Enter the number of pages");
        int input11=Integer.valueOf(scanner.nextLine());

        //Loop to choose a correct book type
        while(true) {
            System.out.println("It's a Novel or an Art Album?");
            System.out.println("***(enter only N or A)***");
            String input111 = scanner.nextLine();
            if (input111.toLowerCase().equals("n")) {
                System.out.println("Enter the type of the novel:");
                String inputType1 = scanner.nextLine();
                book1 = new Novel(input1, input11, inputType1);
                library.addBook(book1);
                break;
            } else if (input111.toLowerCase().equals("a")) {
                System.out.println("Enter the quality of the paper:");
                String inputPaperQuality1 = scanner.nextLine();
                book1 = new ArtAlbum(input1, input11, inputPaperQuality1);
                library.addBook(book1);
                break;
            } else {
                System.out.println("INVALID CHARACTER");
            }
        }
        System.out.println();

        //book2 Input
        System.out.println("Enter the second book name");
        String input2=scanner.nextLine();
        System.out.println("Enter the number of pages");
        int input22=Integer.valueOf(scanner.nextLine());
        //Loop to choose a correct book type
        while(true) {
            System.out.println("It's a Novel or an Art Album?");
            System.out.println("***(enter only N or A)***");
            String input222 = scanner.nextLine();
            if (input222.toLowerCase().equals("n")) {
                System.out.println("Enter the type of the novel:");
                String inputType2 = scanner.nextLine();
                book2 = new Novel(input2, input22, inputType2);
                library.addBook(book2);
                break;
            } else if (input222.toLowerCase().equals("a")) {
                System.out.println("Enter the quality of the paper:");
                String inputPaperQuality2 = scanner.nextLine();
                book2 = new ArtAlbum(input2, input22, inputPaperQuality2);
                library.addBook(book2);
                break;
            } else {
                System.out.println("INVALID CHARACTER");
            }
        }
        System.out.println();


        //book 3 Input
        System.out.println("Enter the third book name");
        String input3=scanner.nextLine();
        System.out.println("Enter the number of pages");
        int input33=Integer.valueOf(scanner.nextLine());

        //Loop to choose a correct book type
        while(true) {
            System.out.println("It's a Novel or an Art Album?");
            System.out.println("***(enter only N or A)***");
            String input333 = scanner.nextLine();
            if (input333.toLowerCase().equals("n")) {
                System.out.println("Enter the type of the novel:");
                String inputType3 = scanner.nextLine();
                book3 = new Novel(input3, input33, inputType3);
                library.addBook(book3);
                break;
            } else if (input333.toLowerCase().equals("a")) {
                System.out.println("Enter the quality of the paper:");
                String inputPaperQuality3 = scanner.nextLine();
                book3 = new ArtAlbum(input3, input33, inputPaperQuality3);
                library.addBook(book3);
                break;
            } else {
                System.out.println("INVALID CHARACTER");
            }
        }
        System.out.println();
        System.out.println("This is the current library:");
        library.getBooklist();

        // REMOVE BOOK SEQUENCE
        System.out.println("Want to remove a book? Y/N");
        String yn=scanner.nextLine();
        if(yn.toLowerCase().equals("y")){
            System.out.println("Choose which book to delete 1,2 or 3: ");
            String delete=scanner.nextLine();
            if(delete.equals("1")){
                library.rmbook(book1);
                System.out.println("This is the new library:");
                library.getBooklist();

            } else if (delete.equals("2")) {
                library.rmbook(book2);
                System.out.println("This is the new library:");
                library.getBooklist();
            } else if (delete.equals("3")) {
                library.rmbook(book3);
                System.out.println("This is the new library:");
                library.getBooklist();
            }else{
                System.out.println("INVALID CHOICE");
            }
        }else if(yn.toLowerCase().equals("n")){
            System.out.println("No book will be deleted");
        }else{
            System.out.println("INVALID CHARACTER");
        }


        System.out.println("----------------END----------------");





    }
}