package Lib;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Rolling extends JFrame {

    public Rolling(){
        getContentPane().setLayout(new BorderLayout());
        Draw2 a = new Draw2();
        a.setPreferredSize(new Dimension(300,300));
        getContentPane().add(a,BorderLayout.CENTER);
        pack();
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
}

class Draw2 extends JPanel implements ActionListener{
    int r=0,dr=5;
    int start = 0, angle=2;
    int w = getWidth();

    Draw2(){
        Timer t = new Timer(200, this);
        t.start();
    }

      @Override
    protected void paintComponent(Graphics g) {
         super.paintComponent(g); 
        
        int h= getHeight();
        g.setColor(Color.BLACK);
        g.fillArc(w/4+r, 100, 100, 100,0+r,180);
        g.setColor(Color.BLACK);
        g.drawOval(w/4+r, 100, 100, 100);
        

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        r -= dr;
        if(r<-120 ) w=1500;
        repaint();
        
    }

    
}


