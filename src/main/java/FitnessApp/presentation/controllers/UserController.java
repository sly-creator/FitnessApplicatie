package FitnessApp.presentation.controllers;

import FitnessApp.application.UserService;
import FitnessApp.domain.User;
import FitnessApp.presentation.dto.Login;
import FitnessApp.presentation.dto.LoginResponse;
import FitnessApp.presentation.dto.Registration;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }



    @PostMapping("/register")
    public void Register(@Validated @RequestBody Registration registration){
        userService.createUser(registration.name, registration.email, registration.password);
    }


    @PostMapping("/login")
    public LoginResponse Login(@Validated @RequestBody Login login) {
        User user = userService.login(login.email, login.password);
        return new LoginResponse(String.valueOf(user.id));

    }

    @PostMapping("/update")
    public void Update(@Validated @RequestBody Registration registration){
        User user = userService.findUserByEmail(registration.email);
        user.setName(registration.name);
        user.setEmail(registration.email);
        user.setPassword(registration.password);
        userService.updateUser(user);
    }
}
