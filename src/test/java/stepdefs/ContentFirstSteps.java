package stepdefs;

import com.abcCompany.core.DriverManager;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utils.Utility;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class ContentFirstSteps {

    private AndroidDriver driver;

    public ContentFirstSteps() {
    }

    @Given("I am on {} page")
    public void navigateToContentFirstPage(String loginStatus) {
        System.out.println("Run test ");
    }

    @When("launch application")
    public void launchApp() throws InterruptedException {

        try {
            DriverManager manager = new DriverManager();
            manager.runTestsLocally("abc");

            Thread.sleep(3000);
            DriverManager.quitService();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
