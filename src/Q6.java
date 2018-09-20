import javax.swing.*;

public class Q6 {

    static String output = "Number      Cube\n------     ----";
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++)
        {
            output += "\n" + i + "          " + cube(i);
        }

        displayOutput();
    }

    private static double cube( int i){
        return i * i * i;
    }

    private static void displayOutput(){
        JOptionPane.showMessageDialog(null, output, "Cube", JOptionPane.INFORMATION_MESSAGE);
    }
}
