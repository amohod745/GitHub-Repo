package TestNG_Annotations_keywors;

import org.testng.annotations.Test;

public class TestNG_timeOut {
	@Test(timeOut = 5000)
	public void infiniteloop() {
		for(;;) {
			System.out.println("Hello World");
		}
	}

}
