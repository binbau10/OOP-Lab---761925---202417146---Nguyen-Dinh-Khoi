package AimsProject.src.hust.soict.globalict.aims.screen.manager;

import javax.swing.*;

import java.awt.*;

import AimsProject.src.hust.soict.globalict.aims.media.Media;
import AimsProject.src.hust.soict.globalict.aims.media.Playable;
public class MediaStore extends JPanel{
    private Media media;
    public MediaStore(Media media){
        this.media = media;
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        JLabel title = new JLabel(this.media.getTitle());
        title.setFont(new Font(title.getFont().getName(), Font.PLAIN, 15));
        title.setAlignmentX(CENTER_ALIGNMENT);

        JLabel cost = new JLabel("" + this.media.getCost() + " $");
        cost.setAlignmentX(CENTER_ALIGNMENT);
        
        JPanel container = new JPanel();
        container.setLayout(new FlowLayout(FlowLayout.CENTER));

        if (this.media instanceof Playable){
            JButton playButton = new JButton("Play");

            playButton.addActionListener(e -> {
                ((Playable) this.media).play();
                JOptionPane.showMessageDialog(null, "Playing: " + this.media.getTitle());
            });

            container.add(playButton);
        }

        this.add(Box.createVerticalGlue());
        this.add(title);
        this.add(cost);
        this.add(Box.createVerticalGlue());
        this.add(container);

        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
    }
}
