import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLay extends JFrame{

    public GridLay() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(3, 3));

        add(new JButton("One"));
        add(new JButton("Two"));
        add(new JButton("Three"));
        add(new JButton("Four"));
        add(new JButton("Five"));

        pack();
        setVisible(true);
    }

    public static void main(String args[]) {

        new GridLay();
    }
}
