Feature: Facebook Login Feature with Examples Keyword

Scenario Outline: Facebook Login Validation Test scenario with Examples Keyword

Given User is able to Launch the browser
Then User Enters the facebook URL
And User Enters the Username as "<username>" and Password as "<password>"
Then Click on Login Button
But Validate the user in facebook homepage

Examples:
		|     username       | password |
		|qhubaib786@gmail.com|786qhubaib|
		|		syed		 |     ahmed|