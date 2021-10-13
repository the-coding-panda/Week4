public class Post {

    public Post(String text, User author){
        setText(this.text);
        this.author = author;
    }

    private String text;
    private User author;
    private Thread thread;

    public Thread getThread() {
        return thread;
    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    public String getText() {
        return text;
    }

    public User getAuthor(){
        return author;
    }

    public void setText(String text) {
        if (text.length() > 0){
            this.text = text;
        }
        else{
            throw new IllegalArgumentException("Post text too short");
        }
    }

    public String quote(){
        return getText();
    }
}
