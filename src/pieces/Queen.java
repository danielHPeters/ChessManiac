package pieces;

import chess.EColor;
import chess.PathTrace;

/**
 * Queen piece.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Queen extends Piece {

  public Queen(EColor color) {
    super(color);
  }

  @Override
  PathTrace tracePaths(int sourceX, int sourceY, int destX, int destY) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

}
