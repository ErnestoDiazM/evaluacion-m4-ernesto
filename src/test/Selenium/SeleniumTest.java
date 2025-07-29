import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:/path/a/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testActualizarPeso() {
        driver.get("http://localhost:8080"); // Cambia a tu URL real

        WebElement pesoInput = driver.findElement(By.id("peso"));
        pesoInput.sendKeys("75");

        WebElement botonActualizar = driver.findElement(By.id("actualizar"));
        botonActualizar.click();

        WebElement mensaje = driver.findElement(By.id("mensaje"));
        assertTrue(mensaje.getText().contains("actualizado"));
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
