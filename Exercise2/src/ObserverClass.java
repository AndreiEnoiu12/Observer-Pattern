
import java.util.Observer;
import java.util.Observable;

public class ObserverClass implements Observer
{
   private ObservableClass _obs = null;
   
   public ObserverClass() {}
   
   public void register(Observable obs) {
	   _obs = (ObservableClass) obs;
	   obs.addObserver(this);
   }
   
   public void update(Observable obs, Object obj)
   {
      if (obs == _obs)
      {
         System.out.println(_obs.getValue());
      }
   }
}