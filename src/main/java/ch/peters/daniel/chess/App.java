package ch.peters.daniel.chess;

import ch.peters.daniel.chess.model.Board;
import ch.peters.daniel.chess.model.Player;

import java.util.Map;

/**
 * Main class.
 *
 * @author Daniel Peters
 * @version 1.0
 */
public class App {
  private Player white;
  private Player black;
  private Board board;
  private Map moveHistory;

  public App () {
    this.board = new Board();
  }

  public void start() {
    board.initPieces();
  }

  public void stop() {

  }

  /**
   * Main method.
   *
   * @param args the command line arguments
   */
  public static void main(String[] args) {

  }
}
