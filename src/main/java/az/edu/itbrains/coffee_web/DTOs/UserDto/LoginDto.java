package az.edu.itbrains.coffee_web.DTOs.UserDto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class LoginDto {
    @NotEmpty(message = "Email field cannot be empty")
    @Email(message = "Please enter correct email address")
    private String email;

    @NotEmpty(message = "Password field cannot be empty")
    @Size(min = 6, message = "Password must be 6 symbol minimum.")
    private String password;
}
