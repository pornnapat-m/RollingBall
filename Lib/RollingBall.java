package Lib;
import java.awt.*;
import javax.swing.*;

public class RollingBall extends JFrame {

    public RollingBall(){
        getContentPane().setLayout(new BorderLayout());
        Draw1 a = new Draw1();
        a.setPreferredSize(new Dimension(300,300));
        getContentPane().add(a,BorderLayout.CENTER);
        pack();
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    

    class Draw1 extends JPanel {
    @Override
    protected void paintComponent(Graphics g) { 
        int w = getWidth();
        int h= getHeight();
        int r = 80;
        g.setColor(Color.BLACK);
        g.fillArc(w/2-r, h/2-r, r*2, r*2,0,180);
        g.setColor(Color.BLACK);
        g.drawOval(w/2-r, h/2-r, r*2, r*2);
        

    }
}
    
}
