$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("InvalidLogin.feature");
formatter.feature({
  "line": 2,
  "name": "This feature checks invalid login functionalities",
  "description": "",
  "id": "this-feature-checks-invalid-login-functionalities",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@functionalTest"
    },
    {
      "line": 1,
      "name": "@negativeTest"
    }
  ]
});
formatter.before({
  "duration": 4594212,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login by invalid Facebook login",
  "description": "",
  "id": "this-feature-checks-invalid-login-functionalities;login-by-invalid-facebook-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I go to Kumparan",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I should see correct title page for Kumparan",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I click on login Facebook button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I login to Facebook with invalid credential",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should not be logged in to Kumparan",
  "keyword": "Then "
});
formatter.match({
  "location": "KumparanComSteps.givenIGoToKumparan()"
});
