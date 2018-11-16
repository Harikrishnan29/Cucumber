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
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});