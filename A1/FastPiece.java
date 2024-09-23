package A1;

import java.util.*;

public class FastPiece extends Pieces {
    
private String distance;

    public FastPiece(String name, String colour, int positionX, int positionY){
        super(name, colour, positionX, positionY); // from Pieces class

    }

   
   // Slow Piece moves ONE SPACE right or left
   public void move(String direction, int n){

    ; // unlimted(within board but user input is unlimited)

    int positionX = getPositionX();
    int positionY = getPositionY();



    if (direction.toLowerCase().equals("left") && positionX > 0){
        setPositionX(positionX - n);
    } else if (direction.toLowerCase().equals("right") && positionY > 7){
        setPositionX(positionX + n); 
    }

}

    @Override // shows f for fast on printed board
        public String toString(){
    return  super.toString() + "F";
}



    



}


