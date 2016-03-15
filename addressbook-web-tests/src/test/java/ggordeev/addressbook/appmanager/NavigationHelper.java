package ggordeev.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by g.gordeev on 03.03.2016.
 */
public class NavigationHelper extends HelperBase {
 private FirefoxDriver wd;

  public NavigationHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void gotoGroupPage() {
    click(By.linkText("groups"));
  }
}
