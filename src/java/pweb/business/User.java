package pweb.business;

import java.io.Serializable;

public class User implements Serializable {
    private String codigo;
    private String firstName;
    private String lastName;
    private String email;

    public User() {
        codigo = "";
        firstName = "";
        lastName = "";
        email = "";
    }

    public User(String codigo, String firstName, String lastName, String email) {
        this.codigo = codigo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

        public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
