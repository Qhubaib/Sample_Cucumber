Feature: Hooks Concept Understanding Feature 

@First 
Scenario: Hooks Concept Test scenario 
	Given Enter into gmail Application 
	When Click on gmail Compose Button 
	Then Perform compose validation 
	
@Second 
Scenario: Hooks concept Test Scenario2 
	Given Enter into gmail Application 2 
	When Click on gmail Inbox Link 
	Then Perform Inbox Link validation 
	
@Third 
Scenario Outline: Hooks concept Test scenario outline Process 
	Given Enter into gmail Application 3 
	When Enter the data as "<name>" in search text box 
	Then click on search button 
	
	Examples: 
		|		name	   |
		|Syed Qhubaib Ahmed|
		
		
		
		
