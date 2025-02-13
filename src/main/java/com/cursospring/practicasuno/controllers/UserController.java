package com.cursospring.practicasuno.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import models.UserModel;

//utilizando la annotation @Controller se puede devolver json de igual forma, 
//si al método se le agrega @ResponseBody
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/profile")
    public Map<String, Object> getProfile() {
        Map<String,Object> map = new HashMap<>();
        UserModel user = new UserModel();

        map.put("object1", "primer object");
        map.put("user", user);

        return map;
    }
    
}
