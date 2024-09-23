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
            System.out.println("Error: no piece at (" + row + " " + col + ")");
            return false;
        } else { 
              if (moveThePiece instanceof SlowPiece){ // SLOW
                if (direction.toLowerCase().equals("left")){
                    newRowValue = col - 1;
                    board[newRowValue][newColValue] = moveThePiece;
                    moveThePiece.setPositionX(newRowValue);
                    moveThePiece.setPositionY(newColValue);



                } else if (direction.toLowerCase().equals("right")){
                    newRowValue = col + 1;
                    board[newRowValue][newColValue] = moveThePiece;
                    moveThePiece.setPositionX(newRowValue);
                    moveThePiece.setPositionY(newColValue);
                } 
                    
                board[row][col] = null;
                
                //System.out.println(newRowValue); //TESTING
                //System.out.println(newColValue); //TESTING

            

            // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                
            } if (moveThePiece instanceof FastPiece){ // FAST
                if (direction.toLowerCase().equals("left")){
                    newColValue = col - spacesMoved;
                    board[newRowValue][newColValue] = moveThePiece;
                    
                   

                } else if (direction.toLowerCase().equals("right")){
                    newColValue = col + spacesMoved;
                    board[newRowValue][newColValue] = moveThePiece;
                    
                    
                }
                    
                // Move the piece to the new position
                board[newRowValue][newColValue] = moveThePiece; // Move piece to new position
                board[row][col] = null; // Clear old position
                moveThePiece.setPositionX(newColValue); // Update piece's X position
                moveThePiece.setPositionY(newRowValue); // Update piece's Y position
                
                System.out.println(newRowValue); //TESTING
                System.out.println(newColValue); //TESTING

            // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
                
            //Can move UP and DOWN, 1 Space
            } if (moveThePiece instanceof SlowFlexible){ // SLOW FLEX
                if (direction.toLowerCase().equals("left")){
                    newColValue = col - 1;
                    board[newRowValue][newColValue] = moveThePiece;
                    
                   

                } else if (direction.toLowerCase().equals("right")){
                    newColValue = col + 1;
                    board[newRowValue][newColValue] = moveThePiece;
                    
                

                } else if (direction.toLowerCase().equals("up")){
                    newRowValue = row - 1;
                    board[row][newColValue] = moveThePiece;
                    
                    

                } else if (direction.toLowerCase().equals("down")){
                    newRowValue = row + 1;
                    board[row][newColValue] = moveThePiece;
                    
                    
                }
                    
                // Move the piece to the new position
                board[newRowValue][newColValue] = moveThePiece; // Move piece to new position
                board[row][col] = null; // Clear old position
                moveThePiece.setPositionX(newColValue); // Update piece's X position
                moveThePiece.setPositionY(newRowValue); // Update piece's Y position
                
                System.out.println(newRowValue); //TESTING
                System.out.println(newColValue); //TESTING


            // - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

                
              }  //Can move UP and DOWN, and N spaces
            } if (moveThePiece instanceof FastFlexible){ // FAST FLEX
                if (direction.toLowerCase().equals("left")){
                    newColValue = col - spacesMoved;
                    board[newRowValue][newColValue] = moveThePiece;
                    
                   

                } else if (direction.toLowerCase().equals("right")){
                    newColValue = col + spacesMoved;
                    board[newRowValue][newColValue] = moveThePiece;
                    
                    

                } else if (direction.toLowerCase().equals("up")){
                    newRowValue = row - spacesMoved;
                    board[row][newColValue] = moveThePiece;
                    
                    

                } else if (direction.toLowerCase().equals("down")){
                    newRowValue = row + spacesMoved;
                    board[row][newColValue] = moveThePiece;
                    
                    
                }
                    
                // Move the piece to the new position
                board[newRowValue][newColValue] = moveThePiece; // Move piece to new position
                board[row][col] = null; // Clear old position
                moveThePiece.setPositionX(newColValue); // Update piece's X position
                moveThePiece.setPositionY(newRowValue); // Update piece's Y position
                
                System.out.println(newRowValue); //TESTING
                System.out.println(newColValue); //TESTING
            }
            
            return false;

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

