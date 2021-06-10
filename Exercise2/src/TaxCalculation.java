
public class TaxCalculation {
	private float _income;
	private float _taxPercent;
	
	public TaxCalculation() {}
	
	public float getTax() {
		if (_taxPercent != 0 && _income != 0) {
			float percentToFloat = _taxPercent / 100;
			return _income * percentToFloat;
		}
		return -1;	
	}
	
	public void addIncome(float income) {
		_income = income;
	}
	
	public void setTaxPercent(float taxPercent) {
		_taxPercent = taxPercent;
	}
}