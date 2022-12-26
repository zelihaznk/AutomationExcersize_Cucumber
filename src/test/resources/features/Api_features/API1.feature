
@Api01
  Feature:
    Scenario:
    API URL: https://automationexercise.com/api/productsList
    Request Method: GET
    Response Code: 200
    Response JSON: All products list


      Given  automationexercise
      When   send Get request
      Then   Status code is 200
      And    All products list
