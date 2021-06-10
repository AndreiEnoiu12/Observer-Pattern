
import java.util.ArrayList;

public class TEST_CLASS
{
   public static void main(String [] args)
   {
	   float TAX_PERCENT = 38.5f;
	   ObservableClass observableClass = new ObservableClass(TAX_PERCENT);
	   ObserverClass observerConsole = new ObserverClass();
	   observerConsole.register(observableClass);
	   
	   ArrayList<PersonData> personList = new ArrayList<>();
	   personList.add(new PersonData("Bob", "Ross", 25000.0f));
	   personList.add(new PersonData("John", "Richardson", 56542.2f));
	   personList.add(new PersonData("Joseph", "Walker", 123453.6f));
	   
	   int index = 0;
	   while(index < personList.size()) {
		    long millis = System.currentTimeMillis();
		    observableClass.computeTax(personList.get(index));
		    index++;
		    try {
				Thread.sleep(2000 - millis % 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
   }
}