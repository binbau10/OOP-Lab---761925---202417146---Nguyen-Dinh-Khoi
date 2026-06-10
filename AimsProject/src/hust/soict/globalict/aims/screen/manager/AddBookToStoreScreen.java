package AimsProject.src.hust.soict.globalict.aims.screen.manager;

import AimsProject.src.hust.soict.globalict.aims.media.Book;
import AimsProject.src.hust.soict.globalict.aims.store.Store;

import javax.swing.*;
import java.awt.*;

public class AddBookToStoreScreen extends AddItemToStoreScreen {

    public AddBookToStoreScreen(Store store) {
        super(store);

        setVisible(true);
    }

    protected JPanel createCenter(){
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(4,2));

        JTextField titleField = new JTextField();
        JTextField categoryField = new JTextField();
        JTextField costField = new JTextField();

        JButton addButton = new JButton("Add Book");

        center.add(new JLabel("Title"));
        center.add(titleField);

        center.add(new JLabel("Category"));
        center.add(categoryField);

        center.add(new JLabel("Cost"));
        center.add(costField);

        center.add(addButton);

        addButton.addActionListener(e -> {
            String title = titleField.getText();
            String category = categoryField.getText();
            float cost = Float.parseFloat(costField.getText());
            try{
                Book book = new Book(title, category, cost);

                store.addMedia(book);
    
                JOptionPane.showMessageDialog(null,
                        "Book added successfully");
            }
            catch(Exception err){
                err.printStackTrace();
            }

        });

        return center;
    };
}