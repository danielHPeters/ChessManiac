package chess;

import java.util.List;

import pieces.EPiece;
import pieces.Piece;

/**
 * Chess board.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Board {
  private Cell[][] cells;
  private List<Piece> pieces;
  private PieceFactory factory;

  public Board() {
    factory = new PieceFactory();
    initPieces();
  }

  public void initPieces() {
    for (EColor color : EColor.values()) {
      this.pieces.add(factory.createPiece(EPiece.KING, color));
      this.pieces.add(factory.createPiece(EPiece.QUEEN, color));

      for (int i = 0; i < 2; i++) {
        this.pieces.add(factory.createPiece(EPiece.BISHOP, color));
        this.pieces.add(factory.createPiece(EPiece.ROOK, color));
        this.pieces.add(factory.createPiece(EPiece.ROOK, color));
      }

      for (int i = 0; i < 8; i++) {
        this.pieces.add(factory.createPiece(EPiece.PAWN, color));
      }
    }
  }

  public void movePiece(EColor color, Cell source, Cell destination) {

  }
}
