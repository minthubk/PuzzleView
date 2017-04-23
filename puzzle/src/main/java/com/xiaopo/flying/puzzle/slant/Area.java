package com.xiaopo.flying.puzzle.slant;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.List;

/**
 * @author wupanjie
 */

public interface Area {
  float left();

  float top();

  float right();

  float bottom();

  float centerX();

  float centerY();

  float width();

  float height();

  boolean contains(PointF point);

  boolean contains(float x, float y);

  boolean contains(Line line);

  Path getAreaPath();

  RectF getAreaRect();

  List<Line> getLines();
}
