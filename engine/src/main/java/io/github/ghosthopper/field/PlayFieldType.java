/* Copyright (c) The m-m-m Team, Licensed under the Apache License, Version 2.0
 * http://www.apache.org/licenses/LICENSE-2.0 */
package io.github.ghosthopper.field;

import io.github.ghosthopper.PlayObjectType;

/**
 * The type of a {@link PlayField}.
 */
public class PlayFieldType extends PlayObjectType {

  /** Type of a normal/regular {@link PlayField}. */
  public static final PlayFieldType NORMAL = new PlayFieldType("FieldNormal");

  /** Type of a {@link PlayField} with a pit (player falls down or dies). */
  public static final PlayFieldType PIT = new PlayFieldType("FieldPit");

  /** Type of a {@link PlayField} that is an exit (level completed). */
  public static final PlayFieldType EXIT = new PlayFieldType("FieldExit");

  /**
   * The constructor.
   *
   * @param id - see {@link #getId()}.
   */
  public PlayFieldType(String id) {
    super(id);
  }

}
