Feature: User register on website

  Scenario: user register on website with correct data
    Given click on "Register" button
    When click on Advanced button
    When fill first name field on register page
    When fill last name in field on register page
    When fill email in email field
    When fill phone number in field
    When fill first adress
    When fill city field
    When fill postcode
    When choose region
    When fill password "123456t" in field
    When fill password "123456t" in confirm field
    When click on agree checkbox
    When click on Continue button
