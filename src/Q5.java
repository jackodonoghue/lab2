import javax.swing.*;

public class Q5 {
    static double posX = 0;
    static double negX = 0;

    public static void main(String[] args) {
        doCalc();

        display();
    }

    private static void doCalc(){
        double a = 1;
        double b = 6;
        double c = -16;

        posX = (-b + (Math.sqrt(Math.pow(b, 2) - (4 * (a) * (c))))) / (2 * a);
        negX = (-b - (Math.sqrt(Math.pow(b, 2) - (4 * (a) * (c))))) / (2 * a);
    }

    private static void display(){
        JOptionPane.showMessageDialog(null, "x = " + posX + " or x = " + negX, "Roots of X2 + 6X - 16", JOptionPane.INFORMATION_MESSAGE);
    }
}
