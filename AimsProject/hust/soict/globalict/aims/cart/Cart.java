package AimsProject.hust.soict.globalict.aims.cart;
import AimsProject.hust.soict.globalict.aims.disc.DigitalVideoDisc;
public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered;
    public Cart(){
        super();
        qtyOrdered = 0;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered >= MAX_NUMBERS_ORDERED){
            System.out.println("The cart is full!");
            return;
        }
        itemsOrdered[qtyOrdered] = disc;
        qtyOrdered ++;
        System.out.println("The disc is successfully added.");
        if (qtyOrdered >= MAX_NUMBERS_ORDERED - 3){
            System.out.println("The cart is almost full!");
        }
        return;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2){
        if (qtyOrdered + 2 > MAX_NUMBERS_ORDERED){
            System.out.println("The cart is full!");
            return;
        }
        itemsOrdered[qtyOrdered] = disc1;
        qtyOrdered ++;
        itemsOrdered[qtyOrdered] = disc2;
        qtyOrdered ++;
        System.out.println("The discs are successfully added.");
        if (qtyOrdered >= MAX_NUMBERS_ORDERED - 3){
            System.out.println("The cart is almost full!");
        }
        return;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc... dvdList){
        if (qtyOrdered + dvdList.length > MAX_NUMBERS_ORDERED){
            System.out.println("The cart is full!");
            return;
        }
        for (int i = 0; i < dvdList.length; i++){
            itemsOrdered[qtyOrdered] = dvdList[i];
            qtyOrdered ++;
        }
        System.out.println("The discs are successfully added.");
        if (qtyOrdered >= MAX_NUMBERS_ORDERED - 3){
            System.out.println("The cart is almost full!");
        }
        return;
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc){
        int removedDisc = 0;
        for (int i = 0; i < qtyOrdered; i++){
            if (itemsOrdered[i].equals(disc)){
                removedDisc ++;
            }
            else{
                itemsOrdered[i - removedDisc] = itemsOrdered[i];
            }
        }
        qtyOrdered -= removedDisc;
        if (removedDisc == 0){
            System.out.println("There is no DVDs in the cart matching the input.");
        }
        else if (removedDisc == 1){
            System.out.println("All " + removedDisc + " disc is now removed.");
        }
        else{
            System.out.println("All " + removedDisc + " discs are now removed.");
        }
    }
    public float totalCost(){
        float result = 0.0f;
        for (int i = 0; i < qtyOrdered; i++){
            result += itemsOrdered[i].getCost();
        }
        return result;
    }
    public void DisplayCarts(){
        System.out.println("The cart includes:");
        for (int i = 0; i < qtyOrdered; i++){
            System.out.printf("%-10d %-20s %-20f%n", (int)(i + 1), itemsOrdered[i].getTitle(), itemsOrdered[i].getCost());
        }
        System.out.println("Total cost: " + totalCost());
    }
}
