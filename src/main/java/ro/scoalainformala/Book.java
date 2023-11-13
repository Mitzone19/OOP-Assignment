package ro.scoalainformala;

public class Book {
    private String name;
    private int pages;
    public Book(String name, int pages){
        this.name=name;
        this.pages=pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(Integer year) {
        this.pages = pages;
    }
    @Override
    public String toString(){
        return "Book: " + name + " (" + pages + ")";
    }
}
