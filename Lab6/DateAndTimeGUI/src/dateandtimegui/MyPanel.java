package dateandtimegui;

import java.awt.Color;
import java.awt.Graphics;
import java.lang.System.Logger.Level;
import java.util.Date;
import javax.swing.JPanel;
import java.util.logging.Logger;

public class MyPanel extends JPanel implements Runnable {

    public MyPanel() {
        this.setBackground(Color.CYAN);
        Thread th = new Thread(this);
        th.start();
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString(new Date().toLocaleString(), 100, 50);
    }

    @Override
    public void run()
    {
        while (true) 
        {
            try 
            {
                this.repaint();
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
