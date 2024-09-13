// Assignment 1 - Csci 2110
// Author: Megan Picard
// Purpose -> 

import java.util.*;

public class GameDemo{
    public static void main (String[] args){
Scanner in = new Scanner(System.in); // Read in

//String colour = in.nextLine();
//int positionX = in.nextInt();
//int positionY = in.nextInt();


//Pieces gamePiece = new Pieces(name, colour, positionX, positionY);

//System.out.print(gamePiece);
//gamePiece. // add slow piece and fast piece functions here

// new array to store object location
int size = 8;
String[][] pieceTracker = new String[size][size];

String ui = " ";

// printing
for(int i=0; i<size; i++){
    for (int j=0; j<size; j++){
        pieceTracker[i][j] = " - ";
        //System.out.print(pieceTracker[i][j]);
        
    }

    //System.out.println();

}
    

// UI
while(!ui.equals("exit")){
    ui = in.next();
System.out.println("Enter a command (type help for details)");
    
if (ui.equals("help"))
          System.out.println("Possible commands are as follows:");
          System.out.println("create location [fast][flexible]: Creates a new piece.");
          System.out.println("move location direction [spaces]: Moves a piece.");
          System.out.println("print: Displays the board.");
          System.out.println("help: Displays help");
          System.out.println("exit: Exits the program.");
          
if (ui.equals("print")){
    System.out.print("printed");
}

      }


    }

}
