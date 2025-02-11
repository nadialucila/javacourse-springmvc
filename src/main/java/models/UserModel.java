package models;

public class UserModel {
    private long id;
    private String name;
    private String lastname;
    private String username;

    public UserModel(long id,
                        String name,
                        String lastname,
                        String username){
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.username = username;
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
}
