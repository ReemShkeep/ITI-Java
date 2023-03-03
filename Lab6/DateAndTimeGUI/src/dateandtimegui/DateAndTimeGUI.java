
package dateandtimegui;

import javax.swing.JFrame;

public class DateAndTimeGUI {
    
    public static void main(String[] args) {
        
        JFrame jf = new JFrame();
        jf.setTitle("date and time");
        
        
        MyPanel p = new MyPanel();
        
        jf.setContentPane(p);
        jf.setSize(400, 400);
        jf.setVisible(true);
    }
}