/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit22;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * Adapted from: https://en.wikipedia.org/wiki/Swing_%28Java%29#A_basic_example
 */
public class SwingExample implements ActionListener {

    private JFrame jf;
    private JButton b;
    private JButton b2;
    private JButton b3;
    private JLabel l;
    private int pressed;

    public SwingExample() {
        jf = new JFrame("Press the Button");
        b = new JButton("Increment");
        b2 = new JButton("Decrement");
        b3 = new JButton("something");
        l = new JLabel("Clicked");
        pressed = 0;

        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout());
        jf.add(b);
        jf.add(b2);
        jf.add(b3);
        jf.add(l);

        b.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        

        jf.pack();
        jf.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(b)) {
            pressed++;
            l.setText("The button was clicked " + pressed + " times.");
            jf.pack();
        }
        else if (e.getSource().equals(b2)) {
            pressed--;
            l.setText("The button was clicked " + pressed + " times.");
            jf.pack();
        } else {
            System.out.println("something else happened.");
            new JFrame("Something").setVisible(true);
        }
    }

    public static void main(String[] args) {
        SwingExample se = new SwingExample();
    }

}
