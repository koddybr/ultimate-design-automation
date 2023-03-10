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

public class Obra {
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

            await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Obras']")));
            WebElement optionSupplyMenu = driver.findElement(By.xpath(".//*[text()='Obras']"));
            optionSupplyMenu.click();

            await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Nuevo']")));
            WebElement buttonNew = driver.findElement(By.xpath(".//*[text()='Nuevo']"));
            buttonNew.click();



            await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Nombre']")));
            WebElement optionName = driver.findElement(By.cssSelector("[aria-label='Nombre']"));
            optionName.click();
            optionName.sendKeys("Gustabo");

            await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Cliente']")));
            WebElement optionCustomer = driver.findElement(By.cssSelector("[aria-label='Cliente']"));
            optionCustomer.click();
            await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='Constec-Rubau SRL']")));
            WebElement optionCustomerSelect = driver.findElement(By.xpath(".//*[text()='Constec-Rubau SRL']"));
            optionCustomerSelect.click();

//            await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Estado']")));
//            WebElement optionState = driver.findElement(By.cssSelector("[aria-label='Estado']"));
//            optionState.click();
//            await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[text()='activo']")));
//            WebElement optionStateSelect = driver.findElement(By.xpath(".//*[text()='activo']"));
//            optionStateSelect.click();


//            await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Estado']")));
//            WebElement optionState = driver.findElement(By.cssSelector("[aria-label='Estado']"));
//            optionState.click();
//            await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//a[contains(text(), 'Activo') ]")));
//            WebElement optionStateSelect = driver.findElement(By.xpath(".//a[contains(text(), 'Activo')]"));
//            optionStateSelect.click();

            await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Costo']")));
            WebElement optionCost = driver.findElement(By.cssSelector("[aria-label='Costo']"));
            optionCost.click();
            optionCost.sendKeys("100");

            await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Fecha de incio']")));
            WebElement optionCalendar = driver.findElement(By.cssSelector("[aria-label='Fecha de incio']"));
            optionCalendar.click();
            await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[text()='8']")));
            WebElement optionCalendarSelect = driver.findElement(By.xpath(".//div[text()='8']"));
            optionCalendarSelect.click();

            await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Fecha de fin']")));
            WebElement optionCalendarFinish = driver.findElement(By.cssSelector("[aria-label='Fecha de fin']"));
            optionCalendarFinish.click();
            await.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//div[text()='20']")));
            WebElement optionCalendarFinishSelect = driver.findElement(By.xpath(".//div[text()='20']"));
            optionCalendarFinishSelect.click();

            await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Dirección']")));
            WebElement optionAddress = driver.findElement(By.cssSelector("[aria-label='Dirección']"));
            optionAddress.click();
            optionAddress.sendKeys("La Paz");

            await.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-label='Descripción']")));
            WebElement optionDescription = driver.findElement(By.cssSelector("[aria-label='Descripción']"));
            optionDescription.click();
            optionCalendar.sendKeys("Completado");

        }
}

// SI CORRE TOD MENOS     ESTADO   Y   NO SE ENCRIBE NAD A EN DIRECCION







