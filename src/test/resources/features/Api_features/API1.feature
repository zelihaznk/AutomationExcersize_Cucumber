
@Api01
  Feature:
    Scenario:
    API URL: https://automationexercise.com/api/productsList
    Request Method: GET
    Response Code: 200
    Response JSON: All products list

//
   //   Given  automationexercise
   //   When   send Get request
   //   Then   Status code is 200
   //   And    All products list

Feature: Automation Exercise Api01 testi

  @api01
  Scenario: Api01 test
    Given kullanici "productsList" endpointine request gonderir
    Then  kullanici status codu dogrular
    And kullanici urunlerin sayisinin 34 oldugunu dogrular
    And kullanici fiyati 1000 den kucuk olan urunleri log dosyasina yazdirir
