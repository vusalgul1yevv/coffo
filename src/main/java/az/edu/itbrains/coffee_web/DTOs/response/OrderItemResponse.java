package az.edu.itbrains.coffee_web.DTOs.response;

import az.edu.itbrains.coffee_web.entities.MenuItem;
import az.edu.itbrains.coffee_web.entities.Order;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemResponse {
    private Long id;
    private String productName;
    private Order order;
    private Long menuItemId;
    private int quantity;
    private Double price;
    private MenuItem menuItem;
}
