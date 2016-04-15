package ggordeev.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by g.gordeev on 03.03.2016.
 */
public class SessionHelper extends HelperBase {
  private FirefoxDriver wd;

  public SessionHelper(WebDriver wd) {
    super(wd);

  }
  public void login(String username, String password) {
    type(By.name("user"), username);
    type(By.name("pass"), password);
    click(By.xpath("//form[@id='LoginForm']/input[3]"));
  }
}
