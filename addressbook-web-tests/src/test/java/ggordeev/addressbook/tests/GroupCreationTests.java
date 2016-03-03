package ggordeev.addressbook.tests;

import ggordeev.addressbook.model.GroupCreationData;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {


  @Test
  public void testGroupCreation() {

    app.gotoGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupCreationData("test1", "test2", "test3"));
    app.submitGroupCreation();
    app.returntoGroupCreation();
  }

}
