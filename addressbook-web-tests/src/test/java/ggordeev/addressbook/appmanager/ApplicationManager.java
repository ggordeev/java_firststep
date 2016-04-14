package ggordeev.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by g.gordeev on 03.03.2016.
 */
public class ApplicationManager {
  FirefoxDriver wd;
  private PersonHelper personHelper;
  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;

  public static boolean isAlertPresent(FirefoxDriver wd) {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  public void init() {
    wd = new FirefoxDriver();
    wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    wd.get("http://ggordeev.tmweb.ru/group.php");
    groupHelper = new GroupHelper(wd);
    personHelper = new PersonHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    SessionHelper sessionHelper = new SessionHelper(wd);
    sessionHelper.login("admin", "secret1");
  }


  public void stop() {
    wd.quit();
  }

  public GroupHelper getGroupHelper() {
    return groupHelper;
  }

  public PersonHelper getPersonHelper() {
    return personHelper;
  }

  public NavigationHelper getNavigationHelper() {
    return navigationHelper;
  }
}