package chess;

/**
 *
 * @author d.peters
 */
public class Player {

    /**
     *
     */
    private String name;
    
    private int winCount;
    
    private int lossCount;
    
    private int drawCount;
    
    /**
     * Default constructor. Sets name of the Player
     * @param name 
     */
    public Player (String name){
        
        this.name = name;
        
    }

}
