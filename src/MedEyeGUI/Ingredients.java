package MedEyeGUI;

import javax.swing.*;

public class Ingredients {
    private JPanel Ingredients;
    private JFormattedTextField formattedTextField1;
    private JTextArea textArea1;

    public Ingredients(String s){
        JFrame frame = new JFrame("Ingredients");
        frame.setContentPane(Ingredients);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        textArea1.replaceSelection(s);
    }
}
