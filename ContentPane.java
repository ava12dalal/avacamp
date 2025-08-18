import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class ContentPane extends JPanel {
    private int size;

    public ContentPane(int size) {
        super(null, true);
        this.size = size;
    }

    protected void paintComponent(Graphics g) {
        this.repaint();
        g.setColor(Color.PINK);
        g.fillRect(0, 0, this.size, this.size);
    }
}
