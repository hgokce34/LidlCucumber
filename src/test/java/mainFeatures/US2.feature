Feature: Registering as a User

  Scenario: US2 Navigate Website
  Given I navigate the Lidl website
  Then I Click On the singin button
  And  I click on the Join MyLidl button
  Scenario Outline: US2 Registering and SingOut
    And  a user with name "<name>" and surname "<surname>"
    And  a user write "<email>" and confirm email "<corfirmEmail>"
    Then I can write "<password>"
    Then I can write phone "<phoneNumber>"
    Then I can write zipcode "<zipCode>"
    Then I can write birthday "<birthday>"
    Then I can write address "<address>"
    Then I can write city "<city>"
    Then I can write state "<state>"
    Then I can click JoinMyLidl
    Then I can click signOut button

    Examples:
      | name  | surname | email           | corfirmEmail     | password   |phoneNumber   |zipCode|birthday   |address  |city |state     |
      | Aziza | Khudo   | azize           |                  |            |              |       |           |         |     |          |
      | Aziza | Khudo   | azize@gmail.com | azize            |            |              |       |           |         |     |          |
      | Aziza | Khudo   | azize@gmail.com | azize@gmail.com  | 1234       |              |       |           |         |     |          |
      | Aziza | Khudo   | azize@gmail.com | azize@gmail.com  | 12345678aB |000 000 0     |       |           |         |     |          |
      | Aziza | Khudo   | azize@gmail.com | azize@gmail.com  | 12345678aB |543 654 6652  |       |           |         |     |          |
      | Aziza | Khudo   | azize@gmail.com | azize@gmail.com  | 12345678aB |543 654 6652  |12     |           |         |     |          |
      | Aziza | Khudo   | azize@gmail.com | azize@gmail.com  | 12345678aB |543 654 6652  |11378  |           |         |     |          |
      | Aziza | Khudo   | azize@gmail.com | azize@gmail.com  | 12345678aB |543 654 6652  |11378  |03/19/1910 |         |     |          |
      | Aziza | Khudo   | azize@gmail.com | azize@gmail.com  | 12345678aB |543 654 6652  |11378  |03/19/2020 |         |     |          |
      | Aziza | Khudo   | azize@gmail.com | azize@gmail.com  | 12345678aB |543 654 6652  |11378  |03/19/1991 |         |     |          |
      | Aziza | Khudo   | azize@gmail.com | azize@gmail.com  | 12345678aB |543 654 6652  |11378  |03/19/1991 |USA new  |     |          |
      | Aziza | Khudo   | azize@gmail.com | azize@gmail.com  | 12345678aB |543 654 6652  |11378  |03/19/1991 |USA new  | NY  |          |
      | Aziza | Khudo   | azize@gmail.com | azize@gmail.com  | 12345678aB |543 654 6652  |11378  |03/19/1991 |USA new  | NY  | New York |