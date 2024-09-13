// From Game Pieces

// functional printing function
// printing
for(int i=0; i<size; i++){
    for (int j=0; j<size; j++){
        pieceTracker[i][j] = " - ";
        //System.out.print(pieceTracker[i][j]);
        
    }

    //System.out.println();

}

// game piece code
String colour = in.nextLine();
int positionX = in.nextInt();
int positionY = in.nextInt();


Pieces gamePiece = new Pieces(name, colour, positionX, positionY);