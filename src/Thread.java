import java.util.ArrayList;

public class Thread {

    private String title;
    private Category category;
    private ArrayList<Post> posts;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void changeCategory(Category category){
        this.category = category;
    }

    public void addPost(Post post){
        //Check user if in category
        User user = post.getAuthor();

        //Check use
            //user.getPermittedCategories();
            //Check that its in getCategory
            //If its not return some sort of error.

        posts.add(post);
    }
}
