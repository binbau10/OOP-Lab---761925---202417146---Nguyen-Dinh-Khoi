package AimsProject.src.hust.soict.globalict.aims.cart;
import javax.naming.LimitExceededException;

import AimsProject.src.hust.soict.globalict.aims.media.Media;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private ObservableList<Media> itemsOrdered = FXCollections.observableArrayList();
    public Cart(){
        super();
    }
    public ObservableList<Media> getItemsOrdered() {
        return itemsOrdered;
    }
    public void addMedia(Media media) throws LimitExceededException{
        if (itemsOrdered.size() >= MAX_NUMBERS_ORDERED){
            throw new LimitExceededException("ERROR: The number of media has reached its limit");
        }
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
    public void searchMedia(int id){
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
    public Media searchMedia(String title){
        for (Media media : itemsOrdered){
            if (media.getTitle() == title){
                System.out.println("Media found");
                System.out.println(media.toString());
                return media;
            }
        }
        System.out.println("No DVDs with the title found.");
        return null;
    }
    public void print(int id){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        int i = 0;
        for (Media media : itemsOrdered){
            if (media.getId() != id) continue;
            System.out.print((i + 1) + ".");
            System.out.println(media.toString());
            i ++;
        }
        System.out.println("Total cost: " + this.totalCost());
        System.out.println("***************************************************");
    }
    public void print(String title){
        System.out.println("***********************CART***********************");
        System.out.println("Ordered Items:");
        int i = 0;
        for (Media media : itemsOrdered){
            if (!(media.getTitle()).contains(title)) continue;
            System.out.print((i + 1) + ".");
            System.out.println(media.toString());
            i ++;
        }
        System.out.println("Total cost: " + this.totalCost());
        System.out.println("***************************************************");
    }
    public void sortItemsOrderedCostTitle(){
        java.util.Collections.sort(itemsOrdered, Media.COMPARE_BY_COST_TITLE);
    }
    public void sortItemsOrderedTitleCost(){
        java.util.Collections.sort(itemsOrdered, Media.COMPARE_BY_TITLE_COST);
    }
    public void clearCart(){
        itemsOrdered.clear();
        System.out.println("The cart is cleared.");
    }
}
