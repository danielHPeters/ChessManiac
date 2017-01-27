package chess;

import pieces.Piece;

/**
 *
 * @author d.peters
 */
public class Cell {
    
    /**
     * Contains the piece currently on this cell or null
     */
    private Piece piece;
    
    /**
     * The color of this cell
     */
    private int color;
    
    /**
     * Default constructor. Initializes the colol and piece of the cell
     * @param color
     * @param piece 
     */
    public Cell(int color, Piece piece){
        this.color = color;
        this.piece = piece;
    }

    /**
     * Get the piece on this cell. Returns null if there is none
     * @return 
     */
    public Piece getPiece() {
        return piece;
    }

    /**
     * Sets the piece on this cell
     * @param piece 
     */
    public void setPiece(Piece piece) {
        this.piece = piece;
    }
    

}
