package chess;

import boardgame.Position;

public class ChessPosition {

    private char column;
    private int row;

    public ChessPosition(char column, int row) {
        if(column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw new ChessException("Error instantiating ChessPosition. Valid values are from a1 to h8.");
        }
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    protected Position toPosition() {
        return new Position(8 - row, column - 'a');
    }
    //c2 ->  6,2  d4 -> 4,3

    protected static ChessPosition fromPosition(Position position) {
        return new ChessPosition((char)('a' + position.getColumn()), 8 - position.getRow());
    }
    //6,2 -> c2  4,3 -> d4

    @Override
    public String toString() {
        return "" + column + row;
    }
}
