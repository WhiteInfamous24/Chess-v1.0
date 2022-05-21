import java.util.ArrayList;

public class King extends Piece {
    public King(String c) {
        super("KING", c);
    }

    public ArrayList<Position> possibleMovements(Position pos) {
        ArrayList<Position> output = new ArrayList<Position>();
        int x = pos.getX();
        int y = pos.getY();
        if(y+1 <= 7) {
            output.add(new Position(x, y+1));
            if(x+1 <= 7)
                output.add(new Position(x+1, y+1));
            if(x-1 >= 0)
                output.add(new Position(x-1, y+1));
        }
        if(y-1 >= 0) {
            output.add(new Position(x, y-1));
            if(x+1 <= 7)
                output.add(new Position(x+1, y-1));
            if(x-1 >= 0)
                output.add(new Position(x-1, y-1));
        }
        if(x+1 <= 7)
            output.add(new Position(x+1, y));
        if(x-1 >= 0)
            output.add(new Position(x-1, y));
        return output;
    }
}
