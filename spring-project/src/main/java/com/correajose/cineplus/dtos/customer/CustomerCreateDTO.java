package com.correajose.cineplus.dtos.customer;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerCreateDTO {

    @NotBlank(message = "Name cannot be empty")
    private String name;

    @NotBlank(message = "Last name cannot be empty")
    private String lastName;

    @NotBlank(message = "Phone cannot be empty")
    /* Añadir patron telefono*/
    private String phone;

    @NotBlank(message = "Email cannot be empty")
    @Email(message = "Invalid email format")

    private String email;

    @NotBlank(message = "Password cannot be empty")
    private String password;
}
