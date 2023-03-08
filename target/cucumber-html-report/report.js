$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Feature/Search.feature");
formatter.feature({
  "line": 1,
  "name": "search of products on iceland webpage",
  "description": "",
  "id": "search-of-products-on-iceland-webpage",
  "keyword": "Feature"
});
formatter.before({
  "duration": 24083662400,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "go to iceland webpage and check for products",
  "description": "",
  "id": "search-of-products-on-iceland-webpage;go-to-iceland-webpage-and-check-for-products",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on iceland webpage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user click on search bar",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter name of prodcuts \"\u003cjuice\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user click  on search button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user must be able to see list of related products",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_is_on_iceland_webpage()"
});
formatter.result({
  "duration": 491364600,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.user_click_on_search_bar()"
});
formatter.result({
  "duration": 2739030200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cjuice\u003e",
      "offset": 29
    }
  ],
  "location": "SearchSteps.user_enter_name_of_prodcuts(String)"
});
formatter.result({
  "duration": 2311676500,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.user_click_on_search_button()"
});
formatter.result({
  "duration": 13816702200,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.user_must_be_able_to_see_list_of_related_products()"
});
formatter.result({
  "duration": 234586800,
  "error_message": "java.lang.AssertionError: \nExpected: a string containing \"juice\"\n     but: was \"Search results for ‘Juice’\"\r\n\tat org.hamcrest.MatcherAssert.assertThat(MatcherAssert.java:20)\r\n\tat org.junit.Assert.assertThat(Assert.java:865)\r\n\tat org.junit.Assert.assertThat(Assert.java:832)\r\n\tat iceLand.Steps.SearchSteps.user_must_be_able_to_see_list_of_related_products(SearchSteps.java:33)\r\n\tat ✽.Then user must be able to see list of related products(src/test/Feature/Search.feature:8)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1804054800,
  "status": "passed"
});
});