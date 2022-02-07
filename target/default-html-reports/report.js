$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Contacts.feature");
formatter.feature({
  "name": "Contacs page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "login as a given user",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefs.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user logs in using following credentials",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "com.vytrack.step_definitions.ContacsStepDefs.the_user_logs_in_using_following_credentials(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003cDoe[e]\u003e but was:\u003cDoe[]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat com.vytrack.step_definitions.ContacsStepDefs.the_user_logs_in_using_following_credentials(ContacsStepDefs.java:41)\r\n\tat ✽.the user logs in using following credentials(file:///C:/Users/Home/IdeaProjects/EU7CucumberSelenium/src/test/resources/features/Contacts.feature:32)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "the user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.LoginStepDefs.the_user_should_be_able_to_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});