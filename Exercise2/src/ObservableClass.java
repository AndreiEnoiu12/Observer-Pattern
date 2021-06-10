
import java.util.Observable;

public class ObservableClass extends Observable
{
   private PersonData _person;
   private float _taxPercent;
   
   public ObservableClass(float taxPercent) {
	   _taxPercent = taxPercent;
   }
   
   public void computeTax(PersonData person)
   {
	  _person = person;
	  TaxCalculation taxCalc = new TaxCalculation();
	  taxCalc.addIncome(person.getIncome());
	  taxCalc.setTaxPercent(_taxPercent);
	  person.setIncomeAfterTax(taxCalc.getTax());
	  
      setChanged();
      notifyObservers();
   }
   public String getValue()
   {
	   return 
			   _person.getFullName()
			   + "'s income consisted of " 
			   + _person.getIncome() 
			   + "$, while after the tax of " 
			   + _taxPercent 
			   + "% he lost " 
			   + _person.getIncomeAfterTax() 
			   + "$, and now he has " 
			   + (_person.getIncome() - _person.getIncomeAfterTax())
			   + "$";
   }
}