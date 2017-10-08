package pieces;

import chess.EColor;
import chess.PathTrace;

/**
 * Abstract piece.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public abstract class Piece {

  private final EColor color;

  public Piece(EColor color) {
    this.color = color;
  }

  public EColor getColor() {
    return this.color;
  }

  abstract PathTrace tracePaths(int sourceX, int sourceY, int destX, int destY);

}
