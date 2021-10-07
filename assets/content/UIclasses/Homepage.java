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

    public Homepage(){

        setSize(800, 600);
        setLayout(null);
        setVisible(true);

        //Menu
        m = new Menu(this);
        m.height = getHeight();
        m.setBounds(m.x, m.y, m.width, m.height);
        add(m);

        // //Mpaper Label
        // JLabel t = new JLabel("Mister Paper");
        // t.setForeground(Color.BLACK);
        // t.setFont(new Font("arial", Font.BOLD, 20));
        // t.setBorder(null);
        // t.setBounds(400, 5, 170, 20);
        // add(t);

        //Header
        h = new Header();
        h.width = getWidth();
        h.setBounds(h.x, h.y, h.width, h.height);
        add(h);

        tm.start();
    }
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    public boolean CreateCaixa(){
        System.out.print("Estou executando createCaixa \n");
        boolean CaixaCreated = true;
        c = new Caixa();
        c.height = getHeight();
        c.width = getWidth();
        c.setBounds(c.x, c.y, c.width, c.height);
        add(c);
        return CaixaCreated;
    }
    public boolean deleteCaixa(){
        System.out.print("Estou executando deleteCaixa \n");
        boolean CaixaCreated = false;
        remove(c);
        return CaixaCreated;
    }

    public boolean CreateLan(){
        System.out.print("Estou executando createLan \n");
        boolean LanCreated = true;
        l = new LanHouse();
        l.height = getHeight();
        l.width = getWidth();
        l.setBounds(c.x, c.y, c.width, c.height);
        add(l);
        return LanCreated;
    }
    public boolean deleteLan(){
        System.out.print("Estou executando deleteLan \n");
        boolean LanCreated = false;
        remove(l);
        return LanCreated;
    }
}