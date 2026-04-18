package AimsProject.src.hust.soict.globalict.aims.media;

public class Media {
    private int id;
    private String title;
    private String caterogy;
    private float cost;
    private static int nbMedia = 0;
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getCaterogy() {
        return caterogy;
    }
    public float getCost() {
        return cost;
    }
    public Media(){
        this.id = nbMedia;
        this.title = "";
        this.caterogy = "";
        this.cost = 0.0f;
        nbMedia ++;
    }
    public Media(String title, String category, float cost){
        this.id = nbMedia;
        this.title = title;
        this.caterogy = category;
        this.cost = cost;
        nbMedia ++;
    }
    public boolean isMatch(String title){
        return this.getTitle() .contains(title);
    }
}
