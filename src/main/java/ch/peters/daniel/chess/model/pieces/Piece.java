package ch.peters.daniel.chess.model.pieces;

import ch.peters.daniel.chess.model.Colour;
import ch.peters.daniel.chess.logic.PathTrace;

/**
 * Abstract piece.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public abstract class Piece {
  private final Colour color;

  public Piece(Colour color) {
    this.color = color;
  }

  public Colour getColor() {
    return this.color;
  }

  public abstract PathTrace tracePaths(int sourceX, int sourceY, int destX, int destY);
}
