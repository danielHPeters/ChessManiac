package chess;

/**
 * Player description.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Player {
  private String name;
  private int winCount;
  private int lossCount;
  private int drawCount;

  /**
   * Default constructor. Sets name of the Player
   *
   * @param name player name
   */
  public Player(String name) {
    this.name = name;
  }
}
