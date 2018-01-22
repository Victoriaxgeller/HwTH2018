package lesson7;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

public class MyTestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult result) {

        System.out.println("TEST SUCCESEEES" + result);
    }

    @Override
    public void onTestFailure(ITestResult result) {

        System.out.println("TEST FAAAAILED" + result);
        System.out.println("TEST FAAAAILED" + result); System.out.println("TEST FAAAAILED" + result);
        System.out.println("TEST FAAAAILED" + result);


    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }

//    @Listeners({TestListener.class, ReportsResultTestListener.class})
//    public class ReportsTests {
//    }

}
