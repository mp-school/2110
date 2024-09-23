package A1;

public class SlowFlexible  extends SlowPiece{
    public SlowFlexible(String name, String colour, int positionX, int positionY){
        super(name, colour, positionX, positionY); // from Pieces class

    }



    public String toString() { // adds F so now its SF
        return super.toString() + "F"; 
         }
}
