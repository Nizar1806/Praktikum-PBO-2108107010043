import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLay extends JFrame{
    
    public FlowLay() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 100);

        setLayout(new FlowLayout());
        add(new JButton("One"));
        add(new JButton("Two"));
        add(new JButton("Three"));
        add(new JButton("Four"));
        add(new JButton("Five"));

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        
        new FlowLay();
    }
}
