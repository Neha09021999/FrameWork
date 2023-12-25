Feature: Login

	@smoke @regression 
  Scenario: Verify login Page 
    Given User open "Chrome" browser and enter url "https://nxzsound10-66173-react-native.b66173.stage.eastus.az.svc.builder.ai/home"
    When User click on login button
    Then Verify that login page should be open
    
    
    @smoke @regression 
     Scenario: Verify login username and password 
     Given User open "Chrome" browser and enter url "https://nxzsound10-66173-react-native.b66173.stage.eastus.az.svc.builder.ai/home"
   	 When User click on login button
   	 Then Verify that login page should be open
   	 And User enters "<Username>" and "<Password>"
    And User clicks on the next button
    Then Verify the HomePage "<Status>"
   	 
     
       @smoke @regression 
     Scenario: Verify login username and password 
     Given User open "Chrome" browser and enter url "https://nxzsound10-66173-react-native.b66173.stage.eastus.az.svc.builder.ai/home"
   	 When User click on login button
   	 Then Verify that login page should be open
   	 And User enters invalid details "<Username>" and "<Password>"
    And User clicks on the next button
    Then Verify the HomePage "<Status>"
   	 

    Examples: 

      | Username           | Password | Status |
      | demo12345          | 123456   | Pass   |
      | demo@mailinator.com| 123456   | Fail   |
  
