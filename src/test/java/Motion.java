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

public class Motion {
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

        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Movimiento']")));
        WebElement optionSupplyMenu = driver.findElement(By.xpath(".//*[text()='Movimiento']"));
        optionSupplyMenu.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Nuevo']")));
        WebElement buttonNew = driver.findElement(By.xpath(".//*[text()='Nuevo']"));
        buttonNew.click();

                                  //  .//a[contains(text(), 'Constec-Rubau SRL - Cond.Torrez del Poeta')]



        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Cuenta']")));
        WebElement optionAccount = driver.findElement(By.cssSelector("[aria-label='Cuenta']"));
        optionAccount.click();
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[contains(text(), 'Ingresos por Contratos')]")));
        WebElement optionAccountSelect = driver.findElement(By.xpath(".//div[contains(text(), 'Ingresos por Contratos')]"));
        optionAccountSelect.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Almacen Central']")));
        WebElement optionStore = driver.findElement(By.cssSelector("[aria-label='Almacen Central']"));
        optionStore.click();
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[contains(text(), 'Planta')]")));
        WebElement optionStoreSelection = driver.findElement(By.xpath(".//div[contains(text(), 'Planta')]"));
        optionStoreSelection.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Tipo']")));
        WebElement optionType = driver.findElement(By.cssSelector("[aria-label='Tipo']"));
        optionType.click();
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//a[contains(), 'INVERSION')]")));
        WebElement optionTypeSelection = driver.findElement(By.xpath(".//a[contains(), 'INVERSION')]"));
        optionTypeSelection.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Fecha de incio']")));
        WebElement optionCalendar = driver.findElement(By.cssSelector("[aria-label='Fecha de incio']"));
        optionCalendar.click();
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[text()='16']")));
        WebElement optionCalendarSelect = driver.findElement(By.xpath(".//div[text()='16']"));
        optionCalendarSelect.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Insumo']")));
        WebElement optionProduct = driver.findElement(By.cssSelector("[aria-label='Insumo']"));
        optionProduct.click();
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='11.07.700 - Tirafondos M6*75 MM(6.00)']")));
        WebElement optionProductSelection = driver.findElement(By.xpath(".//*[text()='11.07.700 - Tirafondos M6*75 MM(6.00)']"));
        optionProductSelection .click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Cantidad']")));
        WebElement optionAmount = driver.findElement(By.cssSelector("[aria-label='Cantidad']"));
        optionAmount.click();
        optionAmount.sendKeys("200");

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Orden']")));
        WebElement optionOrder = driver.findElement(By.cssSelector("[aria-label='Orden']"));
        optionOrder.click();
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='MR-13']")));
        WebElement optionOrderSelection = driver.findElement(By.xpath(".//*[text()='MR-13']"));
        optionOrderSelection.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Área']")));
        WebElement optionArea = driver.findElement(By.cssSelector("[aria-label='Área']"));
        optionArea.click();
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Planta']")));
        WebElement optionAreaSelection = driver.findElement(By.xpath(".//*[text()='Planta']"));
        optionAreaSelection.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Glosa']")));
        WebElement optionGloss = driver.findElement(By.cssSelector("[aria-label='Glosa']"));
        optionGloss.click();
        optionGloss.sendKeys("Completado");
        }
}
