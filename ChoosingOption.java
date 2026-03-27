import javax.swing.JOptionPane;
public class ChoosingOption {
    public static void main(String args[]){
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?");
        //String[] buttons = {"YES", "NO"};
        //option = JOptionPane.showOptionDialog(null, "Do you want to change to the first class ticket?", "Customized buttons", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, buttons, null);
        JOptionPane.showMessageDialog(null, "You've choosen: " + (option==JOptionPane.YES_OPTION?"YES":"NO"));
        System.exit(0);
    }
}
