package design;

public interface PostSubject {

   //Used for registering Observers
   public void register(UserObserver obj);
   
  //Used for unregistering Observers
   public void unregister(UserObserver obj);
    
   //Get method for updates from the Subject
   public Object getUpdate(UserObserver obj);
    
   //Notifies Observers of occurred change
   public void notifyObservers();
   
   
}