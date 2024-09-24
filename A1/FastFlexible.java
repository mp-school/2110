package A1;

public class FastFlexible extends FastPiece {
    
    private String distance;

    public FastFlexible(String name, String colour, int positionX, int positionY){
        super(name, colour, positionX, positionY); // from Pieces class
    }

     // Fast flex moves N SPACE right or left/ up or down
   public void move(String direction, int n){
       
}



    public String toString() {  // adds F so now its FF
        return super.toString() + "F";
         }




    }


