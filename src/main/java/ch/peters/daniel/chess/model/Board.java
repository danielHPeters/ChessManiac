package ch.peters.daniel.chess.model;

import ch.peters.daniel.chess.factory.PieceFactory;
import ch.peters.daniel.chess.model.pieces.PieceType;
import ch.peters.daniel.chess.model.pieces.Piece;

import java.util.List;


/**
 * Chess board.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public class Board {
  private Cell[][] cells;
  private List<Piece> pieces;
  private PieceFactory factory;

  public Board() {
    factory = new PieceFactory();
  }

  public void initPieces() {
    for (Colour color : Colour.values()) {
      this.pieces.add(factory.createPiece(PieceType.KING, color));
      this.pieces.add(factory.createPiece(PieceType.QUEEN, color));

      for (int i = 0; i < 2; i++) {
        this.pieces.add(factory.createPiece(PieceType.BISHOP, color));
        this.pieces.add(factory.createPiece(PieceType.ROOK, color));
        this.pieces.add(factory.createPiece(PieceType.ROOK, color));
      }

      for (int i = 0; i < 8; i++) {
        this.pieces.add(factory.createPiece(PieceType.PAWN, color));
      }
    }
  }

  public void movePiece(Colour color, Cell source, Cell destination) {

  }
}
