package ch.peters.daniel.chess.model.pieces;

import ch.peters.daniel.chess.model.Colour;
import ch.peters.daniel.chess.logic.PathTrace;

/**
 * Knight piece.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public class Knight extends Piece {
  public Knight(Colour color) {
    super(color);
  }

  @Override
  public PathTrace tracePaths(int sourceX, int sourceY, int destX, int destY) {
    throw new UnsupportedOperationException("Not supported yet.");
  }
}
