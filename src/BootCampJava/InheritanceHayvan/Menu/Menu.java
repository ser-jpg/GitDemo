package BootCampJava.InheritanceHayvan.Menu;

public class Menu {
    private String users_name;
    private String password;

    public Menu(String users_name,String password) {
        this.setUsers_name(users_name);
        this.setPassword(password);
    }

    public String getUsers_name() {
        return users_name;
    }

    public void setUsers_name(String users_name) {
        this.users_name = users_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
