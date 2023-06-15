package com.tddsample.tddsample.rest;


import com.tddsample.tddsample.models.UsersEntity;
import com.tddsample.tddsample.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/client")
public class UsercController {

    @Autowired
     private UserService userService;

    @GetMapping("/{idSexe}/client")
    private Set<UsersEntity> findAllUser(@PathVariable("idSexe") Long idSexe){
      return   userService.findUser(idSexe);

    }

    @GetMapping("/{idUser}")
    private Optional<UsersEntity> findUserById(@PathVariable("idUser") int id){
        return userService.findUserById(id);
    }

    @PostMapping("/{idSex}/user")
    public Long createUser(@PathVariable("idSex") Long idSex, @RequestBody UsersEntity usersEntity){
        return userService.createUser(usersEntity, idSex);
    }



    @PostMapping("/save")
    public void addUser(@RequestBody UsersEntity usersEntity){
        userService.addUser(usersEntity);
    }


}
