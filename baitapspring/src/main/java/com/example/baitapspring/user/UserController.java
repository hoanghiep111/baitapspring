package com.example.baitapspring.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/users")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    //get list users
    @GetMapping("")
    // this request is: http://localhost:8080/api/users
    public List<User> getUsers() {
       return userRepository.findAll();
    }

    // get detail user
    @GetMapping("/{id}")
    Optional<User> findById(@PathVariable Long id){
        return userRepository.findById(id);
    }

    //insert new User with POST
    @PostMapping("/insert")
    public User addUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    // update user
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User user) {
        return userRepository.save(user);
    }

    // delete user
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
         userRepository.deleteById(id);
        return "Deleted successfully" ;
    }
}
