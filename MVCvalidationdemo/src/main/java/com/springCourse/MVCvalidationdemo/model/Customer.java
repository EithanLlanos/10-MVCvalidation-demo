package com.springCourse.MVCvalidationdemo.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Customer {

    private String firstName;

    @NotBlank(message = "Last name is required.") // Ensures the field is not null, empty, or only whitespace.
    @Size(max = 50, message = "Last name must not exceed 50 characters.") // Limits the length of the last name.
    @Pattern(regexp = "^[A-Za-z '-]+$", message = "Last name can only contain letters, spaces, hyphens, and apostrophes.")
    private String lastName;

    public Customer() {

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
}
