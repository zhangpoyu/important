package entity;

import java.util.Arrays;

public class User {
    private String username;
    private String password;
    private String[] habits;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String[] getHabits() {
        return habits;
    }
    public void setHabits(String[] habits) {
        this.habits = habits;
    }
    @Override
    public String toString() {
        return "User [username=" + username + ", password=" + password + ", habits=" + Arrays.toString(habits) + "]";
    }
}
