package ggordeev.addressbook.tests;

import ggordeev.addressbook.model.GroupData;
import org.testng.annotations.Test;


public class GroupModificationTests extends TestBase {

    @Test
    public void testModification() {

        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("test111", "test222", "test333"));
        app.getGroupHelper().submitGroupUpdate();
        app.getGroupHelper().returntoGroupCreation();
    }




}
