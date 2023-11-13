package ro.scoalainformala;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> booklist;
    public Library(){
        this.booklist=new ArrayList<>();
    }
    public void addBook(Book book){
        booklist.add(book);
    }
    public void rmbook(Book book){
        if(booklist.contains(book)){
            booklist.remove(book);

        }else{
            System.out.println("This book is not in the book list.");
        }
    }

    public void getBooklist() {
        for (Book x:booklist){
            System.out.println(x);
        }
    }
}
