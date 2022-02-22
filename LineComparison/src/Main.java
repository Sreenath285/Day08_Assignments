import java.util.Scanner;

    /*
    program to calculate length of line
     */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program\n ");
        // getting input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter values for line 1");
        int length_1 = lineLength(scanner);
        System.out.println("Please enter values for line 2");
        int length_2 = lineLength(scanner);

        System.out.println("Line 1 length : " + length_1);
        System.out.println("Line 2 length : " + length_2);

        // converting int to string
        String str_1 = String.valueOf(length_1);
        String str_2 = String.valueOf(length_2);

        // comparing lengths with compareTo method
        int compareStr = str_1.compareTo(str_2);
        if (compareStr == 0) {
            System.out.println("Both lines are equal");
        }
        else if (compareStr < 0) {
            System.out.println("Length of line 1 is less than Line 2");
        }
        else {
            System.out.println("Length of line 1 is greater than Line 2");
        }
        scanner.close();
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
