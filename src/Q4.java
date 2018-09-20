import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Q4 {
    static String name;

    public static void main(String[] args) {
        getName();

        int noChars = getChars();

        char initial = getInitial();

        String caps = allCaps();

        String surname = getSurname();

        showResults(noChars, initial, caps, surname);
    }

    private static void getName(){
         name = JOptionPane.showInputDialog("Please enter your full name");
    }

    private static int getChars(){
        int noChars = 0;

        for(int i = 0; i <name.length(); i++)
        {
            if(name.charAt(i) != ' ')
                noChars++;
        }

        return noChars;
    }

    private static char getInitial(){
        return name.charAt(0);
    }

    private static String allCaps(){
        return name.toUpperCase();
    }

    private static String getSurname(){

        return  name.substring(name.lastIndexOf(" "),name.length()-1);
    }

    static private void showResults(int n, char i, String c, String s){
        String output = "Number of characters in name: " + n + "\nInitial of first name: "  + i + "\nName in uppercase: " +
                c + "\nThe surname: " + s;

        JOptionPane.showMessageDialog(null, output, "Deatails for " + name, JOptionPane.INFORMATION_MESSAGE);
    }
}
