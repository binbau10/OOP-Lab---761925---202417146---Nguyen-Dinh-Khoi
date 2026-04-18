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
        cart.searchDVD(0);
        cart.searchDVD(1);
        cart.searchDVD(2);
        cart.searchDVD(3);
        cart.searchDVD(4);
        cart.searchDVD("Ar");
        cart.searchDVD("zsw");
        cart.searchDVD("tar");
        CompactDisc cd1 = new CompactDisc("Me", "Not me", "Category", 45.2f);
        cart.addMedia(cd1);
        Book book1 = new Book();
        cart.addMedia(book1);
        cart.sortItemsOrdered();
        cart.print();
    }
}
