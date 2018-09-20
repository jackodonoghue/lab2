import java.util.Scanner;

public class Q3 {
    static float len = 0;
    static float br = 0;
    static String output = "Quotation for ";

    public static void main(String[] args) {
        getDetails();
    }

    private static void getDetails(){
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        output += in.nextLine();
    }
}
