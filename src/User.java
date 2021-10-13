import java.util.ArrayList;

public class User {
    private String username;
    private String birthday;
    private String location;
    private String occupation;
    private String password;
    private Forum forum;
    private ArrayList<Category> permittedCategories;

    public ArrayList<Category> getPermittedCategories() {
        //check the category is not Restricted
        return permittedCategories;
    }

    public String getBirthday() {
        return birthday;
    }

    public Forum getForum() {
        return forum;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDetails()
    {
        return "";
    }
}
