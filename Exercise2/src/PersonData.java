
public class PersonData {
	private String _name;
	private String _surname;
	private float _income;
	private float _incomeAfterTax;
	
	public PersonData(String name, String surname, float income) {
		_name = name;
		_surname = surname;
		_income = income;
	}
	
	public String getFullName() {
		return _name + " " + _surname;
	}
	
	public float getIncome() {
		return _income;
	}
	
	public void setIncomeAfterTax(float incomeAfterTax) {
		_incomeAfterTax = incomeAfterTax;
	}
	
	public float getIncomeAfterTax() {
		return _incomeAfterTax;
	}
}