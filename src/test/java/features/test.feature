Feature:Navbar Dropdown selection and further navigation
 
Scenario: Successful Clicking on mainnav Option
	Given User is on Home Page of Toolsqa
	When User Hovers on Tutorial in navbar
	Then SubMenu list appears successfully
	
Scenario: Successful Clicking on SubMenu
	Given Mainmenu list is visible
	When User clicks on submenu Option as Webautomation tools
        And  Subsublist menu appears

Scenario: Successful Clicking on SubSubMenu
	Given Submenu list is visible
	When User clicks on subsubmenu Option as cucumber
        Then  User is navigated to cucumber tutorial page

Scenario: Successful Clicking on LeftMenu Option
	Given User is on navigated page of cucumber tutorial
	When  User clicks on LeftMain Menu option as cucumber basics.
        Then  SubMenu list appears.

Scenario: Successful Clicking on LeftMenu SubOptions
	Given Submenu list is visible
	When User clicks on subsubmenu List as Junit Test Runner Class
        Then  User is navigated to Junit Test Runner Class page

Scenario: Successful Entering mailid in subscribe
	Given User is on Test Runner Class Page
        And   Email TextBox is displayed
	Then  User Enters MailId

Scenario: Successful Clicking on Subscribe Button
        Given Subscribe Button is enabled
	When User clicks on subscribe button
        Then  FeedBurner Popup appears