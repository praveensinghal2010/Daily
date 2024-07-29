package stepdefinitions;

import java.net.MalformedURLException;

import io.cucumber.java.en.Given;
import temp1.PrintingTest;

public class Printingstepdefinition {
	@Given("that it is a scenario")
	public void that_it_is_a_scenario() throws MalformedURLException {
		PrintingTest pt= new PrintingTest();
		pt.hellojava();
	}

}
