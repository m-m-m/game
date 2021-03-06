package net.sf.mmm.game.engine.border;

import net.sf.mmm.game.engine.asset.GameAsset;
import net.sf.mmm.game.engine.figure.GameFigure;
import net.sf.mmm.game.engine.figure.GameFigureType;
import net.sf.mmm.game.engine.item.GamePickItem;
import net.sf.mmm.game.engine.type.GameTypeAccess;

/**
 * A {@link GameBorderType} that is a hole where only {@link GameFigure}s of specific {@link GameFigure#getType() types}
 * {@link #isPassable(GameAsset, boolean, GameBorder) can pass through}.
 */
public class GameBorderTypeHole extends GameBorderType {

  private final GameFigureType figureType;

  private GameBorderTypeHole(GameFigureType figureType) {
    super("Hole");
    this.figureType = figureType;
  }

  @Override
  public boolean isPassable(GameAsset<?> asset, boolean move, GameBorder border) {

    if (asset instanceof GamePickItem) {
      return true;
    }
    return (this.figureType == asset.getType());
  }

  @Override
  public GameTypeAccess getOverlay() {

    return this.figureType;
  }

  /**
   * @param figureType the {@link GameFigureType} that is allowed to {@link #isPassable(GameAsset, boolean, GameBorder)
   *        pass through}.
   * @return an instance of this border type.
   */
  public static final GameBorderTypeHole get(GameFigureType figureType) {

    return new GameBorderTypeHole(figureType);
  }

}
