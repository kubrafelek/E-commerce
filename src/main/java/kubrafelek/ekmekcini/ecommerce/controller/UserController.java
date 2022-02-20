package kubrafelek.ekmekcini.ecommerce.controller;

import kubrafelek.ekmekcini.ecommerce.model.User;
import kubrafelek.ekmekcini.ecommerce.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping("/listAllUsers")
    public ResponseEntity<User> getAllUsers(){
        Optional<User> resultOptional =  userService.getAllUsers();
        return resultOptional.map(user -> new ResponseEntity<>(user, HttpStatus.OK)).orElseGet(()
                -> new ResponseEntity<>(resultOptional.get(), HttpStatus.BAD_REQUEST));
    }
}
