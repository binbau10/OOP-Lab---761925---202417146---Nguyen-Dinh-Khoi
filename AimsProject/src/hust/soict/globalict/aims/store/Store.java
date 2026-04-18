package AimsProject.src.hust.soict.globalict.aims.store;
import AimsProject.src.hust.soict.globalict.aims.disc.DigitalVideoDisc;
public class Store {
    public static final int MAX_NUMBERS_DVDS = 100;
    private DigitalVideoDisc itemsInStore[] = new DigitalVideoDisc[MAX_NUMBERS_DVDS];
    private int numberOfDVDs;
    public Store(){
        super();
        numberOfDVDs = 0;
    }
    public void addDVD(DigitalVideoDisc disc){
        if (numberOfDVDs >= MAX_NUMBERS_DVDS){
            System.out.println("The store is full!");
            return;
        }
        itemsInStore[numberOfDVDs] = disc;
        numberOfDVDs ++;
        System.out.println("The disc is successfully added.");
        if (numberOfDVDs >= MAX_NUMBERS_DVDS - 3){
            System.out.println("The store is almost full!");
        }
        return;
    }
    public void removeDVD(DigitalVideoDisc disc){
        int removedDisc = 0;
        for (int i = 0; i < numberOfDVDs; i++){
            if (itemsInStore[i].equals(disc)){
                removedDisc ++;
            }
            else{
                itemsInStore[i - removedDisc] = itemsInStore[i];
            }
        }
        numberOfDVDs -= removedDisc;
        if (removedDisc == 0){
            System.out.println("There is no DVDs in the store matching the input.");
        }
        else if (removedDisc == 1){
            System.out.println("All " + removedDisc + " disc is now removed.");
        }
        else{
            System.out.println("All " + removedDisc + " discs are now removed.");
        }
    }
}
