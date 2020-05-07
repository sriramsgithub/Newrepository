$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/sriramsn/eclipse-workspace/RapidTest/Features/RapidTest.feature");
formatter.feature({
  "line": 1,
  "name": "Smoke test for RapidTest",
  "description": "",
  "id": "smoke-test-for-rapidtest",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login Logout",
  "description": "",
  "id": "smoke-test-for-rapidtest;login-logout",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I have url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I entered the username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I entered the pin",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I successfully logged in to the application",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.url()"
});
formatter.result({
  "duration": 14614928700,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_entered_the_username_and_password()"
});
formatter.result({
  "duration": 2736124799,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_entered_the_pinnumber()"
});
formatter.result({
  "duration": 3039933100,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_successfully_logged_in_to_the_application()"
});
formatter.result({
  "duration": 4495084700,
  "status": "passed"
});
});