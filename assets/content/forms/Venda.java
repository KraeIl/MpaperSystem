package assets.content.forms;

import javax.swing.*;
import assets.content.UIclasses.*;

public class Venda extends JFrame{
    public Venda(){
        //FrameConfigs
        setUndecorated(true);
        setTitle("Venda");
        setBounds(400, 200, 300, 450);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setFocusable(true);
        requestFocusInWindow();

        //DragListener
        FrameDragListener frameDragListener = new FrameDragListener(this);
        this.addMouseListener(frameDragListener);
        this.addMouseMotionListener(frameDragListener);

        JPanel content = new JPanel();
        content.setSize(getWidth(), getHeight());
        content.setLayout(null);
        content.setVisible(true);
        add(content);

            //Header
            Header h = new Header("Venda", getWidth(), this);
            h.width = getWidth();
            h.setBounds(0, h.y, h.width, h.height);
            content.add(h);


    }
}