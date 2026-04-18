package AimsProject.src.hust.soict.globalict.aims.media;

public class Media {
    private int id;
    private String title;
    private String caterogy;
    private float cost;
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
        this.id = 0;
        this.title = "";
        this.caterogy = "";
        this.cost = 0.0f;
    }
    public Media(int id, String title, String category, float cost){
        this.id = id;
        this.title = title;
        this.caterogy = category;
        this.cost = cost;
    }
}
