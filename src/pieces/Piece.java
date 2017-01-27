package pieces;

import chess.PathTrace;

/**
 *
 * @author d.peters
 */
public abstract class Piece {
    
    private int color;
    
    PathTrace tracePaths(int sourceX, int sourceY, int destX, int destY){
        return new PathTrace();
    }

}
