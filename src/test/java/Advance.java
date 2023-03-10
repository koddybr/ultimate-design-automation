import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.UUID;

public class Advance {
    public static void main(String[] args) {
        System.out.println("HELLO");
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait await = new WebDriverWait(driver, 5);
        driver.get("http://127.0.0.1:8000/");
        System.out.println(driver.getTitle());
        UUID uuid = UUID.randomUUID();
        String uuidString = uuid.toString();
        System.out.println("UUID: " + uuidString);


        WebElement userInput = driver.findElement(By.cssSelector("[aria-label='Usuario']"));
        userInput.sendKeys("admin");
        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys("123456");
        WebElement starSessionButton = driver.findElement(By.cssSelector("button[type='submit']"));
        starSessionButton.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".v-toolbar__side-icon.v-btn.v-btn--icon.theme--dark")));
        WebElement hamburgerMenu = driver.findElement(By.cssSelector(".v-toolbar__side-icon.v-btn.v-btn--icon.theme--dark"));
        hamburgerMenu.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Modulo de Pedidos']")));
        WebElement materialModuleMenu = driver.findElement(By.xpath(".//*[text()='Modulo de Pedidos']"));
        materialModuleMenu.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Avances']")));
        WebElement optionSupplyMenu = driver.findElement(By.xpath(".//*[text()='Avances']"));
        optionSupplyMenu.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Nuevo']")));
        WebElement buttonNew = driver.findElement(By.xpath(".//*[text()='Nuevo']"));
        buttonNew.click();


        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Fecha de incio']")));
        WebElement optionCalendar = driver.findElement(By.cssSelector("[aria-label='Fecha de incio']"));
        optionCalendar.click();
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[text()='2']")));
        WebElement optionCalendarSelect = driver.findElement(By.xpath(".//div[text()='2']"));
        optionCalendarSelect.click();

//        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Ordenes']")));
//        WebElement optionOrder = driver.findElement(By.cssSelector("[aria-label='Ordenes']"));
//        optionOrder.click();
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[contains(text(), 'Ordenes') ]")));
        WebElement optionOrder = driver.findElement(By.xpath(".//div[contains(text(), 'Ordenes')]"));
        optionOrder.click();
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[contains(text(), 'FG-16') ]")));
        WebElement optionOrderSelect = driver.findElement(By.xpath(".//div[contains(text(), 'FG-16')]"));
        optionOrderSelect.click();

    }
}
