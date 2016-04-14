package ggordeev.addressbook.tests;

import ggordeev.addressbook.model.PersonData;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class PersonModificationTests extends TestBase {

    @Test
    public void testPersonModification() {

      app.getNavigationHelper().gotoHomePage();
      app.getPersonHelper().selectPerson();
      app.getPersonHelper().initPersonModification();
      app.getPersonHelper().fillPersonForm(new PersonData("grishka", "ogogov", "addr444444", "grishka@grishka.com", "2222224444444"));
      app.getPersonHelper().sumbitPersonModification();
      app.getNavigationHelper().gotoHomePage();
    }






}
