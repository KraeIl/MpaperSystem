package assets.content.UIclasses;

import javax.swing.*;

public class myWindow extends JFrame{

    public myWindow(){
        super("Mpaper");
        
        setUndecorated(true);

        //JFrame configurations
        setSize(1360, 768);
        setResizable(false);
        setFocusable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //DragListener
        FrameDragListener frameDragListener = new FrameDragListener(this);
        this.addMouseListener(frameDragListener);
        this.addMouseMotionListener(frameDragListener);

        //HomePage
        Homepage homePage = new Homepage();
        add(homePage);
    }
}