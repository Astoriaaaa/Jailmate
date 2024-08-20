package practice.demo.domain.dto;

public class UserDto {
    public String Email;

    public String Surname;

    public String Username;

    public String Password;

    public UserDto() {

    }

    public UserDto(String Surname, String LastName, String Username, String Password, String Email) {
        this.Surname = Surname;
        this.Username = Username;
        this.Password = Password;
        this.Email = Email;
    }

    public String getSurname() {
        return this.Surname;
    }


    public String getUsername() {
        return this.Username;
    }

    public String getPassword() {
        return this.Password;
    }

    public String getEmail() {
        return this.Email;
    }

    public void setSurname(String Surname) {
        this.Surname = Surname;
    }


    public void setUsername(String Username) {
        this.Username = Username;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

}
