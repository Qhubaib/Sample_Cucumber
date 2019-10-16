Feature: Facebook Login Feature with DataTable Maps

Scenario: Facebook Login Validation Test scenario with Data Table Maps

Given User is able to Launch the browser
Then User Enters the facebook URL
And User Enters the Username and Password 
#Here the below top row use as a key while under it used as value
|Username             | Password   |
|qhubaib786@gmail.com | 786qhubaib |
Then Click on Login Button
But Validate the user in facebook homepage