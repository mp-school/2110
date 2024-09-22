// Megan Picard
// B00939548

package Lab2;
import java.util.*; // import scanner

// test cases
// 4 10 10 100 300 15 15 50 50 10 10 50 50 15 15 100 300 10 10 10 10 20 20 20 20 10 10 50 50 10 10 50 50
// 5 0 0 10 10 20 20 5 5 0 0 20 20 5 5 5 5 0 0 20 20 0 0 20 20 0 0 10 10 10 0 5 5 0 0 20 20 15 15 10 10

public class Exercise2 {
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

            Rectangle2 rect1 = new Rectangle2(xpos1, ypos1, width1, height1);
            Rectangle2 rect2 = new Rectangle2(xpos2, ypos2, width2, height2);

            System.out.println(" ");
            System.out.println("Test case: " + (i + 1));
            System.out.println("Rectangle 1: " + rect1);
            System.out.println("Rectangle 2: " + rect2);
            System.out.println("Is Rectangle 2 contained in Rectangle 1?  " + rect1.contains(rect2));
            System.out.println("Is Rectangle 2 touching in Rectangle 1?  " + rect1.touch(rect2));
            System.out.println("Is Rectangle 2 overlapping in Rectangle 1?  " + rect1.overlaps(rect2));
        }
    }
}
