package models.dto;

public class UserDto {
    
    private String name;
    private String lastname;
    private String[] pronouns;

    public UserDto(){

    }

    public UserDto(
        String name,
        String lastname,
        String[] pronouns
    ){
        this.lastname = lastname;
        this.name = name;
        this.pronouns = pronouns;
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
}
