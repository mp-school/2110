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

String ui = " "; // ui variable

// orignial enter statement
System.out.println("Enter a command (type help for details)");

// UI
while(!ui.equals("exit")){ // mabye change to switch latet
    ui = in.next();

// break program
if (ui.equals("exit")){
    break;
}

// help commands
if (ui.equals("help")){
          System.out.println("Possible commands are as follows:");
          System.out.println("create location [fast][flexible]: Creates a new piece.");
          System.out.println("move location direction [spaces]: Moves a piece.");
          System.out.println("print: Displays the board.");
          System.out.println("help: Displays help");
          System.out.println("exit: Exits the program.");
          System.out.println("Enter a command (type help for details)");
}

// print board
if (ui.equals("print")){

    // to add later
    System.out.println("printed");
    System.out.println("Enter a command (type help for details)");
}


if (ui.equals("create")){
      
   int positionX = in.nextInt();
   int positionY = in.nextInt();
   String type = in.nextLine(); // forget about for now
   

   System.out.println("Input a name for the new piece:");
   String name = in.nextLine();
   
   
   System.out.println("Input a colour for the new piece:");
   String colour = in.nextLine();
			
   
   
	

    if (type.toLowerCase().equals(" fast flexible")){
        FastPiece gamePiece = new FastPiece (name, colour, positionX, positionY );

    } else if (type.toLowerCase().equals(" flexible")){
        FastPiece gamePiece = new FastPiece (name, colour, positionX, positionY );

    } else if (type.toLowerCase().equals(" fast")){
        FastPiece gamePiece = new FastPiece (name, colour, positionX, positionY );

    }else {
        SlowPiece gamePiece = new SlowPiece (name, colour, positionX, positionY );
    }

System.out.println(" ");
System.out.println("Enter a command (type help for details)");

System.out.println(type);




}
    }
}
}