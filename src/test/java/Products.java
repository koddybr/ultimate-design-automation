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

public class Products {
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

        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Productos']")));
        WebElement optionSupplyMenu = driver.findElement(By.xpath(".//*[text()='Productos']"));
        optionSupplyMenu.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Nuevo']")));
        WebElement buttonNew = driver.findElement(By.xpath(".//*[text()='Nuevo']"));
        buttonNew.click();


        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Nombre']")));
        WebElement optionName = driver.findElement(By.cssSelector("[aria-label='Nombre']"));
        optionName.click();
        optionName.sendKeys("Madera fina");

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Tipo']")));
        WebElement optionType = driver.findElement(By.cssSelector("[aria-label='Tipo']"));
        optionType.click();
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Precepillada']")));
        WebElement optionTypeSelection = driver.findElement(By.xpath(".//*[text()='Precepillada']"));
        optionTypeSelection.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Unidad']")));
        WebElement optionUnit = driver.findElement(By.cssSelector("[aria-label='Unidad']"));
        optionUnit.click();
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='caja']")));
        WebElement optionUnitSelection = driver.findElement(By.xpath(".//*[text()='caja']"));
        optionUnitSelection.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Espesor (mm)']")));
        WebElement optionThickness = driver.findElement(By.cssSelector("[aria-label='Espesor (mm)']"));
        optionThickness.click();
        optionThickness.sendKeys("1000");

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Ancho (mm)']")));
        WebElement optionBroad = driver.findElement(By.cssSelector("[aria-label='Ancho (mm)']"));
        optionBroad.click();
        optionBroad.sendKeys("500");

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Largo (mm)']")));
        WebElement optionLong = driver.findElement(By.cssSelector("[aria-label='Largo (mm)']"));
        optionLong.click();
        optionLong.sendKeys("700");

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Estimación Madera']")));
        WebElement optionWood = driver.findElement(By.cssSelector("[aria-label='Estimación Madera']"));
        optionWood.click();
        optionWood.sendKeys("10");

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Estimación Venesta']")));
        WebElement optionVenesta = driver.findElement(By.cssSelector("[aria-label='Estimación Venesta']"));
        optionVenesta.click();
        optionVenesta.sendKeys("20  ");

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Descripción']")));
        WebElement optionDescription = driver.findElement(By.cssSelector("[aria-label='Descripción']"));
        optionDescription.click();
        optionDescription.sendKeys("Estado");


    }
}










