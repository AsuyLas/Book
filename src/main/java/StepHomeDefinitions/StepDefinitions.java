package StepHomeDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StepDefinitions {

    private WebDriver driver;

    public StepDefinitions(WebDriver driver) {
        this.driver = driver;
    }

    @Given("I am on the Yakaboo.ua website")
    public void iAmOnTheYakabooUaWebsite() {
        driver.get("https://www.yakaboo.ua");
    }

    @When("I select the \"Books\" category")
    public void iSelectTheBooksCategory() {
        driver.findElement(By.xpath("//a[@href='/books']")).click();
    }

    @And("I select the \"The Lord of the Rings\" book")
    public void iSelectTheLordOfTheRingsBook() {
        driver.findElement(By.xpath("//a[@href='/books/the-lord-of-the-rings']")).click();
    }

    @And("I add the book to the cart")
    public void iAddTheBookToTheCart() {
        driver.findElement(By.xpath("//button[@class='add-to-cart']")).click();
    }

    @And("I proceed to the cart")
    public void iProceedToTheCart() {
        driver.findElement(By.xpath("//a[@href='/cart']")).click();
    }

    @And("I enter my personal information")
    public void iEnterMyPersonalInformation() {
        driver.findElement(By.id("name")).sendKeys("John Doe");
        driver.findElement(By.id("email")).sendKeys("john.doe@example.com");
        driver.findElement(By.id("phone")).sendKeys("+380 50 123 4567");
    }

    @And("I select the shipping method")
    public void iSelectTheShippingMethod() {
        driver.findElement(By.xpath("//input[@id='shipping-method-1']")).click();
    }

    @And("I select the payment method")
    public void iSelectThePaymentMethod() {
        driver.findElement(By.xpath("//input[@id='payment-method-1']")).click();
    }

    @And("I confirm the order")
    public void iConfirmTheOrder() {
        driver.findElement(By.xpath("//button[@class='submit']")).click();
    }

    @Then("I should receive the order")
    public void iShouldReceiveTheOrder() {
        WebElement orderSuccessHeader = driver.findElement(By.xpath("//h1[@class='order-success-header']"));
        Assertions.assertEquals(orderSuccessHeader.getText(), "Your order is successfully placed");
    }
}
