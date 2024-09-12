// Assignment 1 - Csci 2110
// Author: Megan Picard
// Purpose -> 

import java.util.*;

public class GameDemo{

    public static void main(String[] args){
        // Create a new game

        Scanner in = new Scanner(System.in); // Read in


        //String name = in.nextLine();
        //String colour = in.nextLine();
        


        //Pieces gamePiece = new Pieces(name, colour, positionX, positionY);

        //System.out.print(gamePiece);
        //gamePiece. // add slow piece and fast piece functions here

        // new array to store object location
        int size = 8;
        String[][] pieceTracker = new String[size][size];



        boolean lineCheck = true;
           
        while(in.hasNext() == true){
            String name = in.nextLine();
            String colour = in.nextLine();
            int positionX = in.nextInt();
            int positionY = in.nextInt();
            pieceTracker[positionX][positionY] = name;

            if (name.equals("exit")){
                lineCheck = false;
            }

            
            if (name.equals("print")){
             for(int i=0; i<size; i++){
                for (int j=0; j<size; j++){
                    pieceTracker[i][j] = " - ";
                }
            
            }
        }
            
            
            
    }

    
        
        
    }


}