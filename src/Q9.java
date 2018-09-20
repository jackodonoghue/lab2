import javax.swing.*;

public class Q9 {
    static double[] weights = new double[10];
    static String output = "";
    static int under250 = 0;
    static int over400 = 0;
    static double lightest = 100000;
    static int total = 0;
    static double average =0;

    public static void main(String[] args) {
        readWeights();
        cowsUnder250();
        displayResults();
    }

    private static void readWeights(){
        String weightsString;

        for(int i = 0; i < 10; i++)
        {
            weightsString = JOptionPane.showInputDialog("Please enter the weight of cow " + (i + 1));

            if(i == 9)
                output += weightsString;
            else
                output += weightsString + ", ";

            weights[i] = Double.parseDouble(weightsString);
        }
    }

    private static void cowsUnder250(){
        for(int i =0; i < 10; i++)
        {
            if(weights[i] < 250)
                under250++;

            if(weights[i] >= 400)
                over400++;

            if(weights[i] < lightest)
                lightest = weights[i];

            total += weights[i];
        }

        average = total / 10;
    }

    private static void displayResults(){
        JOptionPane.showMessageDialog(null, output + "\nUnder 250kg: " + under250 +
                "\nOver 400kg: " + over400 + "\nLightest: " + lightest + "\nAverage weight: " +  String.format("%.2f",average),
                "Cow Stats", JOptionPane.INFORMATION_MESSAGE);
    }
}
