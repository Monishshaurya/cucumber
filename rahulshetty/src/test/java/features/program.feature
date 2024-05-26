Feature: User login
Background:
Given setup entries in database
When launch the browser from confi variables
When hit the home page url of banking site


@smoketest 
Scenario: Admin Page default login
Given User is on NetBanking landing page
When User login into application with 6789 and password "1234"
Then Home Page is displayed
And Cards are displayed

@Regressionsuite 
#Reusable
Scenario: user Page default login
Given User is on NetBanking landing page
When User login into application with 45535 and password "1256"
Then Home Page is displayed
And Cards are displayed

@sanity
Scenario Outline: user Page default login
Given User is on NetBanking landing page
When User login into application with "<username>" and password "<password>" combination
Then Home Page is displayed
And Cards are displayed

Examples:
|username      | password  |
|customeruser65|  monish12 |
|dealeruser56  |  mouni669896|

@Regressionsuite
Scenario: user page default sign up
Given User is on Practice landing page
When User Signup into application
| rahul |
| shetty|
|contact@email.com|
|54343646463|
Then Home Page is displayed
And Cards are displayed











