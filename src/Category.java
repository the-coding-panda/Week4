import java.util.ArrayList;

public class Category {
    private String name;
    private Boolean isRestricted;
    private ArrayList<User> allowedUsers;

    public Boolean getRestricted() {
        return isRestricted;
    }

    public void setRestricted(Boolean restricted) {
        isRestricted = restricted;
    }

    public ArrayList<User> getAllowedUsers() {
        return allowedUsers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addUser(User user){
        this.allowedUsers.add(user);
    }
}
