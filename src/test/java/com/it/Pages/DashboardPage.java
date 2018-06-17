package com.it.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage  extends  BasePage{
	@FindBy(xpath="//span[@class = 'sn_menu_title']")
	private WebElement userEmail;

	public String getUserEmail(){
		return   userEmail.getText();
	}

	@FindBy(xpath="//p[@class = 'make_message']/a[contains(@href, 'compose')]")
	private WebElement createEmailButtonInLeftPanel;

	@FindBy(id="to")
	private WebElement recipientField;

	@FindBy(name = "subject")
	private WebElement subjectField;

	@FindBy(id = "text")
	private WebElement bodyField;

	@FindBy(xpath = "//p[@class = 'send_container']//input[@name= 'send']")
	private WebElement sendEmailButton;

	public void sendEmail (String email, String subject, String body) {

		createEmailButtonInLeftPanel.click();
		recipientField.sendKeys(email);
		subjectField.sendKeys(subject);
		bodyField.sendKeys(body);
		sendEmailButton.click();

	}

	public WebElement getEmailStatus() {
		return emailStatus;
	}

	@FindBy(xpath = "//div[@class = 'block_confirmation']/div[@class = 'content clear']")
	private WebElement emailStatus;








}
