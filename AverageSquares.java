import java.util.Scanner;

public class AverageSquares {
    public static void main(String[] args) {

        // Declare Scanner object
        Scanner in = new Scanner(System.in);

        System.out.print("Please enter the start value: ");
        int startNum = in.nextInt();
        in.nextLine(); // Clear the buffer
        
        System.out.print("Please enter the end value: ");
        int endNum = in.nextInt();

        System.out.println("Sum of squares from " + startNum + " to " + endNum + ":");

        double sum = 0;
        int count = 0;
        int i = startNum;

        do { 
            sum += i * i ;
            count++;
            i++;
        } while (i <= endNum);

        double average = sum / count;
        System.out.println(average);
    }
}