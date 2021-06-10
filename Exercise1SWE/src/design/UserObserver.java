package design;

public interface UserObserver {
   
   //Updates the Observer (used by Subject)
   public void update();
   
   
   //Sets the Subject to observe
   public void setPost(PostSubject sub);
}