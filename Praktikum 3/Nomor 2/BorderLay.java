import javax.swing.JFrame; 
import javax.swing.JButton; 
import java.awt.*; 

public class BorderLay extends JFrame {
    
    public BorderLay() {
        super("Layout Tester");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jb1 = new JButton("One");
        JButton jb2 = new JButton("Two");   
        JButton jb3 = new JButton("Three");
        JButton jb4 = new JButton("Four");
        JButton jb5 = new JButton("Five");
        
        add(BorderLayout.NORTH, jb1);
        add(BorderLayout.WEST, jb2);
        add(BorderLayout.CENTER, jb3);
        add(BorderLayout.EAST, jb4);
        add(BorderLayout.SOUTH, jb5);

        pack();
        setVisible(true);
    }

    public static void main (String[] args) {
        
        new BorderLay();
    }
}
