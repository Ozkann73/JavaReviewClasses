package reviewclass11;

public class FacebookUser {
  private String firstName;
  private String lastName;
  private String userName;
  private String password;

  public FacebookUser(String firstName,String lastName, String userName, String password) {
    this.firstName=firstName;
    this.lastName = lastName;
    this.userName = userName;
    this.password = password;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public String toString() {
    return "FacebookUser{" +
            "firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            ", userName='" + userName + '\'' +
            ", password='" + password + '\'' +
            '}';
  }
}
