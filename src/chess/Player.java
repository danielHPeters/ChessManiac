package chess;

/**
 * Player class.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class Player {
  private String name;

  /**
   * Default constructor. Sets name of the Player.
   *
   * @param name player name
   */
  public Player(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
