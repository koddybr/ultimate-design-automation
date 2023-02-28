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

public class Inventory {
    public static void main(String [] args){
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

        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Insumos']")));
        WebElement optionSupplyMenu = driver.findElement(By.xpath(".//*[text()='Insumos']"));
        optionSupplyMenu.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Nuevo']")));
        WebElement buttonNew = driver.findElement(By.xpath(".//*[text()='Nuevo']"));
        buttonNew.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Code']")));
        WebElement optionCode = driver.findElement(By.cssSelector("[aria-label='Code']"));
        optionCode.click();
        optionCode.sendKeys(uuidString);


        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Tipo']")));
        WebElement optionType = driver.findElement(By.cssSelector("[aria-label='Tipo']"));
        optionType.click();
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Material de Maquinado']")));
        WebElement optionTypeOption = driver.findElement(By.xpath(".//*[text()='Material de Maquinado']"));
        optionTypeOption.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Familia']")));
        WebElement optionFamily = driver.findElement(By.cssSelector("[aria-label='Familia']"));
        optionFamily.click();
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Puerta Contraplacada']")));
        WebElement optionFamilyDoor = driver.findElement(By.xpath(".//*[text()='Puerta Contraplacada']"));
        optionFamilyDoor.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Unidad']")));
        WebElement optionUnit = driver.findElement(By.cssSelector("[aria-label='Unidad']"));
        optionUnit.click();
        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='cm']")));
        WebElement optionUnitOption = driver.findElement(By.xpath(".//*[text()='cm']"));
        optionUnitOption.click();



        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Stock mínimo']")));
        WebElement optionStock = driver.findElement(By.cssSelector("[aria-label='Stock mínimo']"));
        optionStock.click();
        optionStock.sendKeys("10");

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Descripción']")));
        WebElement optionDescription = driver.findElement(By.cssSelector("[aria-label='Descripción']"));
        optionDescription.click();
        optionDescription.sendKeys("producto acabado");

        //await.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[aria-label='Activo'][type='checkbox']")));
        WebElement optionActive = driver.findElement(By.cssSelector("[aria-label='Activo'][type='checkbox']"));
        WebElement parentElement = optionActive.findElement(By.xpath(".."));
        parentElement.click();




        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Compra de Insumos']")));
        WebElement optionBuySupplyMenu = driver.findElement(By.xpath(".//*[text()='Compra de Insumos']"));
        optionBuySupplyMenu.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Nuevo']")));
        WebElement buttonNewBuy = driver.findElement(By.xpath(".//*[text()='Nuevo']"));
        buttonNewBuy.click();

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Cantidad']")));
        WebElement optionQuantity = driver.findElement(By.cssSelector("[aria-label='Cantidad']"));
        optionQuantity.click();
        optionQuantity.sendKeys("200");

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Precio']")));
        WebElement optionPrice = driver.findElement(By.cssSelector("[aria-label='Precio']"));
        optionPrice.click();
        optionPrice.sendKeys("100");

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Precio']")));
        WebElement optionTotal = driver.findElement(By.cssSelector("[aria-label='Precio']"));
        optionTotal.click();
        optionPrice.sendKeys("500");

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Pagado']")));
        WebElement optionPid = driver.findElement(By.cssSelector("[aria-label='Pagado']"));
        optionPid.click();
        optionPid.sendKeys("50");

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Documento']")));
        WebElement optionDocument = driver.findElement(By.cssSelector("[aria-label='Documento']"));
        optionDocument.click();
        optionDocument.sendKeys("Entregado");

        await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Descripcion']")));
        WebElement optionDescriptionBuy = driver.findElement(By.cssSelector("[aria-label='Descripcion']"));
        optionDescriptionBuy.click();
        optionDescriptionBuy.sendKeys("Completado");





        await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Traspasos']")));
        WebElement optionTransferMenu = driver.findElement(By.xpath(".//*[text()='Traspasos']"));
        optionTransferMenu.click();


    }
}

