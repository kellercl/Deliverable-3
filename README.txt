












INFSCI 2955 - DELIVERABLE 3: Systems Testing with BDD
Linked List – Java Test
Dan Crogan
Corey Keller



























SUMMARY:



DESCRIPTION:

Issues faced with testing
Tests that failed


USER STORY 1: 

As a bank customer
I want to be given a sorted number
So that I am served in the order I entered the bank

Feature 1: Distribute sorted numbers

Scenario 1.1: Empty Line
Given there is 0 customers ahead of me
And I have a transaction ready
When I enter the bank
Then I should be given the first available number to be served

Scenario 1.2: 1 Customer in line
Given there is 1 customers ahead of me
And I have a transaction ready
When I enter the bank
Then I should be given the second available number to be served

Scenario 1.3: 99 Customers in line
Given there are 99 customers ahead of me
And I have a transaction ready
When I enter the bank
Then I should be given the ninety-ninth available number to be served


USER STORY 2: 

As a bank customer
I want to be served in the order I came in
So that when customers ahead of me remove themselves from the line I am served by my original number minus 1

Feature 2: Customers leaving before being served

Scenario 2.1: 
Given there is 1 customer ahead of me
And that customer leaves before being served
When the customer leaves
Then I should be served by my original number minus 1

Scenario 2.2: 
Given there is 5 customer ahead of me
And 2 customers leaves before being served
When those customer leave
Then I should be served by my original number minus 2

Scenario 2.3: 
Given there is 100 customer ahead of me
And 19 customers leave before being served
When those customer leave
Then I should be served by my original number minus 19

Scenario 2.4: 
Given there is 100 customer ahead of me
And 100 customers leave before being served
When those customer leave
Then I should be served by my original number minus 100


USER STORY 3: 

As a bank customer
I want to be served in the order I came in
So that when customers enter the bank after me
They are served and listed after me in a first in, first out methodology

Feature 3: Customers added to the list

Scenario 3.1: 
Given 1 customer enters after me
When the customer enter
Then they should be served by my original number plus 1

Scenario 3.2: 
Given 2 customers enter after me
When those customers enter
Then they should be served by my original number plus 1 for the order each customer arrived

Scenario 3.3: 
Given 100 customers enter after me
When those customers enter
Then they should be served by my original number plus 1 for the order each customer arrived


Step Directions

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.Then;

import static org.junit.Assert.assertEquals;

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
