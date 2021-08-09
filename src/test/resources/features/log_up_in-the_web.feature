#Autor: Cesar Rodrigo Malaver Flor

  @Stories
  Feature: As an user interested in Software Automation, I want to register me in the UTest web page
    @scenario1
    Scenario: Create a new user register
      Given than Cesar wants to practice software automation
      When he create a new user register with valid fields
        | strFirstName | strLastName |
        | Cesar Rodrigo | Malaver Flor |
        | Cesar Rodrigo | Malaver Flor |
      Then he see the confirmation message Welcome to the world's largest community of freelance software testers!

    @scenario2
    Scenario: Create a new user register with invalid firstname lastname fields
      Given than Cesar wants to practice software automation
      When he create a invalid user register
        | strFirstName | strLastName |
        | Rodrigo17 | M@laver F1or |
        | Rodrigo17 | M@laver F1or |
      Then he see the invalid fields error No special characters

    @scenario3
    Scenario: Create a new user register with empty lastname fields
      Given than Cesar wants to practice software automation
      When he create a empty user register
        | strFirstName | strLastName |
        | Cesar Rodrigo |  |
        | Cesar Rodrigo |  |
      Then he see the lastname empty fields error Last name is required Last name is required
