import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;


public class CalculatorStepDefinitions {
    Calculator c;
    // declares a variable c of type Calculator;
    //it can access all the methods and properties defined in the Calculator class;
    int actual_result;
    //int actual_result;: A variable to hold the result of the calculator operations (addition or multiplication);

    @Given("I have a calculator")
    public void i_have_a_calculator() {
         c= new Calculator();
    }
    // Linked to the Given step in the feature file;
    @When("I add {int} and {int}")
    public void i_add_and( int a, int b) {
        actual_result= c.add(a,b);
    }
    //Corresponds to the When step for addition
    @When("I multiply {int} and {int}")
    public void i_multiply_and(int x,  int y) {
        actual_result = c.multiply(x, y);
    }
    //Corresponds to the When step for multiplication;
    @Then("I should get {int}")
    public void i_should_get(int expected_result) {
        Assertions.assertEquals(actual_result, expected_result);
    }
    // It asserts that the actual_result obtained from the calculator operations matches the expected_result
    // specified in the test scenario;

}
