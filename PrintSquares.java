import java.util.Scanner; // We use the Scanner class from java.util to handle user input

public class PrintSquares {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        // Prompt for input
        System.out.print("Enter a number: ");
        int startNum = in.nextInt();
        in.nextLine();

        System.out.print("Enter another number: ");
        int endNum = in.nextInt();
        
        System.out.print(" Sequence of squares from " + startNum + " to " + endNum + ':');

        for (int i = startNum; i <= endNum; i++) {
            System.out.print(i * i + ' ');
        }
        System.out.println();
    }
}