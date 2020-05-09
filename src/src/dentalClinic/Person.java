package dentalClinic;

public class Person {
    String firstName;
    String lastName;
    String socialSecurityNumber;
    String birthDate;
    String address;
    String telNumber;


    public Person() {
    }

    public Person(String firstName, String lastName, String socialSecurityNumber, String birthDate, String address, String telNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDate = birthDate;
        this.address = address;
        this.telNumber = telNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public String getTelNumber() {
        return telNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setTelNumber(String telNumber) {
        this.telNumber = telNumber;
    }

}
