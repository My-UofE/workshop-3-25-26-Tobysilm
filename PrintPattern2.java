import java.util.Scanner;

public class PrintPattern2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = 0;

        while (size < 1 || size > 5) {
            System.out.print("Enter the Size:");
            size = in.nextInt();

            if (size < 1) {
             System.out.print("too small");   
            } else if (size > 5){
              System.out.print("too big");   
            }
        }

        System.out.println();

        for (int row = 1; row<= 2 * size; row++) {

            for (int col = 1; col <= 2 * size; col++){
                int fromtop = row;
                int frombottom = 2 * size - row +1;
                int fromLeft = col;
                int fromRight = 2 * size - col + 1;
                int number = Math.min(Math.min(fromtop, frombottom),
                                    Math.min(fromLeft,fromRight));
                System.out.print(number);
            }
            System.out.println();
        }
    }

}
