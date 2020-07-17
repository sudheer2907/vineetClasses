package oneframe.cucumber.testrunner;

import org.apache.log4j.PropertyConfigurator;
import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.oneframe.cucumber.oneframebase.reporting.GenerateReport;
import com.oneframe.cucumber.oneframebase.utils.LogPrinter;
import com.oneframe.cucumber.oneframebase.utils.timeutils.TimeDurationCalculator;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

@RunWith(Cucumber.class)

@CucumberOptions(monochrome = true, features = "src//test//resources//features//projectOne", glue = "oneframe.cucumber.projectone.stepdefinitions", plugin = {
        "pretty", "io.qameta.allure.cucumberjvm.AllureCucumberJvm", "html:target/test-report/cucumber",
        "json:target/test-report/cucumber.json" }, tags = { "@UITestsample" })
public class TestRunner {
    private TestNGCucumberRunner testNGCucumberRunner;
    private static String scenarioName = null;
    private TimeDurationCalculator timeDurationCalculator = new TimeDurationCalculator();

    /**
     * setUpClass.
     */

    @BeforeClass(alwaysRun = true)
    public void setUpClass() {
        PropertyConfigurator.configure("log4j.properties");
        System.setProperty("log4j.configurationFile", "log4j.properties");
        testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
        timeDurationCalculator.start();
    }

    @Test(groups = "cucumber", description = "Runs Cucumber Feature", dataProvider = "features")
    public void feature(CucumberFeatureWrapper cucumberFeature) {
        scenarioName = cucumberFeature.getCucumberFeature().getPath();
        System.out.println("************** Executing scenario *********" + scenarioName);
        testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());

    }

    @DataProvider
    public Object[][] features() {
        return testNGCucumberRunner.provideFeatures();
    }

    /**
     * Teardownclass.
     */
    @AfterClass(alwaysRun = true)
    public void tearDownClass() {
        timeDurationCalculator.stop();
        timeDurationCalculator.calculate();
        LogPrinter.printLog("Execution Took : " + timeDurationCalculator.getTimeElapsed());
        testNGCucumberRunner.finish();
        // WebDriverFactory.getDriver().close();
        // WebDriverFactory.getDriver().quit();
        GenerateReport.generateReport("oneFrame", "target/test-report");
    }

    public static String getScenarioName() {
        return scenarioName;
    }
}
