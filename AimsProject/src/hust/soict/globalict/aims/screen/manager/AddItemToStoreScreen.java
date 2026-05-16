package AimsProject.src.hust.soict.globalict.aims.screen.manager;

import AimsProject.src.hust.soict.globalict.aims.store.Store;

import javax.swing.*;
import java.awt.*;

public abstract class AddItemToStoreScreen extends JFrame {
    protected Store store;
    private Container cp;

    public AddItemToStoreScreen(Store store) {
        this.store = store;

        cp = getContentPane();
        cp.setLayout(new BorderLayout());

        cp.add(createNorth(), BorderLayout.NORTH);
        cp.add(createCenter(), BorderLayout.CENTER);
        setSize(1024, 768);
        setVisible(true);
    }

    JPanel createNorth() {
        JPanel north = new JPanel();
        north.setLayout(new BoxLayout(north, BoxLayout.Y_AXIS));

        north.add(createMenuBar());

        return north;
    }

    JMenuBar createMenuBar() {
        JMenu menu = new JMenu("Options");

        JMenuItem viewStoreItem = new JMenuItem("View store");

        viewStoreItem.addActionListener(e -> {
            new StoreManagerScreen(store);
            dispose();
        });

        menu.add(viewStoreItem);

        JMenu smUpdateStore = new JMenu("Update Store");

        JMenuItem addBookItem = new JMenuItem("Add Book");
        JMenuItem addCDItem = new JMenuItem("Add CD");
        JMenuItem addDVDItem = new JMenuItem("Add DVD");

        addBookItem.addActionListener(e -> {
            new AddBookToStoreScreen(store);
            dispose();
        });

        addCDItem.addActionListener(e -> {
            new AddCompactDiscToStoreScreen(store);
            dispose();
        });

        addDVDItem.addActionListener(e -> {
            new AddDigitalVideoDiscToStoreScreen(store);
            dispose();
        });

        smUpdateStore.add(addBookItem);
        smUpdateStore.add(addCDItem);
        smUpdateStore.add(addDVDItem);

        menu.add(smUpdateStore);

        JMenuBar menuBar = new JMenuBar();
        menuBar.setLayout(new FlowLayout(FlowLayout.LEFT));
        menuBar.add(menu);

        return menuBar;
    }

    protected abstract JPanel createCenter();
}