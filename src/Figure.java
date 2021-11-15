public abstract class Figure {
    boolean colour;
    Figure(boolean colour){
        this.colour = colour;
    }
}
class Rook extends Figure{
    Rook(boolean colour) {
        super(colour);
    }
}
class Pawn extends Figure{
    Pawn(boolean colour) {
        super(colour);
    }
}
class King extends Figure{
    King(boolean colour) {
        super(colour);
    }
}
class Queen extends Figure{
    Queen(boolean colour) {
        super(colour);
    }
}
class Knight extends Figure{
    Knight(boolean colour) {
        super(colour);
    }
}
class Bishop extends Figure{
    Bishop(boolean colour) {
        super(colour);
    }
}

