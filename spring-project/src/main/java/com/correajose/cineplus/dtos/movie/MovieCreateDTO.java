package com.correajose.cineplus.dtos.movie;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieCreateDTO {

    @NotBlank(message = "Title cannot be empty")
    private String title;

    @NotBlank(message = "Synopsis cannot be empty")
    private String synopsis;

    @Min(value = 1, message = "Duration must be at least 1 minute")
    private int duration;

    @NotBlank(message = "Genre cannot be empty")
    private String genre;

    @NotBlank(message = "Image URL cannot be empty")
    private String imageUrl;
}
