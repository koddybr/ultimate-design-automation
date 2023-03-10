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

public class Order {
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

        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Modulo de Pedidos']")));
        WebElement materialModuleMenu = driver.findElement(By.xpath(".//*[text()='Modulo de Pedidos']"));
        materialModuleMenu.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Ordenes']")));
        WebElement optionSupplyMenu = driver.findElement(By.xpath(".//*[text()='Ordenes']"));
        optionSupplyMenu.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Nuevo']")));
        WebElement buttonNew = driver.findElement(By.xpath(".//*[text()='Nuevo']"));
        buttonNew.click();



        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Número de orden']")));
        WebElement optionNumberOrder = driver.findElement(By.cssSelector("[aria-label='Número de orden']"));
        optionNumberOrder.click();
        optionNumberOrder.sendKeys("orden numero 1");

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Contrato']")));
        WebElement optionContract = driver.findElement(By.cssSelector("[aria-label='Contrato']"));
        optionContract.click();
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//a[contains(text(), 'Cont. Marco-Puerta') ]")));
        WebElement optionContractSelect = driver.findElement(By.xpath(".//a[contains(text(), 'Cont. Marco-Puerta') ]"));
        optionContractSelect.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Acabado']")));
        WebElement optionFinish = driver.findElement(By.cssSelector("[aria-label='Acabado']"));
        optionFinish.click();
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='ACABADO']")));
        WebElement optionFinishSelect = driver.findElement(By.xpath(".//*[text()='ACABADO']"));
        optionFinishSelect.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Obra']")));
        WebElement optionSite = driver.findElement(By.cssSelector("[aria-label='Obra']"));
        optionSite.click();
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Cond.Torrez del Poeta - Constec-Rubau SRL']")));
        WebElement optionSiteSelect = driver.findElement(By.xpath(".//*[text()='Cond.Torrez del Poeta - Constec-Rubau SRL']"));
        optionSiteSelect.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Tipo de madera']")));
        WebElement optionWood = driver.findElement(By.cssSelector("[aria-label='Tipo de madera']"));
        optionWood.click();
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Cedro']")));
        WebElement optionWoodSelect = driver.findElement(By.xpath(".//*[text()='Cedro']"));
        optionWoodSelect.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Estado']")));
        WebElement optionState = driver.findElement(By.cssSelector("[aria-label='Estado']"));
        optionState.click();
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='terminado']")));
        WebElement optionStateSelect = driver.findElement(By.xpath(".//*[text()='terminado']"));
        optionStateSelect.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Vendedor']")));
        WebElement optionSeller = driver.findElement(By.cssSelector("[aria-label='Vendedor']"));
        optionSeller.click();
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Avraham Reichik']")));
        WebElement optionSellerSelect = driver.findElement(By.xpath(".//*[text()='Avraham Reichik']"));
        optionSellerSelect.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Tipo de acabado']")));
        WebElement optionTypeFinish = driver.findElement(By.cssSelector("[aria-label='Tipo de acabado']"));
        optionTypeFinish.click();
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Poro Cerrado']")));
        WebElement optionTypeFinishSelect = driver.findElement(By.xpath(".//*[text()='Poro Cerrado']"));
        optionTypeFinishSelect.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Tipo de orden']")));
        WebElement optionTypeOrder = driver.findElement(By.cssSelector("[aria-label='Tipo de orden']"));
        optionTypeOrder.click();
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='(M) Externa Exportacion']")));
        WebElement optionTypeOrderSelect = driver.findElement(By.xpath(".//*[text()='(M) Externa Exportacion']"));
        optionTypeOrderSelect.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Cantidad']")));
        WebElement optionVenesta = driver.findElement(By.cssSelector("[aria-label='Cantidad']"));
        optionVenesta.click();
        optionVenesta.sendKeys("Fina");
        }
}
