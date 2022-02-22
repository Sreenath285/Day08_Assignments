import java.util.Scanner;

    /*
    program to calculate length of line
     */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program\n ");

        LineComparison line1 = new LineComparison("Line_1", 1, 1, 2, 2);
        LineComparison line2 = new LineComparison("Line_2", 2, 4, 5, 6);
        int length_1 = line1.lineLength();
        int length_2 = line2.lineLength();

        // converting int to string
        String str_1 = String.valueOf(length_1);
        String str_2 = String.valueOf(length_2);

        // comparing lengths with equals method
        if(str_1.equals(str_2)){
            System.out.println("Both lines are equal");
        }
        else {
            System.out.println("Both lines are not equal");
        }

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

    }

}
