package assets.content.UIclasses;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Header extends JPanel{
    public int x, y, width, height;
    public JLabel t;

    public Header(){
        x = 200;
        y = 0;
        height = 50;

        setBackground(new Color(65, 120, 203));

        setVisible(true);
        setLayout(null);

        //Title
        t = new JLabel();
        t.setText("Página inicial");
        t.setForeground(Color.WHITE);
        t.setFont(new Font("arial", Font.BOLD, 30));
        t.setBorder(null);
        t.setBounds(200, 10, 200, 30);
        add(t);

        //Exit button
        Button b = new Button("X");
        
        //ButtonCustomizations
        b.setVisible(true);
        b.setForeground(new Color(22, 33, 53));
        b.setBackground(new Color(65,120,203));
        b.setFont(new Font("arial", Font.BOLD, 30));
        
        //ButtonBounds
        b.x = 1110;
        b.y = 0;
        b.width = 50;
        b.height = 50;
        b.setBounds(b.x, b.y, b.width, b.height);

        //Adding Button
        add(b);

            //Button Listener
            b.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    System.exit(0);;
                }
            });
            b.addMouseListener(new java.awt.event.MouseAdapter(){
                public void mouseEntered(java.awt.event.MouseEvent evt) {
                    b.setBackground(new Color(124, 153, 230));
                    b.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 2, new Color(216, 223, 242)));
                }
            
                public void mouseExited(java.awt.event.MouseEvent evt) {
                    b.setBackground(new Color(65,120,203));
                    b.setBorder(null);
                }
            });
    }
}
