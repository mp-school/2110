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
            return false;
        
    }

    // moving a piece n spaces based on fast/flex combo
    public boolean movePiece(int row, int col, String direction, int spacesMoved){
        if (board[row][col] == null){
            System.out.println("Error: no piece at (" + row + " " + col + ")");
            return false;
        } else {
            return true; // do this later
        }
    }

    // prints out board
    public void printOutBoard(){
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                if (board[i][j] != null){
                    System.out.print(board[i][j].toString() + " ");
                } else {
                    System.out.print("-- ");
                }
            }

            System.out.println(" ");
        }
    
}

    
    }

