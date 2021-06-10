package design;

public class User implements UserObserver {
   
   private String name;
   private PostSubject post;
   
   public User(String name){
      this.name=name;
   }
   @Override
   public void update() {
      String txt = (String) post.getUpdate(this);
      if(txt == null){
         System.out.println(name+" -> No new comment received...");
      }else
      System.out.println(name+" --Consuming text-- "+txt);
   }

   @Override
   public void setPost(PostSubject subject) {
      this.post=subject;
   }

}