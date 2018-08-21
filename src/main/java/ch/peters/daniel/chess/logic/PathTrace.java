package ch.peters.daniel.chess.logic;

import java.util.List;

/**
 * History of moves.
 *
 * @author Daniel Peters <daniel.peters.ch@gmail.com>
 * @version 1.0
 */
public class PathTrace {
  private int sourceX;
  private int sourceY;
  private int destX;
  private int destY;
  private boolean hasValidTrace;
  private List<List<int[][]>> trace;
}
