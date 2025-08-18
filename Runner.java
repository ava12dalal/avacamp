import javax.swing.JFrame;

public class Runner extends JFrame {

    public static JFrame frame;

    public static void main(String[] args) {
        int size = 400;
        frame = new JFrame();
        frame.setTitle("Avas game");
        frame.setSize(size, size);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new ContentPane(size));
        frame.setVisible(true);
    }
}
