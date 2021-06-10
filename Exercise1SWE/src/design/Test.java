package design;

public class Test {

   public static void main(String[] args) {
      
      //Creating a Subject (post)
      Post post = new Post();
      
      //Creating Observers (users)
      UserObserver user1 = new User("Andrei");
      UserObserver user2 = new User("Nicolae");
      
      //Register the Observers to the Subject
      post.register(user1);
      post.register(user2);
      
      //Attach the Observer to Subject
      user1.setPost(post);
      user2.setPost(post);
      
      //Check for available update
      user1.update();
      
      System.out.println("");
      
      //Send comment to subject
      post.printComment("Hello from Horsens!");
      
      System.out.println("");
      
      //Adding a new user
      UserObserver user3 = new User("Kashima");
      post.register(user3);
      user3.setPost(post);
      user3.update();
  
      //Adding a new comment
      System.out.println("");
      post.printComment("Hello from Mars!");
      
   }

}