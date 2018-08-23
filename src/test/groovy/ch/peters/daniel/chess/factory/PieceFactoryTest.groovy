package ch.peters.daniel.chess.factory

import ch.peters.daniel.chess.model.Colour
import ch.peters.daniel.chess.model.pieces.Bishop
import ch.peters.daniel.chess.model.pieces.King
import ch.peters.daniel.chess.model.pieces.Knight
import ch.peters.daniel.chess.model.pieces.Pawn
import ch.peters.daniel.chess.model.pieces.PieceType
import ch.peters.daniel.chess.model.pieces.Queen
import ch.peters.daniel.chess.model.pieces.Rook
import spock.lang.Specification

class PieceFactoryTest extends Specification {
    def 'create king' () {
        given:
        def color = Colour.WHITE
        def pieceType = PieceType.KING
        when:
        def king = PieceFactory.createPiece(pieceType, color)
        then:
            king instanceof King
    }

    def 'create queen' () {
        given:
        def color = Colour.WHITE
        def pieceType = PieceType.QUEEN
        when:
        def queen = PieceFactory.createPiece(pieceType, color)
        then:
        queen instanceof Queen
    }

    def 'create bishop' () {
        given:
        def color = Colour.WHITE
        def pieceType = PieceType.BISHOP
        when:
        def bishop = PieceFactory.createPiece(pieceType, color)
        then:
        bishop instanceof Bishop
    }

    def 'create rook' () {
        given:
        def color = Colour.WHITE
        def pieceType = PieceType.ROOK
        when:
        def rook = PieceFactory.createPiece(pieceType, color)
        then:
        rook instanceof Rook
    }

    def 'create knight' () {
        given:
        def color = Colour.WHITE
        def pieceType = PieceType.KNIGHT
        when:
        def knight = PieceFactory.createPiece(pieceType, color)
        then:
        knight instanceof Knight
    }

    def 'create pawn' () {
        given:
        def color = Colour.WHITE
        def pieceType = PieceType.PAWN
        when:
        def pawn = PieceFactory.createPiece(pieceType, color)
        then:
        pawn instanceof Pawn
    }
}
