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

public class Transfer {
    public static void main(String [] args){
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
//
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Modulo de Insumos']")));
        WebElement materialModuleMenu = driver.findElement(By.xpath(".//*[text()='Modulo de Insumos']"));
        materialModuleMenu.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Traspasos']")));
        WebElement optionSupplyMenu = driver.findElement(By.xpath(".//*[text()='Traspasos']"));
        optionSupplyMenu.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Nuevo']")));
        WebElement buttonNew = driver.findElement(By.xpath(".//*[text()='Nuevo']"));
        buttonNew.click();




        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Almacen Central']")));
        WebElement optionStore = driver.findElement(By.xpath(".//*[text()='Almacen Central']"));
        optionStore.click();
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Planta']")));
        WebElement optionStoreSelect = driver.findElement(By.xpath(".//*[text()='Planta']"));
        optionStoreSelect.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Destino']")));
        WebElement optionSelection = driver.findElement(By.cssSelector("[aria-label='Destino']"));
        optionSelection.click();
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Planta']")));
        WebElement optionSelect = driver.findElement(By.xpath(".//*[text()='Planta']"));
        optionSelect.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Fecha']")));
        WebElement optionCalendar = driver.findElement(By.cssSelector("[aria-label='Fecha']"));
        optionCalendar.click();
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[text()='5']")));
        WebElement optionCalendarSelect = driver.findElement(By.xpath(".//div[text()='5']"));
        optionCalendarSelect.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Seleccione insumo']")));
        WebElement optionDestination = driver.findElement(By.cssSelector("[aria-label='Seleccione insumo']"));
        optionDestination.click();
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Mantenimiento']")));
        WebElement optionSelectionType = driver.findElement(By.xpath(".//*[text()='Mantenimiento']"));
        optionSelectionType.click();


        }

}
