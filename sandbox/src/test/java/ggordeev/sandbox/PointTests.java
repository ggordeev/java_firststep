package ggordeev.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by g.gordeev on 01.03.2016.
 */
public class PointTests {

  @Test
  public void testArea() {
    Point p1 = new Point(4, 3);
    Point p2 = new Point(3, 7);

    Assert.assertEquals(Point.distance(p1, p2), 4.123105625617661);
  }
}
