package com.it.Pages;

import com.it.Common.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class mailinatorPage extends BasePage {

	@FindBy(id="inboxfield")
	private WebElement emailField;


    public void openInboxFolder (String recipient) throws InterruptedException {

        driver.get(Constants.mailinator);
        System.out.println("Открыли mailinator");
        emailField.sendKeys(recipient);
        emailField.sendKeys(Keys.ENTER);

        Thread.sleep(3000);

    }

    public void openEmail (String subject) {

        driver.findElement(By.xpath("//*[@id = 'inboxpane']//div[contains(@class, 'all_message-min_text')][contains(., '"
                + subject + "')]")).click();

    }

    public String getEmailBody () throws InterruptedException {

        driver.switchTo().frame(driver.findElement(By.id("msg_body")));
        Thread.sleep(2000);
        return driver.findElement(By.xpath("//body")).getText();


    }










}
