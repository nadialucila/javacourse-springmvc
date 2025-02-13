package models.dto;

import java.util.Date;

public class UserDto {

    private String name;
    private String lastname;
    private String[] pronouns;
    private Date birthDate;

    public UserDto(){

    }

    public UserDto(
        String name,
        String lastname,
        String[] pronouns,
        Date birthDate
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
    public void setBirthDate(Date birthDate){
        this.birthDate = birthDate;
    }
    public int getDaysUntilBirthday(){
        
        
        return 1;
    }
}
