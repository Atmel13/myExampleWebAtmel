package com.it.Tests;

import com.it.Pages.DashboardPage;
import com.it.Pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {

    @Test (enabled = true)
    public void testWeb1(){
        app.login.login(validUser);
        String userEmail = app.dashboard.getUserEmail();
        Assert.assertEquals(userEmail.split("@")[0], "ittest2");
        //app.common.closeApp();

    }

    @Test (enabled = true, dependsOnMethods = "testWeb1")
    public void testWeb2() throws InterruptedException {

        app.dashboard.sendEmail(randomEmail);
        String successSent = app.dashboard.getEmailStatus().getText();
     //   Assert.assertEquals(successSent, "Письмо отправлено адресатам", "Что то пошло не так...");

        Assert.assertTrue(app.mailinator.getMailinatorEmail(randomEmail).contains(randomEmail.getEmailBody()),
                "Тест отправленного письма не содержится в полученном письме");

    }

}
