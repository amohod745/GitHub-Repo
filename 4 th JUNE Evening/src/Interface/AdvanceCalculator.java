package Interface;

public class AdvanceCalculator implements Calculator , Casio{
	
	   public void sin() {
		   System.out.println("I am in sin method from AdvanceCalculator");
	   }
	   public void cos() {
		   System.out.println("I am in cos method from AdvanceCalculator");
	   }
	   
	@Override
	public void addition() {
          System.out.println("I am in addition method from Calculator");		
	}
	@Override
	public void substraction() {
          System.out.println("I am in substraction method from Calculator");		
	}
	@Override
	public void multiplication() {
          System.out.println("I am in multiplication method from Calculator");		
	}
	@Override
	public void log() {
          System.out.println("I am in log method from casio");		
	}
	@Override
	public void tan() {
          System.out.println("I am in tan method from casio");		
	}
	public static void main(String[] args) {
        
		AdvanceCalculator ADC = new AdvanceCalculator();
		System.out.println(x);
		ADC.addition();
		ADC.substraction();
		ADC.multiplication();
		ADC.sin();
		ADC.cos();
		ADC.tan();
		ADC.log();
	}

}
