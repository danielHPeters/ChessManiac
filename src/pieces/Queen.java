package pieces;

import chess.EColor;
import chess.PathTrace;

/**
 *
 * @author d.peters
 */
public class Queen extends Piece {

    public Queen(EColor color) {
        super(color);
    }

    @Override
    PathTrace tracePaths(int sourceX, int sourceY, int destX, int destY) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
