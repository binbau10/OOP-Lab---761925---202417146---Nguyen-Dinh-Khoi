package AimsProject.src.hust.soict.globalict.test.screen.customer.store;

import AimsProject.src.hust.soict.globalict.aims.cart.Cart;
import AimsProject.src.hust.soict.globalict.aims.media.Book;
import AimsProject.src.hust.soict.globalict.aims.media.DigitalVideoDisc;
import AimsProject.src.hust.soict.globalict.aims.screen.customer.controller.ViewStoreController;
import AimsProject.src.hust.soict.globalict.aims.store.Store;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TestViewStoreScreen extends Application{
    private static Store store;
    private static Cart cart;
    @Override
    public void start (Stage primaryStage) throws Exception{
        final String STORE_FXML_FILE_PATH = "/AimsProject/src/hust/soict/globalict/aims/screen/customer/view/Store.fxml";
        FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource(STORE_FXML_FILE_PATH));
        ViewStoreController viewStoreController = new ViewStoreController(store, cart);
        fxmlloader.setController(viewStoreController);
        Parent root = fxmlloader.load();

        primaryStage.setTitle("Store");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args){
        store = new Store();
        try{
            store.addMedia(new Book("Book1", "Category1", 8.0f));
            store.addMedia(new DigitalVideoDisc("DVD2", "Category2", "Director2", 10, 4.4f));
            store.addMedia(new Book("Book3", "Category3", 11.2f));
            store.addMedia(new DigitalVideoDisc("DVD4", "Category4", "Director4", 30, 21.7f));
        }
        catch (Exception err){
            err.printStackTrace();
        }
        cart = new Cart();
        launch(args);
    }
}
