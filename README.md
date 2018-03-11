![selenium-cucumber-gherkin](https://www.agiletrailblazers.com/hs-fs/hubfs/blog-files/selenium-cucumber-gherkin-gears.png?width=300&name=selenium-cucumber-gherkin-gears.png)



This app uses Selenium, Cucumber, and Gherkin to verify that links are working on the YA Engage homepage.


###  Tools:

_**Selenium:**_

"Selenium is a portable software-testing framework for web applications."

https://en.wikipedia.org/wiki/Selenium_(software)

_**Cucumber:**_

"Cucumber is a software tool used by computer programmers for testing other software.[7] It runs automated acceptance tests written in a behavior-driven development (BDD) style.[8] Central to the Cucumber BDD approach is its plain language parser called Gherkin. It allows expected software behaviors to be specified in a logical language that customers can understand. As such, Cucumber allows the execution of feature documentation written in business-facing text."

https://en.wikipedia.org/wiki/Cucumber_(software)

_**Gherkin:**_

"Gherkin is the language that Cucumber uses to define test cases. It is designed to be non-technical and human readable, and collectively describes use cases relating to a software system.[13][14] The purpose behind Gherkin's syntax is to promote Behavior Driven Development practices across an entire development team, including business analysts and managers."

https://en.wikipedia.org/wiki/Cucumber_(software)#Gherkin_language

### Functions:

The yaEngageSeleniumCucumberGherkin app reads and implements the following Gherkin instructions:

<code>
  Feature: SearchTestScenarioOutline 
  </code> 
<code>
   Background: 
   User navigates to the ya Engage home page 
 </code>
 <code>
      Given I am on the ya home page 
</code>
<code>
   Scenario Outline: 
      When I click on "<link>"
      Then the browser should display "<result>"
  </code> 
 
      Examples: 
         
         | link         | result                     |
         | Our Work     | We create and execute      |
         | Contact      | Let’s connect.             |
         | Careers      | Ready to make a difference |
         
          
The instructions say that when a user clicks on a given link, the browser should navigate to a page that contains the given result. For example, when the user clicks on the "Our Work" link, the brower should navigate to a page that contains the text, "We create and execute." If the text is there, the test passes. If not, the test fails. When we run the yaEngageSeleniumCucumberGherkin app, we can see that a series of chrome browsers launch and navigate to the pages specified by the Gherkin commands.

### Outputs

The yaEngageSeleniumCucumberGherkin app offers several ways to store information about whether the tests passed. 

_**HTML:**_

The app generates an HTML page that displays passing tests in green, and failing tests in red.

<div align="center">

![screenshot](https://github.com/jackpowers/yaEngageCucumberTest/blob/master/Screen%20Shot%202018-03-11%20at%203.57.07%20PM.png)

</div>

_**JSON:**_

The app generates a JSON string (rendered below through a JSON parser) that displays information about the tests.

<div align="center">

![screenshot](https://github.com/jackpowers/yaEngageCucumberTest/blob/master/Screen%20Shot%202018-03-11%20at%204.09.41%20PM.png)

</div>



_**Terminal:**_

The app also displays information about the tests inb the terminal window for quick feedback.

<div align="center">

![screenshot](https://github.com/jackpowers/yaEngageCucumberTest/blob/master/Screen%20Shot%202018-03-11%20at%204.04.38%20PM.png)

</div>




