package TestNG_Annotations_keywors;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EmaliableReport {

		@Test
		public void googletitel(){
			System.out.println("@Test ---> Google Titel");
			Reporter.log("Running Testcase 1 ---> Google Titel Method");
		}
		@Test
		public void SreachTest() {
			System.out.println("@Test ---> Search Box");
			Reporter.log("Running Testcase 2 ---> Sreach Test Method ");
		}

	}


