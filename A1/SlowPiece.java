package A1;

public class SlowPiece  extends Pieces{

    // instance vars
    String direction;

    public SlowPiece(String name, String colour, int positionX, int positionY){
        super(name, colour, positionX, positionY); // from Pieces class
    }

    // Slow Piece moves ONE SPACE right or left
        public void move(String direction){

           /*  int n = 1; // one space only

            int positionX = getPositionX();
            int positionY = getPositionY();


            if (direction.toLowerCase().equals("left") && positionX > 0){
                setPositionX(positionX - n);
            } else if (direction.toLowerCase().equals("right") && positionY > 7){
                setPositionX(positionX + n);
            } 

            */
            
        }

        @Override
        public String toString(){
            return  super.toString() + "S";
        }
        
    }


