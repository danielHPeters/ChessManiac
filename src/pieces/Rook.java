package pieces;

import chess.EColor;
import chess.PathTrace;

/**
 * Rook piece.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Rook extends Piece {

  public Rook(EColor color) {
    super(color);
  }

  @Override
  PathTrace tracePaths(int sourceX, int sourceY, int destX, int destY) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

}
