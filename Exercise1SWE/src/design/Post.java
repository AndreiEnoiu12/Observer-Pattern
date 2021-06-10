package design;

import java.util.ArrayList;
import java.util.List;

public class Post implements PostSubject {

   private String comment;
   private boolean modify;
   private List<UserObserver> observers;
   private final Object lock= new Object();
   
   public Post(){
      this.observers=new ArrayList<>();
   }
   
   @Override
   public void register(UserObserver obj) {
      if(obj == null) throw new NullPointerException("Observer is null");
      
      synchronized (lock) {
      if(!observers.contains(obj)) observers.add(obj);     
      }
   }

   @Override
   public void unregister(UserObserver obj) {
      synchronized (lock) {
      observers.remove(obj);
      }
   }
   
   @Override
   public Object getUpdate(UserObserver obj) {
      return this.comment;
   }

   @Override
   public void notifyObservers() {
      List<UserObserver> observersLocal = null;
      //Sync is used to make sure any Observer registered after message is received is not notified
      synchronized (lock) {
         if (!modify)
            return;
         observersLocal = new ArrayList<>(this.observers);
         this.modify=false;
      }
      for (UserObserver obj : observersLocal) {
         obj.update();
      }
   }
   
   //Adds comment in the Post
   public void printComment(String txt){
      System.out.println("Comment added to Post: "+txt);
      this.comment=txt;
      this.modify=true;
      notifyObservers();
   }

}