Feature: SearchTestScenarioOutline 
 

   Background: 
   User navigates to the ya Engage home page 
      Given I am on the ya home page 


   Scenario Outline: 
      When I click on "<link>"
      Then the browser should display "<result>"
   
    
      Examples: 
         
         | link         | result                     |
         | Our Work     | We create and execute      |
         | Contact      | Let’s connect.             |
         | Careers      | Ready to make a difference |
         


   

