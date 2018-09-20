import javax.swing.*;

public class Q7 {
    public static void main(String[] args) {
        String numString = JOptionPane.showInputDialog("Please enter a number: ");
        boolean even;
        if(!numString.equals("-1")){
            while (!numString.equals("-1")) {
                if (isEven(numString)) {
                    JOptionPane.showMessageDialog(null, numString + " is even.");
                } else {
                    JOptionPane.showMessageDialog(null, numString + " is odd.");
                }

                numString = JOptionPane.showInputDialog("Please enter a number: ");
            }
        }

        else{
            JOptionPane.showMessageDialog(null, "Thanks for using the system.");
            System.exit(0);
        }
    }

    private static boolean isEven(String n){
        int num = Integer.parseInt(n);

        if(num % 2 == 0)
            return true;
        else
            return false;
    }
}
