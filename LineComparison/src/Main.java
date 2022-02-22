import java.util.Scanner;

    /*
    program to calculate length of line
     */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program\n ");
        // getting input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter values for line");
        // calling method
        int length_1 = lineLength(scanner);
        System.out.println("Line length : " + length_1);
    }

    // method to calculate length of line
    // init x1, y1, x2, y2
    public static int lineLength(Scanner sc) {
        int x1,x2,y1,y2;
        System.out.println("Enter x1 and y1 values : ");
        x1 = sc.nextInt();
        y1 = sc.nextInt();

        System.out.println("Enter x2 and y2 values : ");
        x2 = sc.nextInt();
        y2 = sc.nextInt();
    // calculating line length
        int result_1 = (int) Math.pow((x2-x1), 2);
        int result_2 = (int) Math.pow((y2-y1), 2);
        int length = (int) Math.sqrt(result_1 + result_2);

        return length;
    }
}
