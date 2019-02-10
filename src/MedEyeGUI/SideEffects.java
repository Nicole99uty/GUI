package MedEyeGUI;

import javax.swing.*;

public class SideEffects {
    private JPanel SideEffects;
    private JTextArea textArea1;
    private JTextArea textArea2;


    public SideEffects(){
        JFrame frame = new JFrame("SideEffects");
        frame.setContentPane(SideEffects);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);}
}
