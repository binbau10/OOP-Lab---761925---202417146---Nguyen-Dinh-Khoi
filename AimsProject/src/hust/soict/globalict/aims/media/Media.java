package AimsProject.src.hust.soict.globalict.aims.media;
import java.util.Comparator;

import javax.naming.LimitExceededException;
public class Media {
    private int id;
    private String title;
    private String category;
    private float cost;
    private static int nbMedia = 0;
    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public float getCost() {
        return cost;
    }
    public Media(){
        this.id = nbMedia;
        this.title = "";
        this.category = "";
        this.cost = 0.0f;
        nbMedia ++;
    }
    public Media(String title, String category, float cost) throws LimitExceededException{
        if (cost < 0){
            throw new LimitExceededException("ERROR: The cost of a media must be non-negative");
        }
        this.id = nbMedia;
        this.title = title;
        this.category = category;
        this.cost = cost;
        nbMedia ++;
    }
    public boolean isMatch(String title){
        return this.getTitle() .contains(title);
    }
    public boolean equals(Object object){
        return this.title == ((Media)object).title;
    }
}
