package stepdefs;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;

public class ContentFirstSteps {

    AndroidDriver driver;

    public ContentFirstSteps(){

    }

    @Given("I am on {} page")
    public void navigateToContentFirstPage(String loginStatus) {
        System.out.println("Run test ");
    }

}
