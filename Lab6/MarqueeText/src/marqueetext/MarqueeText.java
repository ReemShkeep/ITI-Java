
package marqueetext;

import javax.swing.JFrame;

public class MarqueeText {
    
    public static void main(String[] args) {
        
        JFrame jf = new JFrame();
        jf.setTitle("Marquee Names");
        MarqueeName mar1 = new MarqueeName();
        jf.setContentPane(mar1);
        jf.setSize(400, 400);
        jf.setVisible(true);
    }
}