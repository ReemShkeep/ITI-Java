package marqueetext;


import java.awt.Color;
import java.awt.Graphics;
import java.util.Date;
import javax.swing.JPanel;

public class MarqueeName extends JPanel implements Runnable {
    public int x = 0;
    
    public MarqueeName() {
       this.setBackground(Color.WHITE);
       Thread th = new Thread(this);
       th.start();
       x=220;
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if(x>=this.getWidth())
        {
            x=0;
        }
        g.drawString("Mohamed_Kamal", x, 50);
    }
    @Override
    public void run(){
        while(true){
            try {
                this.repaint();
                Thread.sleep(300);
                x+=10;
            }   catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}