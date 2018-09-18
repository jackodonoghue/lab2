import javax.swing.*;

public class Q2 {
    public static void main(String[] args) {
        int inch =0;

        String output = "Yards     Inches\n-----     ------";

        JTextArea textArea = new JTextArea(20,20);

        for(int i = 1; i <= 10;i++)
        {
            inch = i * 36;

            output += "\n" + i + "     " + inch;
        }

        textArea.setText(output);

        JOptionPane.showMessageDialog(null, textArea, "Feet to Inches", JOptionPane.INFORMATION_MESSAGE);
    }
}
