package ch.peters.daniel.chess.factory;

import ch.peters.daniel.chess.model.Colour;
import ch.peters.daniel.chess.model.pieces.*;

/**
 * App piece factory.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public class PieceFactory {
  public Piece createPiece(PieceType type, Colour color) {
    Piece piece;
    switch (type) {
      case KING:
        piece = new King(color);
        break;
      case QUEEN:
        piece = new Queen(color);
        break;
      case BISHOP:
        piece = new Bishop(color);
        break;
      case ROOK:
        piece = new Rook(color);
        break;
      case KNIGHT:
        piece = new Knight(color);
        break;
      case PAWN:
        piece = new Pawn(color);
        break;
      default:
        piece = null;
        break;
    }
    return piece;
  }
}
