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
public class SwingExampleWithComments implements ActionListener {

    // never mind what "implements" means for now...

    private JFrame f;
    private JLabel label;
    private JButton button;
    private int pressed = 0;

    public SwingExampleWithComments() {
        this.f = new JFrame("Hello World!");
        this.label = new JLabel("Hello!");
        this.button = new JButton("Press me!");
        this.create();
    }

    private void create() {
        // Sets the behavior for when the window is closed
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Add a layout manager so that the button is not placed on top of the label
        f.setLayout(new FlowLayout());
        // Add a label and a button
        f.add(label);
        f.add(button);

        //add the actionlistener for the button!
        button.addActionListener(this);

        // Arrange the components inside the window
        f.pack();
        // By default, the window is not visible. Make it visible.
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        //look what the source of the event was...
        if (e.getSource().equals(button)) {
            pressed++; 
            this.label.setText("The button was pressed " + pressed + " times.");
        }
    }

    public static void main(String[] args) {
        SwingExampleWithComments se = new SwingExampleWithComments();
    }

}
