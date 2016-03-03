package ggordeev.addressbook.model;

public class AddNewPersonData {
  private final String firstname;
  private final String initials;
  private final String lastname;
  private final String address;
  private final String tel;
  private final String email;
  private final String year;

  public AddNewPersonData(String firstname, String initials, String lastname, String address, String tel, String email, String year) {
    this.firstname = firstname;
    this.initials = initials;
    this.lastname = lastname;
    this.address = address;
    this.tel = tel;
    this.email = email;
    this.year = year;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getInitials() {
    return initials;
  }

  public String getLastname() {
    return lastname;
  }

  public String getAddress() {
    return address;
  }

  public String getTel() {
    return tel;
  }

  public String getEmail() {
    return email;
  }

  public String getYear() {
    return year;
  }
}
