/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unit22;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Bastian Tenbergen (bastian.tenbergen@oswego.edu)
 */
public class LayoutExample {

    
    public LayoutExample() {
       JFrame frame = new JFrame("Hey there!");
       
       JPanel container = new JPanel();
       container.setLayout(new FlowLayout());
       
       JButton button = new JButton("Press me!");
       JButton button1 = new JButton("This is the second button");
       JTextField textfield = new JTextField("Come on... do it!");
       textfield.setSize(150, 25);
       
       
       container.add(textfield);
       container.add(button1);
       container.add(button);
       
       frame.add(container);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.pack();
       frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new LayoutExample();
    }
}
