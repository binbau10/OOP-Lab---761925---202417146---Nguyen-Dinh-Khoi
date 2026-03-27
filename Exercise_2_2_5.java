import javax.swing.JOptionPane;
public class Exercise_2_2_5 {
  public static void main(String[] args) {
    double x;
    double y;
    x = Double.parseDouble(JOptionPane.showInputDialog("Input variable x: "));
    y = Double.parseDouble(JOptionPane.showInputDialog("Input variable y: "));
    JOptionPane.showMessageDialog(null, "x + y = " + (x + y));
    JOptionPane.showMessageDialog(null, "x - y = " + (x - y));
    JOptionPane.showMessageDialog(null, "x * y = " + (x * y));
    if (y != 0)
    {
        JOptionPane.showMessageDialog(null, "x / y = " + (x / y));
    }
    else
    {
        JOptionPane.showMessageDialog(null, "Cannot divide by zero");
    }
  }
}