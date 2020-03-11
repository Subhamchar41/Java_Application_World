package com.charvai;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class JApps extends JFrame {

    public JPanel contentPane;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JApps frame = new JApps();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }


    public JApps() {
        setTitle("Java Application World");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(0,0,99999990,99999990);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(204, 255, 204));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        JButton Button1 = new JButton("WORD COUNTER");
        contentPane.add(Button1);
        Button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CharCount.main(new String[]{});
            }
        });
         Button1.setIcon(new ImageIcon(JApps.class.getResource("wct.jpg")));


        JButton Button2 = new JButton("CALCULATOR");
        contentPane.add(Button2);
        Button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                MyCalculator.main(new String[]{});

            }
        });
         Button2.setIcon(new ImageIcon(JApps.class.getResource("calculator.jpg")));
        JButton Button3 = new JButton("TIC TAC TOI");
        contentPane.add(Button3);
        Button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                TicTacToe.main(new String[]{});
            }
        });

         Button3.setIcon(new ImageIcon(JApps.class.getResource("tictactoe.jpg")));

        JButton Button4 = new JButton("NOTEPAD");
        contentPane.add(Button4);
        Button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg) {
                Notepad.main(new String[]{});

            }
        });


        Button4.setIcon(new ImageIcon(JApps.class.getResource("notepad.jpg")));


        JButton Button5 = new JButton("EXAM PRACTICE");
        contentPane.add(Button5);
        Button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg) {
                OnlineTest.main(new String[]{});

            }
        });
       Button5.setIcon(new ImageIcon(JApps.class.getResource("exam1.jpg")));

        JButton Button6 = new JButton("AGE CALCULATOR");
        contentPane.add(Button6);
        Button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg) {
                AgeCalculator.main(new String[]{});

            }
        });


        Button6.setIcon(new ImageIcon(JApps.class.getResource("age.jpg")));

        JButton Button7 = new JButton("CALENDER");
        contentPane.add(Button7);
        Button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg) {
                CalendarProgram.main(new String[]{});

            }
        });


        Button7.setIcon(new ImageIcon(JApps.class.getResource("calender.png")));


        JButton Button8 = new JButton("SOCIAL MEDIA");
        contentPane.add(Button8);
        Button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg) {
                google.main(new String[]{});

            }
        });

        Button8.setIcon(new ImageIcon(JApps.class.getResource("google.jpg")));

        JButton Button9 = new JButton("ABOUT");
        contentPane.add(Button9);
        Button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg) {
                solve.main(new String[]{});

            }
        });


        Button9.setIcon(new ImageIcon(JApps.class.getResource("about.jpg")));
    }
    }
