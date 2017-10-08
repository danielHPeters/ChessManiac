package chess;

import pieces.Piece;

/**
 * Board cell.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Cell {
  private Piece piece;
  private final EColor color;
  private final int x;
  private final int y;

  /**
   * Default constructor. Initializes the color and piece of the cell.
   *
   * @param color color of this cell
   * @param x     location x
   * @param y     location y
   */
  public Cell(EColor color, int x, int y) {
    this.color = color;
    this.piece = null;
    this.x = x;
    this.y = y;
  }

  /**
   * Get the piece on this cell. Returns null if there is none
   *
   * @return current chess piece or null
   */
  public Piece getPiece() {
    return piece;
  }

  /**
   * Sets the piece on this cell.
   *
   * @param piece new chess piece
   */
  public void setPiece(Piece piece) {
    this.piece = piece;
  }


}
