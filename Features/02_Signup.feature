Feature: Signup Feature

@smoke @regression 
  Scenario: Verify Signup option
    Given User open "Chrome" browser and enter url "https://nxzsound10-66173-react-native.b66173.stage.eastus.az.svc.builder.ai/home"
    When User click on signup button
    Then Verify that signup page should be open and creative and listener option is visible 
    
 
@smoke @regression 
  Scenario: Verify signup creative flow with valid cred  
    Given User open "Chrome" browser and enter url "https://nxzsound10-66173-react-native.b66173.stage.eastus.az.svc.builder.ai/home"
    When User click on signup button
    Then Verify that signup page should be open and creative and listener option is visible
    Then Click on creative option 
    And Click on next button 
    Then Add all the Valid details on fields "<Full Name>" , "<Username>" , "<Password>" , "<Email>" , "<Phone>" , "<Instagram>"
    Then Click on next1 button 
    Then Verify the signup "<Status>"
      
 @smoke @regression 
  Scenario: Verify signup creative flow with invalid cred  
    Given User open "Chrome" browser and enter url "https://nxzsound10-66173-react-native.b66173.stage.eastus.az.svc.builder.ai/home"
    When User click on signup button
    Then Verify that signup page should be open and creative and listener option is visible
    Then Click on creative option 
    And Click on next button 
    Then Add all the inValid details on fields "<Full Name>" , "<Username>" , "<Password>" , "<Email>" , "<Phone>" , "<Instagram>"
    Then Click on next1 button 
   Then Verify the signup "<Status>"
    Examples: 
     
        | Full Name | Username | Password |Email |Phone | Instagram | Status |
      	|  nehasoranaga | nehu45 | Test@123 |neha234@mailinator.com |919877789049| Text | Pass |
      	|  nehasoranaga | nehu40 | 123 |nehamailinator.com | 91989049| Text | Fail |
      
    
