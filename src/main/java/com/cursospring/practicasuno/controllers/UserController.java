package com.cursospring.practicasuno.controllers;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import models.UserModel;
import models.dto.UserDto;

//utilizando la annotation @Controller se puede devolver json de igual forma, 
//si al método se le agrega @ResponseBody
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/profile")
    public UserDto getProfile() {
        UserModel user = new UserModel(
            1234,
            "Nadia",
            "Bergara",
            "naanuu",
            new String[]{"Ella"},
            LocalDate.now(),
            LocalDate.of(1999, 11, 29));

        return new UserDto(user);
    }

    @GetMapping("/birthday-countdown")
    public Map<String, String> getBirthdayCountdown() {

        Map<String, String> response = new HashMap<>();

        UserModel user = new UserModel(
            1234,
            "Nadia",
            "Bergara",
            "naanuu",
            new String[]{"Ella"},
            LocalDate.now(),
            LocalDate.of(1999, 1, 29));

        UserDto userDto = new UserDto(user);

        response.put("Days until birthday!", "" + userDto.getDaysUntilBirthday() + "");

        return response;
    }
}
