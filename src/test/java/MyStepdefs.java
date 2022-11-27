import io.cucumber.java.en.Given;

public class MyStepdefs {

    @Given("test step")
    public void testStep() {
        System.out.println("Debug test");
    }
}
