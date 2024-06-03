package FitnessApp.presentation.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


public class Login {
    @Size(min = 6)
    public String password;
    @NotBlank
    public String email;
}
