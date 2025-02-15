package models.dto;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import models.UserModel;

public class UserDto {

    private String name;
    private String lastname;
    private String[] pronouns;
    private LocalDate birthDate;

    public UserDto(){}

    public UserDto(UserModel user){
        this.name = user.getName();
        this.lastname = user.getLastname();
        this.pronouns = user.getPronouns();
        this.birthDate = user.getBirthDate();
    }

    public UserDto(
        String name,
        String lastname,
        String[] pronouns,
        LocalDate birthDate
    ){
        this.lastname = lastname;
        this.name = name;
        this.pronouns = pronouns;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String[] getPronouns() {
        return pronouns;
    }
    public void setPronouns(String[] pronouns) {
        this.pronouns = pronouns;
    }
    public void setBirthDate(LocalDate birthDate){
        this.birthDate = birthDate;
    }
    public int getDaysUntilBirthday(){

        int birthdayThisYear = this.birthDate.getDayOfYear() - LocalDate.now().getDayOfYear();

        int birthdayNextYear = (int)ChronoUnit.DAYS.between(
            LocalDate.now(), 
            this.birthDate.plusYears(1));

        return this.birthDate.getDayOfYear() > LocalDate.now().getDayOfYear() ?
        birthdayThisYear : birthdayNextYear;
    }
}
