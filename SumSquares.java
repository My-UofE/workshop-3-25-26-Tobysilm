import java.util.Scanner;

public class SumSquares {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the start value: ");
        int startNum = in.nextInt();
        in.nextLine(); // Clear the buffer
        
        System.out.print("Please enter the end value: ");
        int endNum = in.nextInt();

        System.out.println("Sum of squares from " + startNum + " to " + endNum + ":");

        int sum = 0;
        int i = startNum;
        while (i <= endNum) {
            sum += i * i ;
            i++;
        }
        System.out.println(sum);
    }
}