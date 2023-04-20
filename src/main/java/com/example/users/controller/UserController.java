package com.example.users.controller;


import com.example.users.exceptions.ErrorDetails;
import com.example.users.exceptions.GlobalExceptionHandler;
import com.example.users.model.User;
import com.example.users.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping("/create")
    public ResponseEntity<?> createUser(@Valid @RequestBody User user) throws GlobalExceptionHandler {
         //   try{
                return ResponseEntity.status(HttpStatus.OK).body(repository.save(user));
      /*      }catch(DataAccessException e){
                ErrorDetails error = new ErrorDetails("El correo ya registrado");
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
            }*/
    }

    @GetMapping("/all")
    public List<User> allUser(){
        return repository.findAll();
    }

}
