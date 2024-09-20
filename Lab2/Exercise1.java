package Lab2;
import java.util.*; // import scanner

public class Exercise1{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in); // Scanner for user input

        // user input
        // # of test cases
        int testCases = in.nextInt();

        // getting values of rectangles
        for (int i = 0; i <= testCases; i++){
            // rec 1
            int xpos1 = in.nextInt();
            int ypos1 = in.nextInt();
            int width1 = in.nextInt();
            int height1 = in.nextInt();

            // rec 2
            int xpos2 = in.nextInt();
            int ypos2 = in.nextInt();
            int width2 = in.nextInt();
            int height2 = in.nextInt();

            Rectangle rect1 = new Rectangle(xpos1, ypos1, width1, height1);
            Rectangle rect2 = new Rectangle(xpos2, ypos2, width2, height2);

            // size check
            boolean rectCheck;

            if (width1 >= width2 && height1 >= height2) {
                rectCheck = true;
            } else {
                rectCheck = false;
            }

            System.out.println(" ");
            System.out.println("Test case: " + (i + 1));
            System.out.println("Rectangle 1: " + rect1);
            System.out.println("Rectangle 2: " + rect2);
            System.out.println("Is Rectangle 2 contained in Rectangle 1?  " + rectCheck);
        }
    }
}