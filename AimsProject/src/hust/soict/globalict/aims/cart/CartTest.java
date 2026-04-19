package AimsProject.src.hust.soict.globalict.aims.cart;
import AimsProject.src.hust.soict.globalict.aims.media.Book;
import AimsProject.src.hust.soict.globalict.aims.media.CompactDisc;
import AimsProject.src.hust.soict.globalict.aims.media.DigitalVideoDisc;

public class CartTest {
    public static void main(String args[]){
        Cart cart = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        cart.addMedia(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        cart.addMedia(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        cart.addMedia(dvd3);
        cart.print();
        cart.searchMedia(0);
        cart.searchMedia(1);
        cart.searchMedia(2);
        cart.searchMedia(3);
        cart.searchMedia(4);
        cart.searchMedia("Ar");
        cart.searchMedia("zsw");
        cart.searchMedia("tar");
        CompactDisc cd1 = new CompactDisc("Me", "Not me", "Category", 45.2f);
        cart.addMedia(cd1);
        Book book1 = new Book();
        cart.addMedia(book1);
        cart.sortItemsOrderedCostTitle();
        cart.print();
    }
}
