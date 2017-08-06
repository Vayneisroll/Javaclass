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
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Bastian Tenbergen (bastian.tenbergen@oswego.edu)
 */
public class ActionListinerExample implements ActionListener {

    JButton button, button1;
    JTextField textfield;
    
    public ActionListinerExample() {
       JFrame frame = new JFrame("Hey there!");
       
       JPanel container = new JPanel();
       container.setLayout(new FlowLayout());
       
       button = new JButton("Press me!");
       button.addActionListener(this);
       
       button1 = new JButton("This is the second button");
       button1.addActionListener(this);
       
       textfield = new JTextField("Come on... do it!");
       textfield.setSize(150, 25);
       
       
       container.add(textfield);
       container.add(button1);
       container.add(button);
       
       frame.add(container);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.pack();
       frame.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button was pressed");
        if (e.getSource().equals(button)) {
            textfield.setText("Button pressed");
        }
        if (e.getSource().equals(textfield)) {
            button1.setText("May the forth be with you!");
        }
    }
    
    
    public static void main(String[] args) {
        new ActionListinerExample();
    }
}
