package assets.content.UIclasses;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Homepage extends JPanel implements ActionListener{
    
    public Color color;
    Timer tm = new Timer(1000/60, this);
    private Caixa c;
    private LanHouse l;
    public Header h;
    public Menu m; 

    public Homepage(JFrame window){

        setSize(800, 600);
        setLayout(null);
        setVisible(true);
        //setFocusable(true);
        //requestFocusInWindow();

        //Menu
        m = new Menu(this);
        m.height = getHeight();
        m.setBounds(m.x, m.y, m.width, m.height);
        add(m);

        //Header
        h = new Header("Página Inicial", (getWidth() - 200), window);
        h.width = getWidth();
        h.setBounds(h.x, h.y, h.width, h.height);
        add(h);

        tm.start();

    }
    
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    public boolean CreateCaixa(){
        
        boolean CaixaCreated = true;
        c = new Caixa();
        c.height = getHeight();
        c.width = getWidth();
        c.setBounds(c.x, c.y, c.width, c.height);
        add(c);
        return CaixaCreated;
    }
    public boolean deleteCaixa(){
        
        boolean CaixaCreated = false;
        remove(c);
        return CaixaCreated;
    }

    public boolean CreateLan(){
        
        boolean LanCreated = true;
        l = new LanHouse();
        l.height = getHeight();
        l.width = getWidth();
        l.setBounds(l.x, l.y, l.width, l.height);
        add(l);
        return LanCreated;
    }
    public boolean deleteLan(){
        
        boolean LanCreated = false;
        remove(l);
        return LanCreated;
    }
}