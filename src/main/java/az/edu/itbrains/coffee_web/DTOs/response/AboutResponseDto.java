package az.edu.itbrains.coffee_web.DTOs.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AboutResponseDto {
    private Long id;
    private String title;
    private String subtitle;
    private String description;
    private String imageUrl;
}
