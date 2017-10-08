package pieces;

import chess.PathTrace;

/**
 * Abstract piece.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public abstract class Piece {
  private int color;

  public PathTrace tracePaths(int sourceX, int sourceY, int destX, int destY) {
    return new PathTrace();
  }
}
