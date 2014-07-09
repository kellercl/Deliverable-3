import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.Then;

import static org.junit.Assert.assertEquals;

// USER SCENARIO 1
// Scenario 1.1: Empty Line

private String_emptyLine;

@Given (“there are (0) customers ahead of me$”)
public void setCustomerLine(Integer cust) {
_customers = cust;
}

private String_output;

@When (“I enter the bank$”)
public void runLinkedList() {
	ll = new LinkedList(_customers);
	output = ll.run();
}

@Then (“^I should be given the first available number to be served \”([^\”]*)\”$”)
public void theNumberServed(Integer expected) {
	assertEquals(expected, output);
}

Scenario 1.2: 1 Customer in line

private Customer_in_line;

@Given (“there are (1) customers ahead of me$”)
public void setCustomerLine(Integer cust) {
_customers = cust;
}

private String_output;

@When (“I enter the bank$”)
public void runLinkedList() {
	ll = new LinkedList(_customers);
	output = ll.run();
}

@Then (“^I should be given the second available number to be served \”([^\”]*)\”$”)
public void theNumberServed(Integer expected) {
	assertEquals(expected, output);
}

Scenario 1.3: 99 Customer in line

private ManyCustomers;

@Given (“there are (99) customers ahead of me$”)
public void setCustomerLine(Integer cust) {
_customers = cust;
}

private String_output;

@When (“I enter the bank$”)
public void runLinkedList() {
	ll = new LinkedList(_customers);
	output = ll.run();
}

@Then (“^I should be given the ninety-ninth available number to be served \”([^\”]*)\”$”)
public void theNumberServed(Integer expected) {
	assertEquals(expected, output);
}

Scenario 2.1:

private OneCustomerLess;

@Given (“there are (1) customers ahead of me$”)
public void setCustomerLine(Integer cust) {
_customers = cust;
}

private String_output;

@When (“The customer leaves$”)
public void runLinkedList() {
	ll = new LinkedList(_customers);
	output = ll.run();
}

@Then (“^I should be served by my original number minus 1 \”([^\”]*)\”$”)
public void theNumberServed(Integer expected) {
	assertEquals(expected, output);
}

Scenario 2.2:

private TwoCustomerLess;

@Given (“there are (5) customers ahead of me$”)
public void setCustomerLine(Integer cust) {
_customers = cust;
}

private String_output;

@When (“The customer leaves$”)
public void runLinkedList() {
	ll = new LinkedList(_customers);
	output = ll.run();
}

@Then (“^I should be served by my original number minus 2 \”([^\”]*)\”$”)
public void theNumberServed(Integer expected) {
	assertEquals(expected, output);
}

Scenario 2.3:

private NinteenCustomerLess;

@Given (“there are (100) customers ahead of me$”)
public void setCustomerLine(Integer cust) {
_customers = cust;
}

private String_output;

@When (“The customer leaves$”)
public void runLinkedList() {
	ll = new LinkedList(_customers);
	output = ll.run();
}

@Then (“^I should be served by my original number minus 19 \”([^\”]*)\”$”)
public void theNumberServed(Integer expected) {
	assertEquals(expected, output);
}

Scenario 2.4:

private OneHundredCustomersLess;

@Given (“there are (100) customers ahead of me$”)
public void setCustomerLine(Integer cust) {
_customers = cust;
}

private String_output;

@When (“The customer leaves$”)
public void runLinkedList() {
	ll = new LinkedList(_customers);
	output = ll.run();
}

@Then (“^I should be served by my original number minus 100 \”([^\”]*)\”$”)
public void theNumberServed(Integer expected) {
	assertEquals(expected, output);
}

// USER STORY 3
// Scenario 3.1:

private OneNewCustomer;

@Given (“there are (1) customers ahead of me$”)
public void setCustomerLine(Integer cust) {
_customers = cust;
}

private String_output;

@When (“The customer enters$”)
public void runLinkedList() {
	ll = new LinkedList(_customers);
	output = ll.run();
}

@Then (“^They should be served by my original number plus 1 \”([^\”]*)\”$”)
public void theNumberServed(Integer expected) {
	assertEquals(expected, output);
}

//Scenario 3.2
private TwoNewCustomer;

@Given (“there are (2) customers ahead of me$”)
public void setCustomerLine(Integer cust) {
_customers = cust;
}

private String_output;

@When (“The customer enters$”)
public void runLinkedList() {
	ll = new LinkedList(_customers);
	output = ll.run();
}

@Then (“^They should be served by my original number plus 1 for the order each customer arrived\”([^\”]*)\”$”)
public void theNumberServed(Integer expected) {
	assertEquals(expected, output);
}

//Scenario 3.3
private OneHundredNewCustomer;

@Given (“there are (100) customers ahead of me$”)
public void setCustomerLine(Integer cust) {
_customers = cust;
}

private String_output;

@When (“The customer enters$”)
public void runLinkedList() {
	ll = new LinkedList(_customers);
	output = ll.run();
}

@Then (“^They should be served by my original number plus 1 for the order each customer arrived \”([^\”]*)\”$”)
public void theNumberServed(Integer expected) {
	assertEquals(expected, output);
}
