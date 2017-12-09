import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;


public class Main extends JFrame {
    public static void main(String[] args) {
        new Main();
    }
    public Main() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JTextField [] textarray = new JTextField[4];
        for(int i=0; i<textarray.length; i++) {
            textarray[i] = new JTextField(10);
            panel.add(textarray[i]);
        }
        setSize(300,300);
        setTitle("Field Loop");
        setLocation(200,200);
	setResizable(true);
        add(panel);
        setVisible(true);
    }

}
