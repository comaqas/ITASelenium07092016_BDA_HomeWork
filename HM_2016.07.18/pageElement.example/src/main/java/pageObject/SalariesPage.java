package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SalariesPage {
    private static final By SALARY_IN_IT_TEXT = By.cssSelector(".input.info-count>h3");

    public static boolean isSalaryTextPresent(WebDriver driver){
        WebElement salaryInItText = driver.findElement(SALARY_IN_IT_TEXT);

        if(!salaryInItText.getText().equals("Зарплата в ИТ")){
            return false;
        }
        return true;
    }
}
