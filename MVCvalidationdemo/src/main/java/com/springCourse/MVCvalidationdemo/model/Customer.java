package com.springCourse.MVCvalidationdemo.model;

import com.springCourse.MVCvalidationdemo.validation.CourseCode;
import jakarta.validation.constraints.*;

public class Customer {

    private String firstName;

    //    Make lastName needed and with a minimum of 1 length
    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName;

    @NotNull(message = "is required")
    @Min(value = 0, message = "must be greater or equal than 0")
    @Max(value = 10, message = "must be lower or equal than 10")
    private Integer freePasses;

    @Pattern(regexp = "^[a-zA-z0-9]{5}", message = "only 5 chars/digits")
    private String postalCode;


    @NotBlank(message = "must not be blank")
    @Size(min = 5, message = "must be greater or equal than 5")
    @CourseCode(value = "luv-", message = "must start with \"luv-\"")
    private String courseCode;

    public Customer() {

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public @NotNull(message = "is required") @Size(min = 1, message = "is required") String getLastName() {
        return lastName;
    }

    public void setLastName(@NotNull(message = "is required") @Size(min = 1, message = "is required") String lastName) {
        this.lastName = lastName;
    }

    @Min(value = 0, message = "must be greater or equal than 0")
    @Max(value = 10, message = "must be lower or equal than 10")
    public Integer getFreePasses() {
        return freePasses;
    }

    public void setFreePasses(@Min(value = 0, message = "must be greater or equal than 0") @Max(value = 10, message = "must be lower or equal than 10") Integer freePasses) {
        this.freePasses = freePasses;
    }

    public @Pattern(regexp = "^[a-zA-z0-9]{5}", message = "only 5 chars/digits") String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(@Pattern(regexp = "^[a-zA-z0-9]{5}", message = "only 5 chars/digits") String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
}
