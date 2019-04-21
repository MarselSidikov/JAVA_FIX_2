package ru.fix.service.forms;

import lombok.Data;

@Data
public class SignUpForm {
    private String firstName;
    private String lastName;

    private String email;
    private String password;
}