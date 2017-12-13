Feature: HomePage Validation

  Scenario: Successful Clicking on search icon
    Given User is on Home Page of toolsqa
    When User Clicks on Search Icon
    Then Textbox appears to enter text

  Scenario: Successful Entering keywords in textbox
    Given Textbox is displayed
    Then User enters keywords to search

  Scenario: Successful Dismissing alert
    Given User is on Homepage of toolsqa
    When Alert box appears
    Then User Clicks on Dismiss button

  Scenario: Successful Clicking on mainnav Option
    Given User is on Home Page of Toolsqa
    When User Hovers on DemoSites in navbar
    Then SubMenu list appears successfully

  Scenario: Successful Clicking on SubMenu
    Given Mainmenu list is visible
    When User clicks on submenu Option as Automation Practice form
    Then User is navigated to Automation Practice form page
