import java.util.Scanner;

public class PrintPattern1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Size:");
        int size = in.nextInt();

        System.out.println();

        for (int row = 1; row<= size; row++) {

            for (int col = 1; col<= row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

}
