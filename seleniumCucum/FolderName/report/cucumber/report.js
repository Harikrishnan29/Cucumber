$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Test Smoke scenarios of login",
  "description": "",
  "id": "test-smoke-scenarios-of-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Test guru99 login valid credentials",
  "description": "",
  "id": "test-smoke-scenarios-of-login;test-guru99-login-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open chrome and start guru99 application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I provide valid username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User should be open manager home page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "99",
      "offset": 26
    }
  ],
  "location": "step.open_chrome_and_start_guru_application(int)"
});
formatter.result({
  "duration": 19807617058,
  "status": "passed"
});
formatter.match({
  "location": "step.i_provide_valid_username_and_password()"
});
formatter.result({
  "duration": 431667213,
  "status": "passed"
});
formatter.match({
  "location": "step.user_should_be_open_manager_home_page()"
});
formatter.result({
  "duration": 6261651308,
  "status": "passed"
});
});