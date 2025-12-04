package az.edu.itbrains.coffee_web.DTOs.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContactRequestDto {
    private String name;
    private String email;
    private String phoneNumber;
    private String message;
}
