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
    private final EColor color;
    
    private final int x;
    
    private final int y;
    
    /**
     * Default constructor. Initializes the colol and piece of the cell
     * @param color
     * @param x
     * @param y 
     */
    public Cell(EColor color, int x, int y){
        this.color = color;
        this.piece = null;
        this.x = x;
        this.y = y;
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
