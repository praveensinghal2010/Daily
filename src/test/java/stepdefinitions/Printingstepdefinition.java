package stepdefinitions;

import io.cucumber.java.en.Given;
import temp1.PrintingTest;

public class Printingstepdefinition {
	@Given("that it is a scenario")
	public void that_it_is_a_scenario() {
		PrintingTest pt= new PrintingTest();
		pt.hellojava();
	}

}
