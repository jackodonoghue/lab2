import java.util.Scanner;

public class Q8 {
    static int[] numbers = new int[10];

    public static void main(String[] args) {
        getNumbers();
        displayNumbers();
    }

    private static void getNumbers(){
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 10; i++)
        {
            System.out.print("please enter an integer: ");
            numbers[i] = in.nextInt();
        }
    }

    private static void displayNumbers(){
        System.out.println("\nThe first number of the array is " + numbers[0] + "\n\nThe fifth number in the array is: "
                        + numbers[4]);

    }
}
