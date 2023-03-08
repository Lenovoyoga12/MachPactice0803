Feature: search of products on iceland webpage

  Scenario: go to iceland webpage and check for products
    Given user is on iceland webpage
    When user click on search bar
    And user enter name of prodcuts "<juice>"
    And user click  on search button
    Then user must be able to see list of related products
