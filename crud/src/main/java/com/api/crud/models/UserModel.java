package com.api.crud.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Table(name="users")
public class UserModel {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    @Column
    @NotBlank
    private String firstName;

    @Column
    @NotBlank
    private String lastName;

    @Column
    @NotEmpty
    @Email
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
