package com.zed.DocumentSharing.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.zed.DocumentSharing.Model.User;
import com.zed.DocumentSharing.Repository.UserRepository;
import lombok.RequiredArgsConstructor;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {
    private final UserRepository userRepository;
    
    @PostMapping("/create")
    public User createUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping()
    public List<User> getUsers( ) {
        return userRepository.findAll();
    }

    @GetMapping("/{email}")
    public Optional<User> getByEmail(@PathVariable String email) {
        return userRepository.findByEmail(email);
    }
    
    
}
