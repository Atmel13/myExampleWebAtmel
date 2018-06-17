package com.it.Helpers;

import com.it.Pages.LoginPage;
import com.it.Utils.Users.User;
import org.apache.log4j.PropertyConfigurator;


public class LoginHelper extends LoginPage {



   public void login(User user) {

       log.info(String.format("User login: userName -%s, password -%s", user.getLogin(), user.getPassword()));
       login(user.getLogin(),user.getPassword());
   }
}
