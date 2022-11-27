package abc.utils;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestResultsListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("Triggering test - " + iTestResult.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Test passed - " + iTestResult.getMethod().getMethodName());
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("Test failed - " + iTestResult.getMethod().getMethodName());
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("Test Skipped/Failed will be picked for retrying... - " + iTestResult.getMethod().getMethodName());
    }

}
