$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BDD.feature");
formatter.feature({
  "line": 1,
  "name": "BDD",
  "description": "",
  "id": "bdd",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Test Scenario",
  "description": "",
  "id": "bdd;test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I use the test step",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.i_use_the_test_step()"
});
formatter.result({
  "duration": 69560000,
  "status": "passed"
});
});