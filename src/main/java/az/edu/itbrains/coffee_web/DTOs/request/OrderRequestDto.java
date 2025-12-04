package az.edu.itbrains.coffee_web.DTOs.request;

import az.edu.itbrains.coffee_web.entities.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderRequestDto {
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    private String customerAddress;
    private LocalDateTime orderDate;
    private Double totalPrice;
    private User user;
}
