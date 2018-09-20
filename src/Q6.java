import javax.swing.*;

public class Q6 {

    static String output = "Number      Cube\n------     ----";
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++)
        {
            double cubed = MyMethods.cube(i);

            output += "\n" + i + "          " + cubed;
        }

        displayOutput();
    }

    private static void displayOutput(){
        JOptionPane.showMessageDialog(null, output, "Cube", JOptionPane.INFORMATION_MESSAGE);
    }
}
