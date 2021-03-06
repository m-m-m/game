/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package net.sf.mmm.game.engine.item;

import net.sf.mmm.game.engine.field.GameField;
import net.sf.mmm.game.engine.position.GamePosition;

/**
 * A {@link GameItemMoveEvent} that notifies about a {@link #getAsset() field item} that has changed its
 * {@link GameFieldItem#getLocation() location} from an {@link #getOldLocation() old location} to a
 * {@link #getNewLocation() new location}.
 */
public class GameFieldItemMoveEvent extends GameItemMoveEvent<GameField, GameFieldItem> {

  /**
   * The constructor.
   *
   * @param oldLocation the {@link #getOldLocation() old location}.
   * @param oldPosition the {@link #getOldPosition() old position}.
   * @param asset the {@link #getAsset() item}.
   */
  public GameFieldItemMoveEvent(GameField oldLocation, GamePosition oldPosition, GameFieldItem asset) {

    super(oldLocation, oldPosition, asset);
  }

  /**
   * The constructor.
   *
   * @param oldLocation the {@link #getOldLocation() old location}.
   * @param oldPosition the {@link #getOldPosition() old position}.
   * @param asset the {@link #getAsset() item}.
   * @param newLocation the {@link #getNewLocation() new location}.
   * @param newPosition the {@link #getNewPosition() new position}.
   */
  public GameFieldItemMoveEvent(GameField oldLocation, GamePosition oldPosition, GameFieldItem asset, GameField newLocation, GamePosition newPosition) {

    super(oldLocation, oldPosition, asset, newLocation, newPosition);
  }

}
