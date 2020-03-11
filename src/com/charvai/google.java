package com.charvai;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

class google extends JFrame implements ActionListener
{
    public static final int WIDTH = 500;
    public static final int HEIGHT = 500;

    /*************************************************
     *Creates and displays a window of the class ButtonDemo.
     *************************************************/
    public static void main(String[] args)
    {
        google buttonGui = new google();
        buttonGui.setVisible(true);
    }

    public google()
    {
        setSize(WIDTH, HEIGHT);


        setTitle("SOCIAL MEDIA");
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.blue);

        contentPane.setLayout(new FlowLayout());

        JButton Google = new JButton("GOOGLE");
        Google.addActionListener(this);
        contentPane.add(Google);

        JButton facebook = new JButton("FACEBOOK");
        facebook.addActionListener(this);
        contentPane.add(facebook);

        JButton instagram = new JButton("INSTAGRAM");
        instagram.addActionListener(this);
        contentPane.add(instagram);

        JButton tweter = new JButton("TWITTER");
        tweter.addActionListener(this);
        contentPane.add(tweter);
    }
    //It will take several subsections to fully explain this program.
//The explanation does not end until the end of the subsection
//entitled Action Listeners and Action Events
    public void actionPerformed(ActionEvent e)
    {
        Container contentPane = getContentPane();
        Desktop p=Desktop.getDesktop();
        Desktop t=Desktop.getDesktop();
        Desktop m=Desktop.getDesktop();
        Desktop s=Desktop.getDesktop();
        if (e.getActionCommand().equals("GOOGLE")) {
            try {
                p.browse(new URI("http://www.google.com"));
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (URISyntaxException ex) {
                ex.printStackTrace();
            }
        }
        else if (e.getActionCommand().equals("FACEBOOK"))
            try {
                t.browse(new URI("http://www.facebook.com"));
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (URISyntaxException ex) {
                ex.printStackTrace();
            }
        else if (e.getActionCommand().equals("INSTAGRAM"))
            try {
                m.browse(new URI("https://www.instagram.com"));
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (URISyntaxException ex) {
                ex.printStackTrace();
            }
        else if (e.getActionCommand().equals("TWITTER"))
            try {
                s.browse(new URI("http://www.twitter.com"));
            } catch (IOException ex) {
                ex.printStackTrace();
            } catch (URISyntaxException ex) {
                ex.printStackTrace();
            }
    }
}





