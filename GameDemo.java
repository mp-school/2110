// Assignment 1 - Csci 2110
// Author: Megan Picard
// Purpose -> 

import java.util.*;

public class GameDemo{

    public static void main(String[] args){
        // Create a new game

        Scanner in = new Scanner(System.in); // Read in


        String name = in.nextLine();
        String colour = in.nextLine();
        int positionX = in.nextInt();
        int positionY = in.nextInt();

        Pieces gamePiece = new Pieces(name, colour, positionX, positionY);

        System.out.print(gamePiece);
        //gamePiece. // add slow piece and fast piece functions here

        

    }


}