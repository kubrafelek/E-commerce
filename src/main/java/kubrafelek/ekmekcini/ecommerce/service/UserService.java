package kubrafelek.ekmekcini.ecommerce.service;

import kubrafelek.ekmekcini.ecommerce.dto.UserDTO;
import kubrafelek.ekmekcini.ecommerce.model.User;
import kubrafelek.ekmekcini.ecommerce.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public Optional<User> getAllUsers(){
        return userRepository.listAllUsers();
    }

}
