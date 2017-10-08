package chess;

import pieces.Bishop;
import pieces.EPiece;
import pieces.King;
import pieces.Knight;
import pieces.Pawn;
import pieces.Piece;
import pieces.Queen;
import pieces.Rook;

/**
 * Chess piece factory.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class PieceFactory {
  public Piece createPiece(EPiece type, EColor color) {
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
