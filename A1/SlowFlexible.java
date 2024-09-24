package A1;

public class SlowFlexible  extends SlowPiece{
    public SlowFlexible(String name, String colour, int positionX, int positionY){
        super(name, colour, positionX, positionY); // from Pieces class

    }

 // Slow Piece moves ONE SPACE right or left/ up or down
 public void move(String direction){
       
 
    
 }

    public String toString() { // adds F so now its SF
        return super.toString() + "F"; 
         }
}
