package com.charvai;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

class solve extends JFrame implements ActionListener {

    // frame
    static JFrame f;

    // main class
    public static void main(String[] args)
    {
        // create a new frame
        f = new JFrame("About Me");

        // create a object
       solve s = new solve();

        // create a panel
        JPanel p = new JPanel();
        p.setBackground(Color.red);

        JButton b = new JButton("ABOUT");

        // add actionlistener to button
        b.addActionListener(s);

        // add button to panel
        p.add(b);

        f.add(p);


        // set the size of frame
        f.setSize(500, 500);

        f.show();
    }
    public void actionPerformed(ActionEvent e){
         Desktop char1 = Desktop.getDesktop();
        try {
            char1.browse(new URI("http://www.charvai.co.in"));
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (URISyntaxException ex) {
            ex.printStackTrace();
        }
    }
}

