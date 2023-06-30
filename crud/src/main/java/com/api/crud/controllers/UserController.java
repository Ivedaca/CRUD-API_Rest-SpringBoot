package com.api.crud.controllers;

import com.api.crud.models.UserModel;
import com.api.crud.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/user")    //tambien se puede definir en application.properties
public class UserController {

    @Autowired                    //Permite inyectar dependencias
    private UserService userService;

    @GetMapping
    public ArrayList<UserModel> getUsers(){
        return this.userService.getUsers();
    }

    @PostMapping
    public UserModel saveUser(@RequestBody UserModel user) {   //@RequestBody notacion para enviar algo en la ruta
            return this.userService.saveUser(user);
    }

    @GetMapping(path = "/{id}")
    public Optional<UserModel> getUserById(@PathVariable("id") Long id){
        return this.userService.getById(id);
    }

    @PutMapping(path = "/{id}")
    public UserModel updateUserById(@RequestBody UserModel request, @PathVariable("id") Long id){
            return this.userService.updateById(request, id);
    }

    @DeleteMapping(path = "/{id}")
    public String deleteById(@PathVariable("id") Long id){
        boolean ok = this.userService.deleteUser(id);

        if(ok){
            return "User with id " + id + " deleted!";
        }else{
            return "Error, user with id " + id + "was not deleted!";
        }
    }
}
