package ro.scoalainformala;

public class Novel extends Book{
    private String type;
    public Novel(String name, int pages, String type){
        super(name, pages);
        this.type=type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Novel: " + getName() + ", type: " + getType() + " (" + getPages() + " pages)";
    }
}
