package ro.scoalainformala;

public class ArtAlbum extends Book{
    private String paperQuality;
    public ArtAlbum(String name,int pages, String paperQuality){
        super(name,pages);
        this.paperQuality=paperQuality;
    }

    public String getPaperQuality() {
        return paperQuality;
    }

    public void setPaperQuality(String paperQuality) {
        this.paperQuality = paperQuality;
    }
    @Override
    public String toString() {
        return "Art Album: " + getName() + ", paper quality " + getPaperQuality() + " (" + getPages() + " pages)";
    }
}
