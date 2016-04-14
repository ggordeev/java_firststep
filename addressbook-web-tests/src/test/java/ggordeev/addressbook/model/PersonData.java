package ggordeev.addressbook.model;

/**
 * Created by g.gordeev on 13.04.2016.
 */
public class PersonData {

  private final String firstname;
  private final String lastname;
  private final String addr;
  private final String email;
  private final String mobile;

  public PersonData (String name, String lastname, String addr, String email, String mobile) {
    this.firstname = name;
    this.lastname = lastname;
    this.addr = addr;
    this.email = email;
    this.mobile = mobile;

  }
  public String getfirstname() {
    return firstname;
  }

  public String getlastname() {
    return lastname;
  }

  public String getaddr() {
    return addr;
  }

  public String getemail() {
    return email;
  }

  public String getmobile() {
    return mobile;
  }


}
