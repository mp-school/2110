package A1;

public class SlowPiece extends Pieces{

    // instance vars
    String direction;

    public SlowPiece(String name, String colour, int positionX, int positionY){
        super(name, colour, positionX, positionY); // from Pieces class
    }

    // Slow Piece moves ONE SPACE right or left
        public void move(String direction){

       switch (direction){
        case "left":
            if (getPositionX() < 0) setPositionX(getPositionX() - 1);
            break;

        case "right":
        if (getPositionX() > 8) setPositionX(getPositionX() - 1);
            break;
       }
             
        }

        @Override
        public String toString(){
            return  super.toString() + "S";
        }
        
    }


