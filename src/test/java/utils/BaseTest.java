package utils;

import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

import static utils.DriverFactory.getDriver;

public class BaseTest {

    protected static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        driver = getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://skleptest.pl/");
    }
}
