package pieces;

import chess.EColor;
import chess.PathTrace;

/**
 * Pawn piece.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Pawn extends Piece {

  public Pawn(EColor color) {
    super(color);
  }

  @Override
  PathTrace tracePaths(int sourceX, int sourceY, int destX, int destY) {
    throw new UnsupportedOperationException("Not supported yet.");
  }

}
