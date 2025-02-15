package models;

import java.time.LocalDate;

public class UserModel {
    private long id;
    private String name;
    private String lastname;
    private String username;
    private String[] pronouns;
    private LocalDate userCreationDate;
    private LocalDate birthDate;

    public UserModel(){}

    public UserModel(long id,
                        String name,
                        String lastname,
                        String username,
                        String[] pronouns,
                        LocalDate userCreationDate,
                        LocalDate birthDate){
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.username = username;
        this.pronouns = pronouns;
        this.birthDate = birthDate;
        this.userCreationDate = userCreationDate;
    }

    public long getId(){
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return this.lastname;
    }
    public void setLastname(String lastName) {
        this.lastname = lastName;
    }
    public String getUsername() {
        return this.username;
    }
    public void setUsername(String userName) {
        this.username = userName;
    }
    public void setPronouns(String[] pronouns){
        this.pronouns = pronouns;
    }
    public String[] getPronouns(){
        return this.pronouns;
    }
    public void setUserCreationDate(LocalDate userCreationDate){
        this.userCreationDate = userCreationDate;
    }
    public LocalDate getUserCreationDate(){
        return this.userCreationDate;
    }
    public void setBirthDate(LocalDate birthDate){
        this.birthDate = birthDate;
    }
    public LocalDate getBirthDate(){
        return this.birthDate;
    }
}
