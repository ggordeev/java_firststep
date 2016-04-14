package ggordeev.addressbook.tests;

import ggordeev.addressbook.model.PersonData;
import org.testng.annotations.Test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class PersomCreationTests extends TestBase {
  FirefoxDriver wd;


  @Test
  public void testPersomCreation() {

    app.getNavigationHelper().gotoAddNewPage();
    app.getPersonHelper().fillPersonForm(new PersonData("grishka", "gordeev", "addr222", "grishka@grishka.com", "111111333333"));
    app.getPersonHelper().submitPersonCreation();
    app.getNavigationHelper().gotoHomePage();
  }


}
