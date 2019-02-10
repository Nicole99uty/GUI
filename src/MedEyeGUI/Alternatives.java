package MedEyeGUI;

import javax.swing.*;

public class Alternatives {
    private JPanel Alternatives;
    private JList list1;

    public Alternatives(){
        JFrame frame = new JFrame("Alternatives");
        frame.setContentPane(Alternatives);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
