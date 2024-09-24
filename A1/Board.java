package A1;

public class Board {
    
    // instance vars
    private Pieces[][] board;

    public Board() { // constructor
        board = new Pieces[8][8];
    }

    // adds a piece if the space is null
    public boolean addPiece(Pieces piece, int row, int col) {
        if (board[row][col] == null) {
            board[row][col] = piece;
            return true;
        }
        System.out.println("Error: piece already at (" + row + ", " + col + ")");
        return false;
    }

    // moving a piece n spaces based on fast/flex combo
    public boolean movePiece(int row, int col, String direction, int spacesMoved) {
        Pieces moveThePiece = board[row][col];

        if (moveThePiece == null) {
            System.out.println("Error: no piece at (" + row + ", " + col + ")");
            return false;
        }

        int newRowValue = row;
        int newColValue = col;

        if (moveThePiece instanceof SlowPiece) { // SLOW
            if (direction.toLowerCase().equals("left")) {
                newColValue = col - 1;
                if (newColValue < 0) {
                    System.out.println("Error: Out of bounds move");
                    return false;
                }
                System.out.println("Piece at (" + row + ", " + col + ") moved left 1 space");
            } else if (direction.toLowerCase().equals("right")) {
                newColValue = col + 1;
                if (newColValue >= 8) {
                    System.out.println("Error: Out of bounds move");
                    return false;
                }
                System.out.println("Piece at (" + row + ", " + col + ") moved right 1 space");
            } else {
                System.out.println("Error: Invalid direction for SlowPiece");
                return false;
            }
        } else if (moveThePiece instanceof FastPiece) { // FAST
            if (direction.toLowerCase().equals("left")) {
                newColValue = col - spacesMoved;
                if (newColValue < 0) {
                    System.out.println("Error: Out of bounds move");
                    return false;
                }
                System.out.println("Piece at (" + row + ", " + col + ") moved left by " + spacesMoved + " spaces");
            } else if (direction.toLowerCase().equals("right")) {
                newColValue = col + spacesMoved;
                if (newColValue >= 8) {
                    System.out.println("Error: Out of bounds move");
                    return false;
                }
                System.out.println("Piece at (" + row + ", " + col + ") moved right by " + spacesMoved + " spaces");
            } else {
                System.out.println("Error: Invalid direction for FastPiece");
                return false;
            }
        } else if (moveThePiece instanceof SlowFlexible) { // SLOW FLEX
            if (direction.toLowerCase().equals("left")) {
                newColValue = col - 1;
                if (newColValue < 0) {
                    System.out.println("Error: Out of bounds move");
                    return false;
                }
                System.out.println("Piece at (" + row + ", " + col + ") moved left 1 space");
            } else if (direction.toLowerCase().equals("right")) {
                newColValue = col + 1;
                if (newColValue >= 8) {
                    System.out.println("Error: Out of bounds move");
                    return false;
                }
                System.out.println("Piece at (" + row + ", " + col + ") moved right 1 space");
            } else if (direction.toLowerCase().equals("up")) {
                newRowValue = row - 1;
                if (newRowValue < 0) {
                    System.out.println("Error: Out of bounds move");
                    return false;
                }
                System.out.println("Piece at (" + row + ", " + col + ") moved up 1 space");
            } else if (direction.toLowerCase().equals("down")) {
                newRowValue = row + 1;
                if (newRowValue >= 8) {
                    System.out.println("Error: Out of bounds move");
                    return false;
                }
                System.out.println("Piece at (" + row + ", " + col + ") moved down 1 space");
            } else {
                System.out.println("Error: Invalid direction for SlowFlexible");
                return false;
            }
        } else if (moveThePiece instanceof FastFlexible) { // FAST FLEX
            if (direction.toLowerCase().equals("left")) {
                newColValue = col - spacesMoved;
                if (newColValue < 0) {
                    System.out.println("Error: Out of bounds move");
                    return false;
                }
                System.out.println("Piece at (" + row + ", " + col + ") moved left by " + spacesMoved + " spaces");
            } else if (direction.toLowerCase().equals("right")) {
                newColValue = col + spacesMoved;
                if (newColValue >= 8) {
                    System.out.println("Error: Out of bounds move");
                    return false;
                }
                System.out.println("Piece at (" + row + ", " + col + ") moved right by " + spacesMoved + " spaces");
            } else if (direction.toLowerCase().equals("up")) {
                newRowValue = row - spacesMoved;
                if (newRowValue < 0) {
                    System.out.println("Error: Out of bounds move");
                    return false;
                }
                System.out.println("Piece at (" + row + ", " + col + ") moved up by " + spacesMoved + " spaces");
            } else if (direction.toLowerCase().equals("down")) {
                newRowValue = row + spacesMoved;
                if (newRowValue >= 8) {
                    System.out.println("Error: Out of bounds move");
                    return false;
                }
                System.out.println("Piece at (" + row + ", " + col + ") moved down by " + spacesMoved + " spaces");
            } else {
                System.out.println("Error: Invalid direction for FastFlexible");
                return false;
            }
        }

        // Move the piece to the new position
        board[newRowValue][newColValue] = moveThePiece; // Move piece to new position
        board[row][col] = null; // Clear old position
        moveThePiece.setPositionX(newColValue); // Update piece's X position
        moveThePiece.setPositionY(newRowValue); // Update piece's Y position

        return true;
    }


 // prints out board
public void printOutBoard() { // fix printing issue
    for (int i = 0; i < 8; i++) {
        for (int j = 0; j < 8; j++) {
            if (board[i][j] != null) {
                // Ensure each piece is printed with a fixed width
                System.out.print(board[i][j].toString());
            } else {
                System.out.print("       --       ");
            }
        }
        System.out.println();
    }
}

    public Pieces getBoard(int row, int col) {
        return board[row][col];
    }
}
