package pages.factory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import java.util.List;


public class FactoryMailRuInboxPage {



    @FindBy (xpath = "//span[text()='Входящие']")
    private WebElement INBOXMAILMENU;

    @FindBy (xpath = "//div[@data-name='next']")
    private WebElement TURNPAGEBUTTON;


    public void SelectInboxMenu() {
        INBOXMAILMENU.click();

    }
    public void MailCalculator(WebDriver driver){
        int page = 0;
        while(true){
            List<WebElement> LetterCountCalc = driver.findElements(By.xpath("//div[@data-bem='b-datalist__item']"));
            System.out.println("The " + page + " page is contains " +LetterCountCalc.size() + " letters");
            page++;
            if (!TURNPAGEBUTTON.getAttribute("class").contains("b-toolbar__btn_disabled")) {
               TURNPAGEBUTTON.click();
            } else {
                break;
            }

        }
    }

}
