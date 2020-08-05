$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/Features/Login.feature");
formatter.feature({
  "line": 3,
  "name": "User should be able to login successfully",
  "description": "",
  "id": "user-should-be-able-to-login-successfully",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@test"
    }
  ]
});
formatter.before({
  "duration": 9319497900,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "MtStepDef.user_is_on_home_page()"
});
formatter.result({
  "duration": 212405200,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "user Should log in successfully",
  "description": "",
  "id": "user-should-be-able-to-login-successfully;user-should-log-in-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "user enters username and  password",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user should navigate to login page",
  "keyword": "Then "
});
formatter.match({
  "location": "MtStepDef.user_enters_username_and_password()"
});
formatter.result({
  "duration": 403891500,
  "status": "passed"
});
formatter.match({
  "location": "MtStepDef.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 1774558000,
  "status": "passed"
});
formatter.match({
  "location": "MtStepDef.user_should_navigate_to_login_page()"
});
formatter.result({
  "duration": 66264800,
  "status": "passed"
});
formatter.after({
  "duration": 724653600,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 13,
  "name": "user should not be able to login with invalid username and invalid password",
  "description": "",
  "id": "user-should-be-able-to-login-successfully;user-should-not-be-able-to-login-with-invalid-username-and-invalid-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 14,
  "name": "user enters invalid  \"\u003cinvalid Username\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user enters  \"\u003cInvalid Password\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User should not be able to login successfully and see \"\u003crelated message\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 19,
  "name": "",
  "description": "",
  "id": "user-should-be-able-to-login-successfully;user-should-not-be-able-to-login-with-invalid-username-and-invalid-password;",
  "rows": [
    {
      "cells": [
        "invalid Username",
        "Invalid Password",
        "related message"
      ],
      "line": 20,
      "id": "user-should-be-able-to-login-successfully;user-should-not-be-able-to-login-with-invalid-username-and-invalid-password;;1"
    },
    {
      "cells": [
        "Admin",
        "",
        "Password cannot be empty"
      ],
      "line": 21,
      "id": "user-should-be-able-to-login-successfully;user-should-not-be-able-to-login-with-invalid-username-and-invalid-password;;2"
    },
    {
      "cells": [
        "invalid",
        "",
        "Password cannot be empty"
      ],
      "line": 22,
      "id": "user-should-be-able-to-login-successfully;user-should-not-be-able-to-login-with-invalid-username-and-invalid-password;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 7403810400,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "MtStepDef.user_is_on_home_page()"
});
formatter.result({
  "duration": 80504100,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "user should not be able to login with invalid username and invalid password",
  "description": "",
  "id": "user-should-be-able-to-login-successfully;user-should-not-be-able-to-login-with-invalid-username-and-invalid-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "user enters invalid  \"Admin\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user enters  \"\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User should not be able to login successfully and see \"Password cannot be empty\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 22
    }
  ],
  "location": "MtStepDef.user_enters_invalid(String)"
});
formatter.result({
  "duration": 224818500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 14
    }
  ],
  "location": "MtStepDef.user_enters(String)"
});
formatter.result({
  "duration": 112733200,
  "status": "passed"
});
formatter.match({
  "location": "MtStepDef.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 77135700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Password cannot be empty",
      "offset": 55
    }
  ],
  "location": "MtStepDef.user_should_not_be_able_to_login_successfully_and_see(String)"
});
formatter.result({
  "duration": 51499000,
  "status": "passed"
});
formatter.after({
  "duration": 103449600,
  "status": "passed"
});
formatter.before({
  "duration": 7105597200,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.match({
  "location": "MtStepDef.user_is_on_home_page()"
});
formatter.result({
  "duration": 49297500,
  "status": "passed"
});
formatter.scenario({
  "line": 22,
  "name": "user should not be able to login with invalid username and invalid password",
  "description": "",
  "id": "user-should-be-able-to-login-successfully;user-should-not-be-able-to-login-with-invalid-username-and-invalid-password;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "user enters invalid  \"invalid\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "user enters  \"\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User should not be able to login successfully and see \"Password cannot be empty\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "invalid",
      "offset": 22
    }
  ],
  "location": "MtStepDef.user_enters_invalid(String)"
});
formatter.result({
  "duration": 194893600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 14
    }
  ],
  "location": "MtStepDef.user_enters(String)"
});
formatter.result({
  "duration": 139659900,
  "status": "passed"
});
formatter.match({
  "location": "MtStepDef.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 77608500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Password cannot be empty",
      "offset": 55
    }
  ],
  "location": "MtStepDef.user_should_not_be_able_to_login_successfully_and_see(String)"
});
formatter.result({
  "duration": 60772000,
  "status": "passed"
});
formatter.after({
  "duration": 135762900,
  "status": "passed"
});
});