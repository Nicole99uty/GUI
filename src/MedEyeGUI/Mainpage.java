package MedEyeGUI;

import com.sun.org.apache.bcel.internal.generic.NEW;
import sun.applet.Main;
import sun.security.pkcs11.wrapper.Functions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mainpage {
    private JPanel Mainpage;
    private JButton alternativesButton;
    private JButton ingredientsButton;
    private JButton functionsSideEffectsButton;
    private JLabel Cost;

    public Mainpage() {

        functionsSideEffectsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            new SideEffects();

            }
        });
        ingredientsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            new Ingredients("hello");
            }
        });
        alternativesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Alternatives();
            }
        });
    }
    public static void main(String[] args){

        JFrame frame = new JFrame("Mainpage");
        frame.setContentPane(new Mainpage().Mainpage);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }






}
