package A1;
public class Board {
    
    // instance vars
    private Pieces[][] board;

    public Board() { // consturctor
    board = new Pieces[8][8];
    }
    // adds a piece if the space is null
    public boolean addPiece(Pieces piece, int row, int col){
        if (board[row][col] == null){
            board[row][col] = piece;
            return true;
        } 
            System.out.println("Error: piece already at (" + row + " " + col + ")");
            return false;
        
    }

    // moving a piece n spaces based on fast/flex combo
    public boolean movePiece(int row, int col, String direction, int spacesMoved){

        Pieces moveThePiece = board[row][col];

        //
        int newRowValue = row;
        int newColValue = col;
    

        if (board[row][col] == null){
            System.out.println("Error: no piece at (" + row + " " + col + ") ");
            return false;
        } else { 

              if (moveThePiece instanceof SlowPiece){ // SLOW

               if (((SlowPiece) moveThePiece).move(direction) == true){
                    switch (direction){
                        case "left":
                        newColValue = col - 1;
                    board[newRowValue][newColValue] = moveThePiece;
                    moveThePiece.setPositionX(newRowValue);
                    moveThePiece.setPositionY(newColValue);
                    System.out.println("Piece at " + "(" + row + "," + col + ") " +
                    "moved left 1 space" );
                    break;

                    case "right" :
                    newColValue = col + 1;

                    board[newRowValue][newColValue] = moveThePiece;
                    moveThePiece.setPositionX(newRowValue);
                    moveThePiece.setPositionY(newColValue);
                    System.out.println("Piece at " + "(" + row + "," + col + ") " +
                    "moved right 1 space" );
                    break;
                    
                    }

                    
               } if (((SlowPiece) moveThePiece).move(direction) == false){
                System.out.println("Out of Bounds!!");
               }

                

                    
                board[row][col] = null; // Clear old position
               

            // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                
            } if (moveThePiece instanceof FastPiece){ // FAST


               if (((FastPiece) moveThePiece).move(direction, spacesMoved) == true){
                switch (direction){
                    case "left":
                    newColValue = col - 1;
                board[newRowValue][newColValue] = moveThePiece;
                moveThePiece.setPositionX(newRowValue);
                moveThePiece.setPositionY(newColValue);
                System.out.println("Piece at " + "(" + row + "," + col + ") " +
                "moved left 1 space" );
                break;

                case "right" :
                newColValue = col + 1;

                board[newRowValue][newColValue] = moveThePiece;
                moveThePiece.setPositionX(newRowValue);
                moveThePiece.setPositionY(newColValue);
                System.out.println("Piece at " + "(" + row + "," + col + ") " +
                "moved right 1 space" );
                break;
                
            } 

                    
                }else if (((FastPiece) moveThePiece).move(direction, spacesMoved) == false){
                    System.out.println("Out of Bounds!!");

                board[row][col] = null; // Clear old position
                
            
            // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                
        } if (moveThePiece instanceof SlowFlexible){ // FAST


            if (((SlowFlexible) moveThePiece).move(direction) == true){
             switch (direction){
                case "left":
                newColValue = col - 1;
                board[newRowValue][newColValue] = moveThePiece;
                System.out.println("Piece at " + "(" + row + "," + col + ") " +
                "moved left 1 space" );
                moveThePiece.setPositionX(newRowValue);
                moveThePiece.setPositionY(newColValue);
            
             break;

             case "right" :

            newColValue = col + 1;
            board[newRowValue][newColValue] = moveThePiece;
            System.out.println("Piece at " + "(" + row + "," + col + ") " +
            "moved right 1 space" );
             moveThePiece.setPositionX(newRowValue);
             moveThePiece.setPositionY(newColValue);
            
             break;
             
         case "up" :

         newRowValue = row - 1;
                    board[row][newColValue] = moveThePiece;
                    System.out.println("Piece at " + "(" + row + "," +col + ") " +
                    "moved up 1 space" );
                    moveThePiece.setPositionX(newRowValue);
                    moveThePiece.setPositionY(newColValue);
            break;

            case "down" :

            newRowValue = row + 1;
                       board[row][newColValue] = moveThePiece;
                       System.out.println("Piece at " + "(" + row + "," +col + ") " +
                       "moved up 1 space" );
                       moveThePiece.setPositionX(newRowValue);
                       moveThePiece.setPositionY(newColValue);
               break;
   


        }


                 
             }else if (((FastPiece) moveThePiece).move(direction, spacesMoved) == false){
                 System.out.println("Out of Bounds!!");

             board[row][col] = null; // Clear old position
             }

        }

            // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

                
        } if (moveThePiece instanceof FastFlexible){ // FAST


            if (((FastFlexible) moveThePiece).move(direction, spacesMoved) == true){
             switch (direction){
                case "left":
                newColValue = col - 1;
                board[newRowValue][newColValue] = moveThePiece;
                System.out.println("Piece at " + "(" + row + "," + col + ") " +
                "moved left 1 space" );
                moveThePiece.setPositionX(newRowValue);
                moveThePiece.setPositionY(newColValue);
            
             break;

             case "right" :

            newColValue = col + 1;
            board[newRowValue][newColValue] = moveThePiece;
            System.out.println("Piece at " + "(" + row + "," + col + ") " +
            "moved right 1 space" );
             moveThePiece.setPositionX(newRowValue);
             moveThePiece.setPositionY(newColValue);
            
             break;
             
         case "up" :

         newRowValue = row - 1;
                    board[row][newColValue] = moveThePiece;
                    System.out.println("Piece at " + "(" + row + "," +col + ") " +
                    "moved up 1 space" );
                    moveThePiece.setPositionX(newRowValue);
                    moveThePiece.setPositionY(newColValue);
            break;

            case "down" :

            newRowValue = row + 1;
                       board[row][newColValue] = moveThePiece;
                       System.out.println("Piece at " + "(" + row + "," +col + ") " +
                       "moved up 1 space" );
                       moveThePiece.setPositionX(newRowValue);
                       moveThePiece.setPositionY(newColValue);
               break;
   


        }


                 
             }else if (((FastPiece) moveThePiece).move(direction, spacesMoved) == false){
                 System.out.println("Out of Bounds!!");

             board[row][col] = null; // Clear old position
             }

        }


    }
                    

                //if (newRowValue - 1 < 0 || newRowValue + 1 >= 8 || newColValue - 1 < 0 || newColValue + 1 >= 8) {
                //    System.out.println("Error: Move out of bounds to (" + newRowValue + ", " + newColValue + ")");
                 //   return false;
                //}

                
                board[newRowValue][newColValue] = moveThePiece; // Move piece to new position
                board[row][col] = null; // Clear old position
                
                moveThePiece.setPositionX(newColValue); // Update piece's X position
                moveThePiece.setPositionY(newRowValue); // Update piece's Y position
                
               return true;
            }
            
        

    // prints out board
    public void printOutBoard(){ // fix pritning issue
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                if (board[i][j] != null){
                    System.out.print(board[i][j].toString() + " ");
                } else {
                    System.out.print("       --       ");
                }
            }

            System.out.println();
        }
    
}

public Pieces getBoard(int row, int col){
    return board[row][col];
}

    
    }