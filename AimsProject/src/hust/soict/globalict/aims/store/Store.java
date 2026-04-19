package AimsProject.src.hust.soict.globalict.aims.store;
import AimsProject.src.hust.soict.globalict.aims.media.Media;
import java.util.ArrayList;
public class Store {
    private ArrayList<Media> itemsInStore = new ArrayList<Media>();
    public Store(){
        super();
    }
    public boolean addMedia(Media media){
        if (!itemsInStore.contains(media)){
            itemsInStore.add(media);
            System.out.println("Media successfully added");
            return true;
        }
        System.out.println("Failed to add the media.");
        return false;
    }
    public void removeMedia(Media media){
        if (itemsInStore.remove(media)){
            System.out.println("Media successfully removed");
            return;
        }
        System.out.println("Failed to remove the media.");
    }
    public void print(){
        System.out.println("***********************Store***********************");
        System.out.println("Items in store:");
        int i = 0;
        for (Media media : itemsInStore){
            System.out.print((i + 1) + ".");
            System.out.println(media.toString());
            i ++;
        }
        System.out.println("***************************************************");
    }
    public Media searchMedia(String title){
        for (Media media : itemsInStore){
            if ((media.getTitle()).contains(title)){
                System.out.println("Media found");
                System.out.println(media.toString());
                return media;
            }
        }
        System.out.println("No DVDs with the title found.");
        return null;
    }
}
