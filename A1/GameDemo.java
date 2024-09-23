package A1;
// Assignment 1 - Csci 2110
// Author: Megan Picard
// Purpose -> 

import java.util.*;

public class GameDemo{
    public static void main (String[] args){
Scanner in = new Scanner(System.in); // Read in

//int size = 8;
//String[][] pieceTracker = new String[size][size];

Board board = new Board(); // creating board object
String ui = " "; // ui variable

// orignial enter statement
System.out.println("Enter a command (type help for details)");

// UI
while(!ui.toLowerCase().equals("exit")){ // mabye change to switch latet
    ui = in.next();

// break program
if (ui.toLowerCase().equals("exit")){
    break;
}

// help commands
if (ui.toLowerCase().equals("help")){
          System.out.println("Possible commands are as follows:");
          System.out.println("create location [fast][flexible]: Creates a new piece.");
          System.out.println("move location direction [spaces]: Moves a piece.");
          System.out.println("print: Displays the board.");
          System.out.println("help: Displays help");
          System.out.println("exit: Exits the program.");
          System.out.println("Enter a command (type help for details)");
}

// print board
if (ui.toLowerCase().equals("print")){

    // to add later
    board.printOutBoard();
    System.out.println("Enter a command (type help for details)");
}

if (ui.toLowerCase().equals("move")){

}

if (ui.toLowerCase().equals("create")){
      
   int positionX = in.nextInt();
   int positionY = in.nextInt();
   String type = in.nextLine(); // forget about for now
   

   System.out.println("Input a name for the new piece:");
   String name = in.nextLine();
   
   
   System.out.println("Input a colour for the new piece:");
   String colour = in.nextLine();
			
   
   
	

    if (type.toLowerCase().equals(" fast flexible")){
        FastFlexible gamePiece = new FastFlexible (name, colour, positionX, positionY );
        board.addPiece(gamePiece, positionX, positionY);

    } else if (type.toLowerCase().equals(" flexible")){
        SlowFlexible gamePiece = new SlowFlexible (name, colour, positionX, positionY );
        board.addPiece(gamePiece, positionX, positionY);

    } else if (type.toLowerCase().equals(" fast")){
        FastPiece gamePiece = new FastPiece (name, colour, positionX, positionY );
        board.addPiece(gamePiece, positionX, positionY);

    }else {
        SlowPiece gamePiece = new SlowPiece (name, colour, positionX, positionY );
        board.addPiece(gamePiece, positionX, positionY);
    }


System.out.println(" ");
System.out.println("Enter a command (type help for details)");






}
    }
}
}