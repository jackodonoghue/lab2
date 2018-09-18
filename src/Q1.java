

import javax.swing.*;

import javax.swing.JOptionPane;

public class Q1 {
    static float amountEuro = 0;

    public static void main(String[] args) {
        float rate = getRate();
        float convert = -1;
        String output = "";

            do {
                convert = exchange(rate);

                if (convert != 0)
                    output += String.format("€%.2f", amountEuro) + "        " + String.format("£%.2f", convert) + "\n\n";
            } while (convert != 0);

         JOptionPane.showMessageDialog(null, output, String.format("%.2f",rate), JOptionPane.INFORMATION_MESSAGE);
    }

    private static float getRate()
    {
        String rateString = JOptionPane.showInputDialog("Please enter the exchange rate: ");

        return Float.parseFloat(rateString);
    }

    private static float exchange(float r)
    {
        String euroString = JOptionPane.showInputDialog("Please enter the amount you want to exchange: ");
        amountEuro = Float.parseFloat(euroString);

        return (amountEuro * r);
    }
}
