package AimsProject.src.hust.soict.globalict.aims.cart;
import java.util.ArrayList;
import AimsProject.src.hust.soict.globalict.aims.media.Media;
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    public Cart(){
        super();
    }
    public void addMedia(Media media){
        if (!itemsOrdered.contains(media)){
            itemsOrdered.add(media);
            System.out.println("Media successfully added.");
            return;
        }
        System.out.println("Failed to add the media");
    }
    public void removeMedia(Media media){
        if (itemsOrdered.contains(media)){
            itemsOrdered.remove(media);
            System.out.println("Media successfully removed.");
            return;
        }
        System.out.println("Failed to remove the media");
    }
    public float totalCost(){
        float result = 0.0f;
        for (Media media : itemsOrdered){
            result += media.getCost();
        }
        return result;
    }
    public void DisplayCarts(){
        System.out.println("The cart includes:");
        int i = 0;
        for (Media media : itemsOrdered){
            System.out.printf("%-10d %-20s %-20f%n", (int)(i + 1), media.getTitle(), media.getCost());
            i++;
        }
        System.out.println("Total cost: " + totalCost());
    }
    public void print(){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        int i = 0;
        for (Media media : itemsOrdered){
            System.out.print((i + 1) + ".");
            System.out.println(media.toString());
            i ++;
        }
        System.out.println("Total cost: " + this.totalCost());
        System.out.println("***************************************************");
    }
    public void searchDVD(int id){
        boolean found = false;
        for (Media media : itemsOrdered){
            if (media.getId() == id){
                found = true;
                System.out.println("DVD id " + (id) + ": " + media.toString());
            }
        }
        if (!found){
            System.out.println("No DVDs with the title found.");
        }
    }
    public void searchDVD(String title){
        boolean found = false;
        int i = 0;
        for (Media media : itemsOrdered){
            if (media.isMatch(title)){
                found = true;
                System.out.println("DVD " + (i + 1) + ": " + media.toString());
                i ++;
            }
        }
        if (!found){
            System.out.println("No DVDs with the title found.");
        }
    }
    public void sortItemsOrdered(){
        java.util.Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
    }
}
