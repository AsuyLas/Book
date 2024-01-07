Feature: Critical Path for Yakaboo.ua

Scenario: Purchase a product

Given I am on the Yakaboo.ua website
When I select the "Books" category
And I select the "The Lord of the Rings" book
And I add the book to the cart
And I proceed to the cart
And I enter my personal information
And I select the shipping method
And I select the payment method
And I confirm the order
Then I should receive the order