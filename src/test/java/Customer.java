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

public class Customer {
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

        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Clientes']")));
        WebElement optionSupplyMenu = driver.findElement(By.xpath(".//*[text()='Clientes']"));
        optionSupplyMenu.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Nuevo']")));
        WebElement buttonNew = driver.findElement(By.xpath(".//*[text()='Nuevo']"));
        buttonNew.click();


        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Razón Social']")));
        WebElement optionReason = driver.findElement(By.cssSelector("[aria-label='Razón Social']"));
        optionReason.click();
        optionReason.sendKeys("Compra de madera");

        optionReason.sendKeys(Keys.TAB);
//        optionReason.sendKeys("11525");
        Actions actions = new Actions(driver);
        actions.sendKeys("123").build().perform();
//        try {
//            Thread.sleep(2000);
//        }catch(Exception e){}
//        await.until(ExpectedConditions.elementToBeClickable(By.cssSelector("div.v-input__control input[aria-label='NIT\\CI']")));
//        WebElement optionNITCI = driver.findElement(By.cssSelector("div.v-input__control input[aria-label='NIT\\CI']"));
//        optionNITCI.click();
//        optionNITCI.sendKeys("9845123");

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Dirección']")));
        WebElement optionAddress = driver.findElement(By.cssSelector("[aria-label='Dirección']"));
        optionAddress.click();
        optionAddress.sendKeys("9845123");

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Representante legal']")));
        WebElement optionRepresentative = driver.findElement(By.cssSelector("[aria-label='Representante legal']"));
        optionRepresentative.click();
        optionRepresentative.sendKeys("Persona Encargada");

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Teléfono']")));
        WebElement optionPhone = driver.findElement(By.cssSelector("[aria-label='Teléfono']"));
        optionPhone.click();
        optionPhone.sendKeys("26347894");

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Correo']")));
        WebElement optionMail = driver.findElement(By.cssSelector("[aria-label='Correo']"));
        optionMail.click();
        optionMail.sendKeys("correo@gmail.com");

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Descripción']")));
        WebElement optionDescription = driver.findElement(By.cssSelector("[aria-label='Descripción']"));
        optionDescription.click();
        optionDescription.sendKeys("Compra Correcta");
    }
}














