import java.util.ArrayList;

public class Forum {
    private String name;
    private Boolean loginRequired;
    private ArrayList<Thread> threads;
    private ArrayList<User> registeredUsers;

    public Boolean getLoginRequired() {
        return loginRequired;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<User> getRegisteredUsers(){
        return registeredUsers;
    }

    public void setLoginRequired(Boolean loginRequired) {
        this.loginRequired = loginRequired;
    }

    public void registerUser(String username, String password) {
    }

    public void removeUser(User userToRemove){
    }

    public void createNewThread(String title) {
    }

    public ArrayList<Thread> showThreads(ArrayList<Category> userCategories){
        //Filtered by category
        return threads;
    }
}
