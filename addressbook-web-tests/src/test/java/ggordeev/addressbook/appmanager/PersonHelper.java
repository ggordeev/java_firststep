package ggordeev.addressbook.appmanager;

import ggordeev.addressbook.model.GroupData;
import ggordeev.addressbook.model.PersonData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by g.gordeev on 14.04.2016.
 */

public class PersonHelper extends HelperBase {

  public PersonHelper(FirefoxDriver wd) {
    super(wd);
  }



  public void submitPersonCreation() {
    click(By.xpath("//div[@id='content']/form/input[21]"));
  }

  public void fillPersonForm(PersonData personData) {

    type(By.name("firstname"), personData.getfirstname());
    type(By.name("lastname"), personData.getlastname());
    type(By.name("address"), personData.getaddr());
    type(By.name("email"), personData.getemail());
    type(By.name("mobile"), personData.getmobile());
  }

  public void deletePerson() {
    click(By.xpath("//div[@id='content']/form[2]/div[2]/input"));
    wd.switchTo().alert().accept();

  }

  public void selectPerson() {
    if (!wd.findElement(By.name("selected[]")).isSelected()) {
      wd.findElement(By.name("selected[]")).click();
    }
  }

  public void initPersonModification() {

    wd.findElement(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img")).click();
  }

  public void sumbitPersonModification() {
    wd.findElement(By.xpath("//div[@id='content']/form[1]/input[22]")).click();
  }

}

