/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
 *
 * @author d.peters
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
