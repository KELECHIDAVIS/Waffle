import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public abstract class GamePanel extends JPanel implements Runnable, KeyListener, MouseListener, MouseMotionListener
{
    private Thread gameThread ;

    public GamePanel()
    {
        this.addKeyListener(this);
        this.addMouseListener(this);
        this.setFocusable(true);
        gameThread = new Thread(this);

    }





    public abstract void update();
    public abstract void paint(Graphics g);

    public void start()
    { gameThread.start();}









    @Override
    public abstract void keyTyped(KeyEvent e) ;

    @Override
    public abstract void keyPressed(KeyEvent e) ;

    @Override
    public abstract void keyReleased(KeyEvent e) ;

    @Override
    public void run()
    {
        // happens when the thread starts
        // where the loop will go
        while (true)
        {
            update();
            repaint();
        }

    }

    @Override
    public abstract void mouseClicked(MouseEvent e) ;

    @Override
    public abstract void mousePressed(MouseEvent e) ;

    @Override
    public  abstract void mouseReleased(MouseEvent e) ;

    @Override
    public abstract void mouseEntered(MouseEvent e) ;

    @Override
    public abstract void mouseExited(MouseEvent e) ;

    @Override
    public abstract void mouseDragged(MouseEvent e) ;

    @Override
    public abstract void mouseMoved(MouseEvent e) ;
}
