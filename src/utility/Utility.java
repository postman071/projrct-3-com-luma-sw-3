package utility;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility extends BaseTest
{
    /**
     * This Method will Click on element
     */
    public void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }
    /**
     * This method will get text from element
     */
    public String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }
    /**
     * This method will send text from element
     */
    public void sendTextToElement(By by,String text)
    {
        driver.findElement(by).sendKeys(text);
    }
    /**
     * This method will select the option by visible text
     */
    public void selectByVisibleTextFromDropDown(By by,String text)
    {
        WebElement dropDown=driver.findElement(by);
        Select select=new Select(dropDown);
        select.selectByVisibleText(text);
    }
    /**
     * This method will select the option by visible value
     */
    public void selectByValueFromDropDown(By by,String value)
    {
        WebElement dropDown=driver.findElement(by);
        Select select=new Select(dropDown);
        select.selectByVisibleText(value);
    }
}
