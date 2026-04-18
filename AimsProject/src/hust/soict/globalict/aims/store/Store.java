package AimsProject.src.hust.soict.globalict.aims.store;
import AimsProject.src.hust.soict.globalict.aims.media.Media;
import java.util.ArrayList;
public class Store {
    public static final int MAX_NUMBERS_DVDS = 100;
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();
    public Store(){
        super();
    }
    public void addMedia(Media media){
        if (itemsInStore.add(media)){
            System.out.println("Media successfully added");
            return;
        }
        System.out.println("Failed to add the media.");
    }
    public void removeMedia(Media media){
        if (itemsInStore.remove(media)){
            System.out.println("Media successfully removed");
            return;
        }
        System.out.println("Failed to remove the media.");
    }
}
