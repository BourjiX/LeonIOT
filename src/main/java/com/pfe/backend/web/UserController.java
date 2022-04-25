package com.pfe.backend.web;

import com.pfe.backend.services.UserService;
import com.pfe.backend.services.model.UserDTO;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/user-resources")
@Tag(name = "User Resource")
public class UserController {
    private final UserService userService;
    @PostMapping("/add")
    public ResponseEntity<UserDTO> add(@RequestBody final UserDTO userDTO) {
        return ResponseEntity.ok(userService.add(userDTO));
    }
    @GetMapping("/all")
    public ResponseEntity<List<UserDTO>> findAll(){
        return ResponseEntity.ok(userService.findAll());
    }
    @GetMapping("/findbyemail/{email}")
    public ResponseEntity<UserDTO> findByEmail(@PathVariable final String email){
        return ResponseEntity.ok(userService.findByEmail(email));
    }

    @DeleteMapping ("/delete")
    public ResponseEntity<Void> deleteById(@RequestBody final  long id){
        userService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
