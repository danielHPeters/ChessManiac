package pieces;

import chess.EColor;
import chess.PathTrace;

/**
 * King piece.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class King extends Piece {

  public King(EColor color) {
    super(color);
  }

  @Override
  PathTrace tracePaths(int sourceX, int sourceY, int destX, int destY) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

}
