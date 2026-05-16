package AimsProject.src.hust.soict.globalict.aims.screen.manager;

import AimsProject.src.hust.soict.globalict.aims.media.CompactDisc;
import AimsProject.src.hust.soict.globalict.aims.store.Store;

import javax.swing.*;
import java.awt.*;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen {

    public AddCompactDiscToStoreScreen(Store store) {
        super(store);

        setVisible(true);
    }

    protected JPanel createCenter(){
        JPanel center = new JPanel();
        center.setLayout(new GridLayout(4,2));

        JTextField titleField = new JTextField();
        JTextField categoryField = new JTextField();
        JTextField costField = new JTextField();

        JButton addButton = new JButton("Add CD");

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

            CompactDisc cd = new CompactDisc(title, category, cost);

            store.addMedia(cd);

            JOptionPane.showMessageDialog(null,
                    "CD added successfully");
        });

        return center;
    };
}