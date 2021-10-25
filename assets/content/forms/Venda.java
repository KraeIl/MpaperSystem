package assets.content.forms;

import javax.swing.*;
import javax.swing.text.DefaultFormatterFactory;

import assets.content.UIclasses.*;
import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.*;
import javax.swing.text.*;

public class Venda extends JPanel implements PropertyChangeListener{
    private Double value = 0.00;
    private JFormattedTextField jtxt;
    private NumberFormat valueFormat;
    private JFrame frame;

    public Venda(){

        //FrameConfigs
        frame = new JFrame();
        
        frame.setUndecorated(true);
        frame.setTitle("Venda");
        frame.setBounds(400, 200, 300, 450);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setFocusable(true);
        frame.requestFocusInWindow();

        //DragListener
        FrameDragListener frameDragListener = new FrameDragListener(frame);
        frame.addMouseListener(frameDragListener);
        frame.addMouseMotionListener(frameDragListener);

        VendaContent();
        frame.add(this);
    }
    public void VendaContent(){
        //Content Jpanel
        this.setSize(frame.getWidth(), frame.getHeight());
        this.setLayout(null);
        this.setVisible(true);

        //Header
        Header h = new Header("Vendas", frame.getWidth(), frame);
        h.width = frame.getWidth();
        h.setBounds(0, h.y, h.width, h.height);
        this.add(h);

        //Título
        JLabel t = new JLabel();
        t.setText("Mister Paper");
        t.setForeground(new Color(22, 33, 53));
        t.setFont(new Font("arial", Font.BOLD, 40));
        t.setBounds(25, 100, 300, 80);
        this.add(t);

        //TextField
        valueFormat = NumberFormat.getCurrencyInstance();
        valueFormat.setMinimumFractionDigits(2);

        jtxt = new JFormattedTextField(new DefaultFormatterFactory(
                            new NumberFormatter(valueFormat),
                            new NumberFormatter(valueFormat),
                            new NumberFormatter(valueFormat)));
        jtxt.setValue(value);
        jtxt.setBounds(50, 200, 200, 50);
        jtxt.setColumns(10);
        jtxt.setFont(new Font("arial", Font.BOLD, 25));
        jtxt.addPropertyChangeListener("value", this);
        this.add(jtxt);

    }

    @Override
    public void propertyChange(PropertyChangeEvent e) {
    System.out.println("Estou lendo uma ação");
    

    Object source = e.getSource();
    if (source == jtxt) {
        value = ((Number)jtxt.getValue()).doubleValue();
    }

    jtxt.setValue(value);

    }
}