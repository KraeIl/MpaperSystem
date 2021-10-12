package assets.content.UIclasses;

import javax.swing.*;

public class myWindow extends JFrame{

    public myWindow(){
        super("Mpaper");
        
        setUndecorated(true);

        //JFrame configurations
        setSize(800, 600);
        setResizable(false);
        setFocusable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setFocusable(true);
        requestFocusInWindow();
        setName("Mpaper");

        //DragListener
        FrameDragListener frameDragListener = new FrameDragListener(this);
        this.addMouseListener(frameDragListener);
        this.addMouseMotionListener(frameDragListener);

        //HomePage
        Homepage homePage = new Homepage(this);
        add(homePage);
    }
}