package Polymorphism;

public class Maruti extends Car{

	@Override
	public void Star() {
         System.out.println("Maruti  --  Start");		
	}
	@Override
	public void Stop() {
        System.out.println("Maruti  --  Stop");
		
	}
	@Override
	public void Refule() {
        System.out.println("Maruti  --  Refule");
		
	}
	public static void main(String[] args) {
          
		Maruti M = new Maruti();
		M.ThefSafety();
		M.Star();
		M.Stop();
		M.Refule();
		
		Car C = new Car();
		C.Star();
		C.Stop();
		C.Refule();
		
	}
	public void Start() {
		System.out.println("Maturi Car  --  Start");
	}
    public void ThefSafety() {
    	System.out.println("Maruti Car  --  Thefsafety");
    	
    }
}
