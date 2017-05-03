package chess;

import java.util.List;
import pieces.EPiece;
import pieces.Piece;

/**
 *
 * @author d.peters
 */
public class Board {

    /**
     * Two dimensional array of cells containing which make up the board
     */
    private Cell[][] cells;

    /**
     *
     */
    private List<Piece> pieces;

    private PieceFactory factory = new PieceFactory();

    /**
     * 
     * @param color
     * @param source
     * @param destination 
     */
    public void movePiece(EColor color, Cell source, Cell destination) {
        
        
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
            
            for (int i = 0; i < 8; i++){
                this.pieces.add(factory.createPiece(EPiece.PAWN, color));
            }
        }
    }
}
