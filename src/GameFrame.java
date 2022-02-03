import javax.swing.*;
import java.awt.*;

public abstract class GameFrame extends JFrame
{
    public static int SCREENWIDTH ,SCREENHEIGHT;
    public GameFrame(String title, int x, int y, GamePanel panel)
    {

        super(title);
        SCREENWIDTH = x;
        SCREENHEIGHT = y;
        this.addKeyListener(panel);
        this.addMouseListener(panel);
        this.setSize(new Dimension(x,y));
        this.add(panel);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }



}
