package ggordeev.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by g.gordeev on 01.03.2016.
 */
public class SquareTests {

  @Test
  public void testArea() {
  Square s = new Square(4);
    Assert.assertEquals(16.0, s.area());
  }
}
