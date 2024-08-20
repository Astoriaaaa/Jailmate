package practice.demo.domain;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
@Component
public class User {
    public String Email;

    public String Surname;

    @Id
    public String Username;

    public String Password;

    public User() {

    }

    public User(String Surname, String LastName, String Username, String Password, String Email) {
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

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
}
