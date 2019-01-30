package ch.peters.daniel.chess.model;

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
   * Default constructor.
   *
   * @param name
   * @param winCount
   * @param lossCount
   * @param drawCount
   */
  public Player(String name, int winCount, int lossCount, int drawCount) {
    this.name = name;
    this.winCount = winCount;
    this.lossCount = lossCount;
    this.drawCount = drawCount;
  }
}
