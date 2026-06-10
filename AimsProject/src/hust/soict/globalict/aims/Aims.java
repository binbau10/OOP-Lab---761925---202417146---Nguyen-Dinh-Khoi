package AimsProject.src.hust.soict.globalict.aims;
import AimsProject.src.hust.soict.globalict.aims.cart.Cart;
import AimsProject.src.hust.soict.globalict.aims.media.DigitalVideoDisc;
import AimsProject.src.hust.soict.globalict.aims.store.Store;
import AimsProject.src.hust.soict.globalict.aims.media.Media;
import AimsProject.src.hust.soict.globalict.aims.media.Playable;

import java.util.Scanner;

import javax.naming.LimitExceededException;

public class Aims{
    private static Scanner scanner = new Scanner(System.in);
    private static Store store = new Store();
    private static Cart cart = new Cart();
    public static void main(String args[]){
        //
        try{
            DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
            DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
            DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
            store.addMedia(dvd1);
            store.addMedia(dvd2);
            store.addMedia(dvd3);
            showMenu();
            
        }
        catch(LimitExceededException e){
            e.printStackTrace();
        }
        finally{
            scanner.close();
        }
    }
    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
        int choice = scanner.nextInt();
        if (choice == 0) return;
        if (choice == 1){
            store.print();
            storeMenu();
            return;
        }
        if (choice == 2){
            updateStore();
            return;
        }
        if (choice == 3){
            cartMenu();
            return;
        }
        return;
    }
    public static void storeMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media/'s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
        int choice = scanner.nextInt();
        scanner.nextLine().replaceAll("\\r\\n|\\r|\\n", "");
        if (choice == 0){
            showMenu();
            return;
        }
        if (choice == 1){
            System.out.println("Please enter a title:");
            String input = scanner.nextLine().replaceAll("\\r\\n|\\r|\\n", "");
            Media media = store.searchMedia(input);
            if (media == null){
                System.out.println("No media with the name found");
                storeMenu();
                return;
            }
            mediaDetailsMenu(media);
            return;
        }
        if (choice == 2){
            updateStore();
            return;
        }
        if (choice == 3){
            System.out.println("Please enter a title:");
            String input = scanner.nextLine().replaceAll("\\r\\n|\\r|\\n", "");
            Media media = store.searchMedia(input);
            if (media == null){
                System.out.println("No media with the name found");
                storeMenu();
                return;
            }
            playMedia(media);
            storeMenu();
            return;
        }
        if (choice == 4){
            cartMenu();
            return;
        }
    }
    public static void updateStore(){
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add a media to store");
        System.out.println("2. Remove a media from store");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
        int choice = scanner.nextInt();
        scanner.nextLine().replaceAll("\\r\\n|\\r|\\n", "");
        if (choice == 1){
            addMediaToStore();
            updateStore();
            return;
        }
        if (choice == 2){
            removeMediaFromStore();
            updateStore();
            return;
        }
        if (choice == 0){
            showMenu();
            return;
        }
        return;
    }
    public static void addMediaToStore(){
        System.out.println("Enter title:");
        String title = scanner.nextLine().replaceAll("\\r\\n|\\r|\\n", "");
        System.out.println("Enter category:");
        String category = scanner.nextLine().replaceAll("\\r\\n|\\r|\\n", "");
        System.out.println("Enter cost:");
        float cost = scanner.nextFloat();
        Media media = new Media();
        try{
            media = new Media(title, category, cost);
        }
        catch (LimitExceededException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Title: " + title + "\nCategory: " + category + "\nCost: " + cost + "\nProceed?\n1. Yes\n0. No");
            int choice = scanner.nextInt();
            scanner.nextLine().replaceAll("\\r\\n|\\r|\\n", "");
            if (choice == 0) return;
            if (choice == 1){
                store.addMedia(media);
            }
        }
        return;
    }
    public static void removeMediaFromStore(){
        store.print();
        System.out.println("Enter title:");
        String title = scanner.nextLine().replaceAll("\\r\\n|\\r|\\n", "");
        Media media = store.searchMedia(title);
        System.out.println(media.toString());
        System.out.println("Proceed?\n1. Yes\n0. No");
        int choice = scanner.nextInt();
        scanner.nextLine().replaceAll("\\r\\n|\\r|\\n", "");
        if (choice == 0) return;
        if (choice == 1){
            store.removeMedia(media);
        }
        return;
    }
    public static void removeMediaFromCart(){
        cart.print();
        System.out.println("Enter title:");
        String title = scanner.nextLine().replaceAll("\\r\\n|\\r|\\n", "");
        Media media = cart.searchMedia(title);
        System.out.println(media.toString());
        System.out.println("Proceed?\n1. Yes\n0. No");
        int choice = scanner.nextInt();
        scanner.nextLine().replaceAll("\\r\\n|\\r|\\n", "");
        if (choice == 0) return;
        if (choice == 1){
            cart.removeMedia(media);
        }
        return;
    }
    public static void playMedia(Media media){
        if (media instanceof Playable){
            try{
                ((Playable)media).play();
            }
            catch (Exception err){
                err.printStackTrace();
            }
        }
        else{
            System.out.println("No media with the name found");
        }
        return;
    }
    public static void mediaDetailsMenu(Media media) {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
        int choice = scanner.nextInt();
        scanner.nextLine().replaceAll("\\r\\n|\\r|\\n", "");
        if (choice == 0){
            showMenu();
            return;
        }
        if (choice == 1)
        {
            try{
                cart.addMedia(media);
            }
            catch (LimitExceededException e){
                e.printStackTrace();
            }
            showMenu();
            return;
        }
        if (choice == 2)
        {
            playMedia(media);
            mediaDetailsMenu(media);
            return;
        }
        return;
    }
    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter media in cart");
        System.out.println("2. Sort media in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
        int choice = scanner.nextInt();
        scanner.nextLine().replaceAll("\\r\\n|\\r|\\n", "");
        if (choice == 0){
            showMenu();
            return;
        }
        if (choice == 1){
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Filter by ID");
            System.out.println("2. Filter by title");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");
            choice = scanner.nextInt();
            scanner.nextLine().replaceAll("\\r\\n|\\r|\\n", "");
            if (choice == 0){
                cartMenu();
                return;
            }
            if (choice == 1){
                System.out.println("Enter ID: ");
                int id = scanner.nextInt();
                scanner.nextLine().replaceAll("\\r\\n|\\r|\\n", "");
                cart.print(id);
                cartMenu();
                return;
            }
            if (choice == 2){
                System.out.println("Enter title: ");
                String title = scanner.nextLine().replaceAll("\\r\\n|\\r|\\n", "");
                cart.print(title);
                cartMenu();
                return;
            }
            return;
        }
        if (choice == 2){
            System.out.println("Options: ");
            System.out.println("--------------------------------");
            System.out.println("1. Sort by title");
            System.out.println("2. Filter by cost");
            System.out.println("0. Back");
            System.out.println("--------------------------------");
            System.out.println("Please choose a number: 0-1-2");
            choice = scanner.nextInt();
            scanner.nextLine().replaceAll("\\r\\n|\\r|\\n", "");
            if (choice == 0){
                cartMenu();
                return;
            }
            if (choice == 1){
                cart.sortItemsOrderedTitleCost();
                cart.print();
                cartMenu();
                return;
            }
            if (choice == 2){
                cart.sortItemsOrderedCostTitle();
                cart.print();
                cartMenu();
                return;
            }
            return;
        }
        if (choice == 3){
            removeMediaFromCart();
            cartMenu();
            return;
        }
        if (choice == 4){
            System.out.println("Please enter a title:");
            String input = scanner.nextLine().replaceAll("\\r\\n|\\r|\\n", "");
            Media media = cart.searchMedia(input);
            if (media == null){
                System.out.println("No media with the name found");
                storeMenu();
                return;
            }
            playMedia(media);
            cartMenu();
            return;
        }
        if (choice == 5){
            System.out.println("An order has been created.");
            cart.clearCart();
            showMenu();
        }
    }
}