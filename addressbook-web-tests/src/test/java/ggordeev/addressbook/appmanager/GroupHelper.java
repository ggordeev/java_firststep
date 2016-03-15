package ggordeev.addressbook.appmanager;

import ggordeev.addressbook.model.GroupCreationData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by g.gordeev on 03.03.2016.
 */
public class GroupHelper extends HelperBase {

  public GroupHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void returntoGroupCreation() {
    click(By.linkText("group page"));
  }

  public void submitGroupCreation() {
    click(By.name("submit"));
  }

  public void fillGroupForm(GroupCreationData groupData) {
    type(By.name("group_name"), groupData.getName());
    type(By.name("group_header"), groupData.getHeader());
    type(By.name("group_footer"), groupData.getFooter());
  }

  public void initGroupCreation() {
    click(By.name("new"));
  }

  public void deleteSelectedGroups() {
    click(By.xpath("//div[@id='content']/form/input[5]"));
  }

  public void selectGroup() {
    click(By.name("selected[]"));
  }
}
